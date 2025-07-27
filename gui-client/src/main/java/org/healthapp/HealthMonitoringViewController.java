package org.healthapp;

import org.healthapp.HeartRateGrpcClientService;
import org.healthapp.StepCountGrpcClientService;
import org.healthapp.heartrate.HeartRateLogResponse;
import org.healthapp.heartrate.PatientResponse;
import org.healthapp.stepcount.StepCountLogResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class HealthMonitoringViewController {
    private final HeartRateGrpcClientService heartRateService;
    private final StepCountGrpcClientService stepCountService;

    public HealthMonitoringViewController(HeartRateGrpcClientService heartRateService, StepCountGrpcClientService stepCountService) {
        this.heartRateService = heartRateService;
        this.stepCountService = stepCountService;
    }

    @GetMapping("/healthmonitoring")
    public String healthMonitoringPage(@RequestParam(value = "patientId", required = false) Integer patientId, Model model) {
        List<PatientResponse> patients = heartRateService.getAllPatients();
        model.addAttribute("patients", patients);
        if (patientId != null) {
            HeartRateLogResponse latestHeartRate = heartRateService.getLatestLog(patientId);
            List<HeartRateLogResponse> heartRateHistory = heartRateService.getHeartRateHistory(patientId);
            StepCountLogResponse latestStepCount = stepCountService.getLatestLog(patientId);
            List<StepCountLogResponse> stepCountHistory = stepCountService.getStepHistory(patientId);
            model.addAttribute("latestHeartRate", latestHeartRate);
            model.addAttribute("heartRateHistory", heartRateHistory);
            model.addAttribute("latestStepCount", latestStepCount);
            model.addAttribute("stepCountHistory", stepCountHistory);
        }
        return "healthmonitoring";
    }
}

