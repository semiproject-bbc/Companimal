package com.companimal.report.controller;

import com.companimal.report.model.dto.ReportDTO;
import com.companimal.report.model.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Controller
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/list")
    public void getReportList(){
        System.out.println("--------------- check");
        List<ReportDTO> reportList = reportService.selectReportList();
        System.out.println("reportList = " + reportList);
    }


    public void registReport(ReportDTO newReport) {

//        newReport.setRepDep(1);

        reportService.registReport(newReport);
    }

}
