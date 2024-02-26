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

    @GetMapping("/regist")
    public void registReport(ReportDTO newReport) {

        newReport.setRepTitle("신고합니다.");
        newReport.setRepDate(Date.valueOf("2024-02-25"));
        newReport.setRepReason("댓글로 농락했습니다. 적절한 조취 부탁드립니다!!!");
        newReport.setRepResult("진행중");
        newReport.setRepPerson("azizzang");
        newReport.setRepDep("댓글");
        reportService.registReport(newReport);
    }

    @GetMapping("/update")
    public void updateReport(ReportDTO updateReport) {

        int num = 1;
        String updateResult = "삭제 승인";

        updateReport.setRepNo(num);
        updateReport.setRepResult(updateResult);

        reportService.updateReport(updateReport);
    }

    @GetMapping("/delete")
    public void deleteReport() {

        int num = 2;

        reportService.deleteReport(num);
    }

}
