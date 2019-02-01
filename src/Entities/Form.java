package Entities;

import java.sql.Timestamp;

public class Form {
    private String fancifulName;
    public String brandName;
    private boolean source;
    private String repID;
    private int ttbID;
    private String email;
    private Timestamp dateSubmitted;
    private String applicantName;
    private String phoneNum;
    private AlcoholType alcoholType;
    private String otherInfo;
    private String brewersPermit;
    private Approval approval;

    public Form(String fancifulName, String brandName, boolean source, String repID, int ttbID, String email, Timestamp dateSubmitted, String applicantName, String phoneNum, AlcoholType alcoholType, String otherInfo, String brewersPermit, Approval approval) {
        this.fancifulName = fancifulName;
        this.brandName = brandName;
        this.source = source;
        this.repID = repID;
        this.ttbID = ttbID;
        this.email = email;
        this.dateSubmitted = dateSubmitted;
        this.applicantName = applicantName;
        this.phoneNum = phoneNum;
        this.alcoholType = alcoholType;
        this.otherInfo = otherInfo;
        this.brewersPermit = brewersPermit;
        this.approval = approval;
    }
}
