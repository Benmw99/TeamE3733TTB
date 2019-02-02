package Entities;


import java.sql.Timestamp;

public class Form {


    //#######################################################################################################
    //                                  Instance Vars

    private String repID;
    private String brewersPermit;
    private boolean source;  //true for domestic, false for imported
    private String serialNumber;
    private AlcoholType alcoholType;
    public String brandName;
    private String fancifulName;
    private Address address;
    private Address mailingAddress;
    private String formula;
    private WineFormItems wineFormItems;
    private String phoneNumber;
    private String email;
    //typeOfApplication
    private String blownBrandedEmbossedInfo;
    private Timestamp dateSubmitted;
    private int ttbID;
    private int companyID;
    private Approval approval;

    //#######################################################################################################
    //                                  constructors

    public Form(String repID, String brewersPermit, boolean source, String serialNumber, AlcoholType alcoholType, String brandName, String fancifulName, Address address, Address mailingAddress, String formula, WineFormItems wineFormItems, String phoneNumber, String email, String blownBrandedEmbossedInfo, Timestamp dateSubmitted, int ttbID, int companyID, Approval approval) {
        this.repID = repID;
        this.brewersPermit = brewersPermit;
        this.source = source;
        this.serialNumber = serialNumber;
        this.alcoholType = alcoholType;
        this.brandName = brandName;
        this.fancifulName = fancifulName;
        this.address = address;
        this.mailingAddress = mailingAddress;
        this.formula = formula;
        this.wineFormItems = wineFormItems;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.blownBrandedEmbossedInfo = blownBrandedEmbossedInfo;
        this.dateSubmitted = dateSubmitted;
        this.ttbID = ttbID;
        this.companyID = companyID;
        this.approval = approval;
    }


    public Form() {
        this.repID = null;
        this.brewersPermit = null;
        this.source = true;
        this.serialNumber = null;
        this.alcoholType = null;
        this.brandName = null;
        this.fancifulName = null;
        this.address = null;
        this.mailingAddress = null;
        this.formula = null;
        this.wineFormItems = null;
        this.phoneNumber = null;
        this.email = null;
        this.blownBrandedEmbossedInfo = null;
        this.dateSubmitted = null;
        this.ttbID = 0;
        this.companyID = 0;
        this.approval = null;
    }


    //#######################################################################################################
    //                                  getters and setters

    public String getRepID() {
        return repID;
    }

    public void setRepID(String repID) {
        this.repID = repID;
    }

    public String getBrewersPermit() {
        return brewersPermit;
    }

    public void setBrewersPermit(String brewersPermit) {
        this.brewersPermit = brewersPermit;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public WineFormItems getWineFormItems() {
        return wineFormItems;
    }

    public void setWineFormItems(WineFormItems wineFormItems) {
        this.wineFormItems = wineFormItems;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlownBrandedEmbossedInfo() {
        return blownBrandedEmbossedInfo;
    }

    public void setBlownBrandedEmbossedInfo(String blownBrandedEmbossedInfo) {
        this.blownBrandedEmbossedInfo = blownBrandedEmbossedInfo;
    }

    public Timestamp getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Timestamp dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public int getTtbID() {
        return ttbID;
    }

    public void setTtbID(int ttbID) {
        this.ttbID = ttbID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public Approval getApproval() {
        return approval;
    }

    public void setApproval(Approval approval) {
        this.approval = approval;
    }


    //#######################################################################################################
    //                                  Helper Functions



}
