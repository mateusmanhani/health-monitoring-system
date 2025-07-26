package org.healthapp.heartrate;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.healthapp.heartrate.service.HeartRateServiceImpl;

public class HeartRateServer {
    public static void main(String[] args) throws Exception {
        int port = 50051; // You can change this port if needed
        Server server = ServerBuilder.forPort(port)
                .addService(new HeartRateServiceImpl())
                .build();
        System.out.println("HeartRateService gRPC server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}

