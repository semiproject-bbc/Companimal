package com.companimal.report.model.service;

import com.companimal.report.model.dao.ReportMapper;
import com.companimal.report.model.dto.ReportDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportService {

    private ReportMapper reportMapper;

    @Transactional
    public void registReport(ReportDTO newReport) {
        reportMapper.registReport(newReport);
    }
}
