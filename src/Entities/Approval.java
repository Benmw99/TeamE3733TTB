package Entities;


import java.util.Date;

public class Approval {

    private boolean aproved;
    private Date timestamp;
    private Agent agentApproval;
    private Date expDate;
    private String qualifications;

    public Approval(boolean aproved, Date timestamp, Agent agentApproval, Date expDate, String qualifications) {
        this.aproved = aproved;
        this.timestamp = timestamp;
        this.agentApproval = agentApproval;
        this.expDate = expDate;
        this.qualifications = qualifications;
    }

    public boolean isAproved() {
        return aproved;
    }

    public void setAproved(boolean aproved) {
        this.aproved = aproved;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Agent getAgentApproval() {
        return agentApproval;
    }

    public void setAgentApproval(Agent agentApproval) {
        this.agentApproval = agentApproval;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}

