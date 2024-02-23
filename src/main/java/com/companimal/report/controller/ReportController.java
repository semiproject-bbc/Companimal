package com.companimal.report.controller;

import com.companimal.report.model.dto.ReportDTO;
import com.companimal.report.model.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportController {

    private ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    public void registReport(ReportDTO newReport) {

        reportService.registReport(newReport);

    }

}
