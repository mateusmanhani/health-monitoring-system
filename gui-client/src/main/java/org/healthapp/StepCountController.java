package org.healthapp;

import org.healthapp.StepCountGrpcClientService;
import org.healthapp.stepcount.StepCountResponse;
import org.healthapp.stepcount.StepCountLogResponse;
import org.healthapp.dto.StepCountDto;
import org.healthapp.dto.StepCountLogDto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/step-count")
public class StepCountController {
    private final StepCountGrpcClientService stepCountService;

    public StepCountController(StepCountGrpcClientService stepCountService) {
        this.stepCountService = stepCountService;
    }

    @GetMapping("/current/{patientId}")
    public StepCountDto getCurrentStepCount(@PathVariable("patientId") int patientId) {
        StepCountResponse proto = stepCountService.getLatestStepCount(patientId);
        if (proto == null) return null;
        return new StepCountDto(
            proto.getSteps(),
            proto.getTimestamp(),
            proto.getPatientName()
        );
    }

    @GetMapping("/history/{patientId}")
    public List<StepCountLogDto> getStepHistory(@PathVariable("patientId") int patientId) {
        List<StepCountLogResponse> protoLogs = stepCountService.getStepHistory(patientId);
        List<StepCountLogDto> dtos = new java.util.ArrayList<>();
        for (StepCountLogResponse log : protoLogs) {
            dtos.add(new StepCountLogDto(log.getSteps(), log.getTimestamp()));
        }
        return dtos;
    }
}
