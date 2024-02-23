package com.companimal.report.config;

import com.companimal.report.controller.ReportController;
import com.companimal.report.model.service.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.companimal.report")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
