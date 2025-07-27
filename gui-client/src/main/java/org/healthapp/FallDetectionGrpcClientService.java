package org.healthapp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.healthapp.dto.FallDetectionDto;
import org.healthapp.falldetection.FallDetectionRequest;
import org.healthapp.falldetection.FallDetectionResponse;
import org.healthapp.falldetection.FallDetectionServiceGrpc;
import org.springframework.stereotype.Service;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.List;

@Service
public class FallDetectionGrpcClientService {
    private FallDetectionServiceGrpc.FallDetectionServiceBlockingStub blockingStub;

    public FallDetectionGrpcClientService() {
        ServiceInfo info = JmDnsServiceDiscovery.discoverService("_grpc._tcp.local.", "FallDetectionService");
        if (info != null) {
            String host = info.getHostAddresses()[0];
            int port = info.getPort();
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
            blockingStub = FallDetectionServiceGrpc.newBlockingStub(channel);
        } else {
            System.err.println("FallDetectionService not found via jmDNS!");
        }
    }

    public List<FallDetectionDto> getFallAlerts(int patientId) {
        List<FallDetectionDto> alerts = new ArrayList<>();
        if (blockingStub == null) return alerts;
        // For demo, just get a single alert (adapt as needed for streaming)
        FallDetectionRequest request = FallDetectionRequest.newBuilder()
                .setPatientId(patientId)
                .setAccelX(0)
                .setAccelY(0)
                .setAccelZ(0)
                .setTimestamp("")
                .build();
        FallDetectionResponse response = blockingStub.getLatestFallEvent(request);
        alerts.add(new FallDetectionDto(
                patientId,
                response.getMessage(),
                response.getTimestamp(),
                "Patient Name" // Replace with actual patient name if available
        ));
        return alerts;
    }
}
