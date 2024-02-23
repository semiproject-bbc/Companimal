package com.companimal.report.model.dao;

import com.companimal.report.model.dto.ReportDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {

    void registReport(ReportDTO newReport);
}
