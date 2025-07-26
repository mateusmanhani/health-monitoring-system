package org.healthapp;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class StepCountServer {
    public static void main(String[] args) throws Exception {
        int port = 50052; // Use a different port from heart-rate-service
        StepCountLogService logService = new StepCountLogService();
        StepCountGrpcService grpcService = new StepCountGrpcService(logService);
        Server server = ServerBuilder.forPort(port)
                .addService(grpcService)
                .build();
        System.out.println("StepCountService gRPC server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}

