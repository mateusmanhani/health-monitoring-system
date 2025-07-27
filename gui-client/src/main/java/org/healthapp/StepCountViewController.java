package org.healthapp;

import org.healthapp.StepCountGrpcClientService;
import org.healthapp.dto.StepCountLogDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class StepCountViewController {
    private final StepCountGrpcClientService stepCountService;

    public StepCountViewController(StepCountGrpcClientService stepCountService) {
        this.stepCountService = stepCountService;
    }

    @GetMapping("/stepcount")
    public String stepcountPage(@RequestParam(value = "patientId", required = false) Integer patientId, Model model) {
        List<org.healthapp.heartrate.PatientResponse> patients = stepCountService.getAllPatients();
        model.addAttribute("patients", patients);
        if (patientId != null) {
            org.healthapp.stepcount.StepCountLogResponse latestLog = stepCountService.getLatestLog(patientId);
            List<org.healthapp.stepcount.StepCountLogResponse> history = stepCountService.getStepHistory(patientId);
            model.addAttribute("latestLog", latestLog);
            model.addAttribute("history", history);
        }
        return "stepcount";
    }
}
