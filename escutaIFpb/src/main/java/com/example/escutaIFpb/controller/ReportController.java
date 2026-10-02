package com.example.escutaIFpb.controller;

import com.example.escutaIFpb.dto.ReportRequestDTO;
import com.example.escutaIFpb.entities.Report;
import com.example.escutaIFpb.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins="http://localhost:5173", allowedHeaders = "*")
@RestController
@RequestMapping("report")
public class ReportController {
    @Autowired
    private ReportRepository reportRepository;

    @PostMapping
    public void adicionarReport(@RequestBody ReportRequestDTO reportDTO){
        Report report = new Report(reportDTO);
        reportRepository.save(report);
    }
}
