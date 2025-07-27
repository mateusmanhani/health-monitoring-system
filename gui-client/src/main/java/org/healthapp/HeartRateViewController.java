package org.healthapp;

import org.healthapp.HeartRateGrpcClientService;
import org.healthapp.dto.HeartRateLogDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class HeartRateViewController {
    private final HeartRateGrpcClientService heartRateService;

    public HeartRateViewController(HeartRateGrpcClientService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @GetMapping("/heartrate")
    public String heartratePage(@RequestParam(value = "patientId", required = false) Integer patientId, Model model) {
        List<org.healthapp.heartrate.PatientResponse> patients = heartRateService.getAllPatients();
        model.addAttribute("patients", patients);
        if (patientId != null) {
            org.healthapp.heartrate.HeartRateLogResponse latestLog = heartRateService.getLatestLog(patientId);
            List<org.healthapp.heartrate.HeartRateLogResponse> history = heartRateService.getHeartRateHistory(patientId);
            model.addAttribute("latestLog", latestLog);
            model.addAttribute("history", history);
        }
        return "heartrate";
    }
}
