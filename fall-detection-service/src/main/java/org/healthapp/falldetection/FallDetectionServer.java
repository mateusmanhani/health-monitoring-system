package org.healthapp.falldetection;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.healthapp.falldetection.service.FallDetectionServiceImpl;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class FallDetectionServer {
    public static void main(String[] args) throws Exception {
        int port = 50053; // Unique port for fall detection service
        Server server = ServerBuilder.forPort(port)
                .addService(new FallDetectionServiceImpl())
                .build();

        // jmDNS service registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "FallDetectionService", port, "path=/falldetection");
        jmdns.registerService(serviceInfo);
        System.out.println("FallDetectionService registered with jmDNS on port " + port);

        System.out.println("FallDetectionService gRPC server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}

