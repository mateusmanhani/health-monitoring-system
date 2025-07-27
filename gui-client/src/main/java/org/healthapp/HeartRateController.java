package org.healthapp;

import org.healthapp.HeartRateGrpcClientService;
import org.healthapp.dto.HeartRateDto;
import org.healthapp.dto.HeartRateLogDto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/heart-rate")
public class HeartRateController {
    private final HeartRateGrpcClientService heartRateService;

    public HeartRateController(HeartRateGrpcClientService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @GetMapping("/current/{patientId}")
    public HeartRateDto getCurrentHeartRate(@PathVariable("patientId") int patientId) {
        org.healthapp.heartrate.HeartRateResponse proto = heartRateService.getHeartRate(patientId);
        if (proto == null) return null;
        return new HeartRateDto(
            proto.getBpm(),
            proto.getTimestamp(),
            proto.getStatus(),
            proto.getPatientName()
        );
    }

    @GetMapping("/history/{patientId}")
    public List<HeartRateLogDto> getHeartRateHistory(@PathVariable("patientId") int patientId) {
        List<org.healthapp.heartrate.HeartRateLogResponse> protoLogs = heartRateService.getHeartRateHistory(patientId);
        List<HeartRateLogDto> dtos = new java.util.ArrayList<>();
        for (org.healthapp.heartrate.HeartRateLogResponse log : protoLogs) {
            dtos.add(new HeartRateLogDto(log.getBpm(), log.getTimestamp()));
        }
        return dtos;
    }
}
