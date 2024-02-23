package com.companimal.report.model.service;

import com.companimal.report.model.dao.ReportMapper;
import com.companimal.report.model.dto.ReportDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class ReportService {

    private ReportMapper reportMapper;
    private SqlSessionTemplate sqlSession;

    public ReportService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Transactional
    public void registReport(ReportDTO newReport) {
//        reportMapper.registReport(newReport);
        sqlSession.getMapper(ReportMapper.class).registReport(newReport);

    }

    public ReportDTO registReportExample() {

        ReportDTO newReport = new ReportDTO();

        newReport.setRepNo(1);
        newReport.setRepTitle("신고합니다.");
        newReport.setRepDate(Date.valueOf("2024-02-20"));
        newReport.setRepReason("댓글로 욕설과 농락을 했습니다. 확인 후 적절한 조치 부탁드립니다.");
        newReport.setRepResult("진행중");
        newReport.setRepPerson("azizzang");
        newReport.setRepDep("댓글");

        return newReport;
    }
}
