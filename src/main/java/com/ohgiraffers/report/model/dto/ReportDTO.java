package com.ohgiraffers.report.model.dto;


import java.sql.Date;

public class ReportDTO {

    private int repNo;              // 신고 번호
    private String repTitle;        // 신고 제목
    private Date repDate;           // 신고 날짜
    private String repReason;       // 신고 사유
    private String repResult;       // 신고 결과
    private String repPerson;       // 신고 회원
    private String repDep;          // 신고 종류
}
