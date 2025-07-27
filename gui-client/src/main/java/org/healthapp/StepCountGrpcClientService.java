package org.healthapp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.healthapp.stepcount.StepCountServiceGrpc;
import org.healthapp.stepcount.StepCountRequest;
import org.healthapp.stepcount.StepCountResponse;
import org.healthapp.stepcount.StepCountLogResponse;
import org.springframework.stereotype.Service;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StepCountGrpcClientService {
    private StepCountServiceGrpc.StepCountServiceBlockingStub blockingStub;

    public StepCountGrpcClientService() {
        ServiceInfo info = JmDnsServiceDiscovery.discoverService("_grpc._tcp.local.", "StepCountService");
        if (info != null) {
            String host = info.getHostAddresses()[0];
            int port = info.getPort();
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
            blockingStub = StepCountServiceGrpc.newBlockingStub(channel);
        } else {
            System.err.println("StepCountService not found via jmDNS!");
        }
    }

    public StepCountResponse getLatestStepCount(int patientId) {
        if (blockingStub == null) return null;
        StepCountRequest request = StepCountRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        return blockingStub.getSteps(request);
    }

    public List<StepCountLogResponse> getStepHistory(int patientId) {
        List<StepCountLogResponse> logs = new ArrayList<>();
        if (blockingStub == null) return logs;
        StepCountRequest request = StepCountRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        Iterator<StepCountLogResponse> iterator = blockingStub.streamSteps(request);
        iterator.forEachRemaining(logs::add);
        return logs;
    }

    // Add getAllPatients method for use in MVC controller
    public List<org.healthapp.heartrate.PatientResponse> getAllPatients() {
        // Reuse HeartRateGrpcClientService for patient list, assuming same patients for both services
        HeartRateGrpcClientService heartRateService = new HeartRateGrpcClientService();
        return heartRateService.getAllPatients();
    }

    // Add getLatestLog for MVC controller
    public StepCountLogResponse getLatestLog(int patientId) {
        List<StepCountLogResponse> logs = getStepHistory(patientId);
        if (logs.isEmpty()) return null;
        return logs.get(logs.size() - 1);
    }
}
