package com.companimal.report.controller;

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
    public void delete() {
        int code = 1;

        if (reportService.delete(code)) {
            System.out.println("삭제에 성공했습니다.");
        } else
            System.out.println("삭제에 실패했습니다.");
    }
}
