package org.healthapp.heartrate;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.healthapp.heartrate.service.HeartRateServiceImpl;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class HeartRateServer {
    public static void main(String[] args) throws Exception {
        int port = 50051; // You can change this port if needed
        Server server = ServerBuilder.forPort(port)
                .addService(new HeartRateServiceImpl())
                .build();

        // jmDNS service registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "HeartRateService", port, "path=/heartrate");
        jmdns.registerService(serviceInfo);
        System.out.println("HeartRateService registered with jmDNS on port " + port);

        System.out.println("HeartRateService gRPC server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}
