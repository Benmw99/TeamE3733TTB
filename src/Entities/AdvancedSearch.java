package Entities;

import java.sql.Timestamp;

public class AdvancedSearch {
    private boolean source;  //true for domestic, false for imported
    private String serialNumber;
    private AlcoholType alcoholType;
    public String brandName;
    private String fancifulName;
    //wine only
    private int vintageYear;
    private float pH;
    private String grapeVarietal;
    private String appellation;
    //typeOfApplication
    private Timestamp timestamp;
    private int ttbID;

}
