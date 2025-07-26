package org.healthapp;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class StepCountApp {

    public static void main(String[] args) throws InterruptedException, IOException {
        ConfigurableApplicationContext context = SpringApplication.run(StepCountApp.class, args);

        StepCountLogService stepCountLogService = context.getBean(StepCountLogService.class);

        Server server = ServerBuilder
                .forPort(50052)
                .addService(new StepCountGrpcService(stepCountLogService))
                .build()
                .start();

        System.out.println("✅ Steps gRPC server started on port 50052");
        server.awaitTermination();
    }
}
