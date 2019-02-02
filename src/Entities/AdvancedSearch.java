package Entities;

import java.sql.Timestamp;

public class AdvancedSearch {
    public boolean source;  //true for domestic, false for imported
    public String serialNumber;
    public AlcoholType alcoholType;
    public String brandName;
    public String fancifulName;
    //wine only
    public int vintageYear;
    public float pH;
    public String grapeVarietal;
    public String appellation;
    //typeOfApplication
    public Timestamp timestamp;
    public int ttbID;
    public int numResults;

    public AdvancedSearch(boolean source, String serialNumber, AlcoholType alcoholType, String brandName, String fancifulName, int vintageYear, float pH, String grapeVarietal, String appellation, Timestamp timestamp, int ttbID, int numResults) {
        this.source = source;
        this.serialNumber = serialNumber;
        this.alcoholType = alcoholType;
        this.brandName = brandName;
        this.fancifulName = fancifulName;
        this.vintageYear = vintageYear;
        this.pH = pH;
        this.grapeVarietal = grapeVarietal;
        this.appellation = appellation;
        this.timestamp = timestamp;
        this.ttbID = ttbID;
        this.numResults = numResults;
    }

    public AdvancedSearch() {
        this.source = true;
        this.serialNumber = null;
        this.alcoholType = null;
        this.brandName = null;
        this.fancifulName = null;
        this.vintageYear = 0;
        this.pH = 0;
        this.grapeVarietal = null;
        this.appellation = null;
        this.timestamp = null;
        this.ttbID = 0;
        this.numResults = 0;
    }

    public boolean isSource() {
        return source;
    }

    public void setSource(boolean source) {
        this.source = source;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public AlcoholType getAlcoholType() {
        return alcoholType;
    }

    public void setAlcoholType(AlcoholType alcoholType) {
        this.alcoholType = alcoholType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFancifulName() {
        return fancifulName;
    }

    public void setFancifulName(String fancifulName) {
        this.fancifulName = fancifulName;
    }

    public int getVintageYear() {
        return vintageYear;
    }

    public void setVintageYear(int vintageYear) {
        this.vintageYear = vintageYear;
    }

    public float getpH() {
        return pH;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public String getGrapeVarietal() {
        return grapeVarietal;
    }

    public void setGrapeVarietal(String grapeVarietal) {
        this.grapeVarietal = grapeVarietal;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getTtbID() {
        return ttbID;
    }

    public void setTtbID(int ttbID) {
        this.ttbID = ttbID;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }
}
