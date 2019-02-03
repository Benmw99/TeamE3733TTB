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

}
