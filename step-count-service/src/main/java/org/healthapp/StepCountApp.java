package org.healthapp;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.healthapp.service.HeartRateGrpcController;
import org.healthapp.service.HeartRateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class StepCountApp {

    public static void main(String[] args) throws InterruptedException, IOException {
        ConfigurableApplicationContext context = SpringApplication.run(StepCountApp.class, args);

        HeartRateService heartRateService = context.getBean(HeartRateService.class);

        Server server = ServerBuilder
                .forPort(50051)
                .addService(new HeartRateGrpcController(heartRateService))
                .build()
                .start();

        System.out.println("✅ Steps gRPC server started on port 50051");
        server.awaitTermination();
    }
}
