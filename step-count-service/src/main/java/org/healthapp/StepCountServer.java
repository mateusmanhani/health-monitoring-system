package org.healthapp;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;
import org.healthapp.repository.InMemoryStepCountRepository;
import org.healthapp.stepcount.StepCountServiceGrpc;
import org.healthapp.stepcount.StepCountRequest;
import org.healthapp.stepcount.StepCountResponse;
import org.healthapp.stepcount.StepCountLogResponse;
import io.grpc.stub.StreamObserver;
import java.util.List;

public class StepCountServer {
    public static void main(String[] args) throws Exception {
        int port = 50052;
        InMemoryStepCountRepository repository = new InMemoryStepCountRepository();
        Server server = ServerBuilder.forPort(port)
                .addService(new StepCountServiceImpl(repository))
                .build();

        // jmDNS service registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "StepCountService", port, "path=/stepcount");
        jmdns.registerService(serviceInfo);
        System.out.println("StepCountService registered with jmDNS on port " + port);

        System.out.println("StepCountService gRPC server started on port " + port);
        server.start();
        server.awaitTermination();
    }

    // Minimal gRPC implementation using only the in-memory repository
    public static class StepCountServiceImpl extends StepCountServiceGrpc.StepCountServiceImplBase {
        private final InMemoryStepCountRepository repository;
        public StepCountServiceImpl(InMemoryStepCountRepository repository) {
            this.repository = repository;
        }
        @Override
        public void getSteps(StepCountRequest request, StreamObserver<StepCountResponse> responseObserver) {
            var log = repository.getLatestLogForPatient(request.getPatientId());
            if (log != null) {
                StepCountResponse response = StepCountResponse.newBuilder()
                        .setSteps(log.getSteps())
                        .setTimestamp(log.getTimestamp().toString())
                        .build();
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }
        @Override
        public void streamSteps(StepCountRequest request, StreamObserver<StepCountLogResponse> responseObserver) {
            List<org.healthapp.entity.StepCountLog> logs = repository.getLogsForPatient(request.getPatientId());
            for (org.healthapp.entity.StepCountLog log : logs) {
                StepCountLogResponse resp = StepCountLogResponse.newBuilder()
                        .setPatientId(request.getPatientId())
                        .setSteps(log.getSteps())
                        .setTimestamp(log.getTimestamp().toString())
                        .build();
                responseObserver.onNext(resp);
            }
            responseObserver.onCompleted();
        }
    }
}
