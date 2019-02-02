package Entities;


import java.util.Date;

public class Form {


    //#######################################################################################################
    //                                  Instance Vars

    private String fancifulName;
    public String brandName;
    private boolean source;
    private String repID;
    private int ttbID;
    private String email;
    private Date dateSubmitted;
    private String applicantName;
    private String phoneNum;
    private AlcoholType alcoholType;
    private String otherInfo;
    private String brewersPermit;
    private Approval approval;

    //#######################################################################################################
    //                                  constructors

    public Form() {
        this.fancifulName = null;
        this.brandName = null;
        this.source = false;
        this.repID = null;
        this.ttbID = 0;
        this.email = null;
        this.dateSubmitted = null;
        this.applicantName = null;
        this.phoneNum = null;
        this.alcoholType = null;
        this.otherInfo = null;
        this.brewersPermit = null;
        this.approval = null;
    }

    public Form(String fancifulName, String brandName, boolean source, String repID, int ttbID, String email, Date dateSubmitted, String applicantName, String phoneNum, AlcoholType alcoholType, String otherInfo, String brewersPermit, Approval approval) {
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

    //#######################################################################################################
    //                                  getters and setters


    public String getFancifulName() {
        return fancifulName;
    }

    public void setFancifulName(String fancifulName) {
        this.fancifulName = fancifulName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isSource() {
        return source;
    }

    public void setSource(boolean source) {
        this.source = source;
    }

    public String getRepID() {
        return repID;
    }

    public void setRepID(String repID) {
        this.repID = repID;
    }

    public int getTtbID() {
        return ttbID;
    }

    public void setTtbID(int ttbID) {
        this.ttbID = ttbID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public AlcoholType getAlcoholType() {
        return alcoholType;
    }

    public void setAlcoholType(AlcoholType alcoholType) {
        this.alcoholType = alcoholType;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getBrewersPermit() {
        return brewersPermit;
    }

    public void setBrewersPermit(String brewersPermit) {
        this.brewersPermit = brewersPermit;
    }

    public Approval getApproval() {
        return approval;
    }

    public void setApproval(Approval approval) { this.approval = approval; }

    public boolean getSource(){ return this.source;}

    public void setSource(Boolean source) { this.source = source;}


    //#######################################################################################################
    //                                  Helper Functions



}
