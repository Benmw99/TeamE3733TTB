package Entities;


import java.sql.Timestamp;

public class Approval {

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
}

