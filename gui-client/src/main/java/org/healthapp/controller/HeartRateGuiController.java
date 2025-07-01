package org.healthapp.controller;


import org.healthapp.HeartRateDTO;
import org.healthapp.HeartRateGrpcClientService;
import org.healthapp.heartrate.HeartRateLogResponse;
import org.healthapp.heartrate.HeartRateResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class HeartRateGuiController {

    private final HeartRateGrpcClientService grpcClient;

    public HeartRateGuiController(HeartRateGrpcClientService grpcClient) {
        this.grpcClient = grpcClient;
    }

    @GetMapping("/heartrate")
    public String getHeartRate(@RequestParam("patientId") Integer patientId, Model model) {
        model.addAttribute("patients", grpcClient.getAllPatients());

        if (patientId != null) {
            HeartRateResponse latest = grpcClient.getHeartRate(patientId);
            List<HeartRateLogResponse> responseList = grpcClient.getHeartRateHistory(patientId);

            List<HeartRateDTO> dtoList = responseList.stream()
                    .map(r -> new HeartRateDTO(r.getBpm(), r.getTimestamp()))
                    .collect(Collectors.toList());

            model.addAttribute("latestLog", latest);
            model.addAttribute("history", dtoList);
        }

        return "heartrate";
    }
}
