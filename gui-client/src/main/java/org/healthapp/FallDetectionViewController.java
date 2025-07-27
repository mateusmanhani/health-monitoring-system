//package org.healthapp;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import java.util.List;
//
//@Controller
//public class FallDetectionViewController {
//    private final FallDetectionGrpcClientService fallDetectionService;
//
//    public FallDetectionViewController(FallDetectionGrpcClientService fallDetectionService) {
//        this.fallDetectionService = fallDetectionService;
//    }
//
//    @GetMapping("/falldetection")
//    public String falldetectionPage(@RequestParam(value = "patientId", required = false) Integer patientId, Model model) {
//        List<org.healthapp.dto.PatientDto> patients = fallDetectionService.getAllPatients();
//        model.addAttribute("patients", patients);
//        if (patientId != null) {
//            var latestLog = fallDetectionService.getLatestLog(patientId);
//            var history = fallDetectionService.getHistory(patientId);
//            model.addAttribute("latestLog", latestLog);
//            model.addAttribute("history", history);
//        }
//        return "falldetection";
//    }
//}
//
