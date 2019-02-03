package Entities;

import java.lang.*;
import java.sql.Timestamp;
import java.util.Calendar;

public class Approval {

    private ApprovalStatus page1;
    private ApprovalStatus page2;
    private ApprovalStatus page3;

    private boolean approved;
    private Timestamp timestamp;
    private String agentApprovalName;
    private Timestamp expDate;
    private String qualifications;

    public Approval(boolean approved, Timestamp timestamp, String agentApprovalName, Timestamp expDate, String qualifications) {
        this.approved = approved;
        this.timestamp = timestamp;
        this.agentApprovalName = agentApprovalName;
        this.expDate = expDate;
        this.qualifications = qualifications;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getAgentApprovalName() {
        return agentApprovalName;
    }

    public void setAgentApprovalName(String agentApprovalName) {
        this.agentApprovalName = agentApprovalName;
    }

    public Timestamp getExpDate() {
        return expDate;
    }

    public void setExpDate(Timestamp expDate) {
        this.expDate = expDate;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

//methods n the lot

    public void approve(String name, String qualifications){
        agentApprovalName = name;
        this.qualifications = qualifications;
        this.approved = true;
        Calendar Cal = Calendar.getInstance();

        java.util.Date now = Cal.getTime();
        java.sql.Timestamp currTime = new java.sql.Timestamp(now.getTime());
        this.timestamp = currTime;

        Cal.add(Calendar.YEAR, 2);
        java.util.Date expire = Cal.getTime();
        java.sql.Timestamp expirationDate = new java.sql.Timestamp(expire.getTime());
        this.expDate = expirationDate;

    }}

