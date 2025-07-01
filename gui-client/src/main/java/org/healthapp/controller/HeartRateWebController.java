package org.healthapp.controller;


import org.healthapp.HeartRateClientService;
import org.healthapp.heartrate.HeartRateResponse;
import org.healthapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HeartRateWebController {

    @Autowired
    PatientRepository patientRepository;

    private final HeartRateClientService grpcClient;

    public HeartRateWebController(HeartRateClientService grpcClient) {
        this.grpcClient = grpcClient;
    }

    @GetMapping("/heartrate")
    public String getHeartRate(@RequestParam("patientId") Integer patientId, Model model) {
        model.addAttribute("patients", patientRepository.findAll());

        if (patientId != null) {
            HeartRateResponse response = grpcClient.getHeartRate(patientId);
            model.addAttribute("latestLog", response);
        }

        return "heartrate";
    }
}
