package com.companimal.report.model.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {
    void delete(int code);
}
