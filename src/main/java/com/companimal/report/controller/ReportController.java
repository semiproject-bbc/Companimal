package com.companimal.report.controller;

import com.companimal.report.model.dto.ReportDTO;
import com.companimal.report.model.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.time.LocalDate;

@Controller
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    public void registReport(ReportDTO newReport) {

        reportService.registReport(newReport);
    }

}
