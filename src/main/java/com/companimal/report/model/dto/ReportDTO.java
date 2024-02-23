package com.companimal.report.model.dto;


import java.sql.Date;

public class ReportDTO implements java.io.Serializable {

    private int repNo;                  // 신고 번호
    private String repTitle;            // 신고 제목
    private Date repDate;   // 신고 날짜
    private String repReason;           // 신고 사유
    private String repResult;           // 신고 결과
    private String repPerson;           // 신고 회원 id
    private String repDep;              // 신고 종류

    public ReportDTO() {
    }

    public ReportDTO(int repNo, String repTitle, Date repDate, String repReason, String repResult, String repPerson, String repDep) {
        this.repNo = repNo;
        this.repTitle = repTitle;
        this.repDate = repDate;
        this.repReason = repReason;
        this.repResult = repResult;
        this.repPerson = repPerson;
        this.repDep = repDep;
    }

    public int getRepNo() {
        return repNo;
    }

    public void setRepNo(int repNo) {
        this.repNo = repNo;
    }

    public String getRepTitle() {
        return repTitle;
    }

    public void setRepTitle(String repTitle) {
        this.repTitle = repTitle;
    }

    public Date getRepDate() {
        return repDate;
    }

    public void setRepDate(Date repDate) {
        this.repDate = repDate;
    }

    public String getRepReason() {
        return repReason;
    }

    public void setRepReason(String repReason) {
        this.repReason = repReason;
    }

    public String getRepResult() {
        return repResult;
    }

    public void setRepResult(String repResult) {
        this.repResult = repResult;
    }

    public String getRepPerson() {
        return repPerson;
    }

    public void setRepPerson(String repPerson) {
        this.repPerson = repPerson;
    }

    public String getRepDep() {
        return repDep;
    }

    public void setRepDep(String repDep) {
        this.repDep = repDep;
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "repNo=" + repNo +
                ", repTitle='" + repTitle + '\'' +
                ", repDate=" + repDate +
                ", repReason='" + repReason + '\'' +
                ", repResult='" + repResult + '\'' +
                ", repPerson='" + repPerson + '\'' +
                ", repDep='" + repDep + '\'' +
                '}';
    }
}
