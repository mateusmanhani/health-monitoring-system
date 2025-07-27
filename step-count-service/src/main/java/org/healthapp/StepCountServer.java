package org.healthapp;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class StepCountServer {
    public static void main(String[] args) throws Exception {
        int port = 50052; // Use a different port from heart-rate-service
        StepCountLogService logService = new StepCountLogService();
        StepCountGrpcService grpcService = new StepCountGrpcService(logService);
        Server server = ServerBuilder.forPort(port)
                .addService(grpcService)
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
}
