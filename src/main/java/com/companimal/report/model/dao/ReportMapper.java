package com.companimal.report.model.dao;

import com.companimal.report.model.dto.ReportDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper {

    int registReport(ReportDTO newReport);

    List<ReportDTO> selectReportList();

    int deleteReport(int code);
}
