package com.companimal.report.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.companimal.report", annotationClass = Mapper.class)
public class MapperConfiguration {
}
