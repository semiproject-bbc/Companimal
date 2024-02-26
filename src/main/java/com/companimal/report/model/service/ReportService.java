package com.companimal.report.model.service;

import com.companimal.report.model.dao.ReportMapper;
import com.companimal.report.model.dto.ReportDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
public class ReportService {

    private ReportMapper reportMapper;

    @Autowired
    public ReportService(SqlSessionTemplate sqlSession, ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Transactional
    public void registReport(ReportDTO newReport) {

        int result = reportMapper.registReport(newReport);

        if(result > 0) {
            System.out.println("신고 등록을 성공하였습니다.");
        } else {
            System.out.println("신고 등록을 실패하였습니다.");
        }
    }

    public List<ReportDTO> selectReportList() {

        List<ReportDTO> reportList = reportMapper.selectReportList();
        System.out.println("reportList = " + reportList);
        return reportList;
    }

    @Transactional
    public void updateReport(ReportDTO updateReport) {

        int result =  reportMapper.updateReport(updateReport);

        if(result > 0) {
            System.out.println("신고 처리 수정을 성공하였습니다.");
        } else {
            System.out.println("신고 처리 수정을 실패하였습니다.");
        }
    }

    @Transactional
    public void deleteReport(int num) {

        int result =  reportMapper.deleteReport(num);

        if(result > 0) {
            System.out.println("신고 목록 삭제에 성공하였습니다.");
        } else {
            System.out.println("신고 목록 삭제에 실패하였습니다.");
        }
    }
}
