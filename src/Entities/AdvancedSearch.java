package Entities;

import java.sql.Timestamp;
import java.util.Objects;

public class AdvancedSearch {
    //Gotta be a Boolean so it can be null
    public Boolean source;  //true for domestic, false for imported
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
    //Number of results to return
    public int numResults;
    //Alcohol type but numeric for the DB
    public int type;

    public AdvancedSearch() {
        this.source = null;
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

    public Boolean isSource() {
        return source;
    }

    public void setSource(Boolean source) {
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
        int type = 0;
        if (alcoholType == AlcoholType.Wine) {
            type = 1;
        } else if (alcoholType == AlcoholType.MaltBeverage) {
            type = 2;
        } else if (alcoholType == AlcoholType.DistilledLiquor) {
            type = 3;
        }
        this.alcoholType = alcoholType;
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedSearch that = (AdvancedSearch) o;
        return vintageYear == that.vintageYear &&
                Float.compare(that.pH, pH) == 0 &&
                ttbID == that.ttbID &&
                numResults == that.numResults &&
                type == that.type &&
                Objects.equals(source, that.source) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                alcoholType == that.alcoholType &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(fancifulName, that.fancifulName) &&
                Objects.equals(grapeVarietal, that.grapeVarietal) &&
                Objects.equals(appellation, that.appellation) &&
                Objects.equals(timestamp, that.timestamp);
    }

}
