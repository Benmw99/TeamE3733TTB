package Entities;

public class FormMinimal {
    String ttbid;
    String alcType;
    String brandName;
    String manu;

    public FormMinimal(String ttbid, String alcType, String brandName, String manu) {
        this.ttbid = ttbid;
        this.alcType = alcType;
        this.brandName = brandName;
        this.manu = manu;
    }

    public String getTtbid() {
        return ttbid;
    }

    public void setTtbid(String ttbid) {
        this.ttbid = ttbid;
    }

    public String getAlcType() {
        return alcType;
    }

    public void setAlcType(String alcType) {
        this.alcType = alcType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }
}
