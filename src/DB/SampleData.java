package DB;

import Entities.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;

public class SampleData {
    Database db;
    Manufacturer man;
    public SampleData(Database db){
        this.db = db;
    }

    void insertMan(){
        Manufacturer man = new Manufacturer("WALT DISNEY", "1234");
        this.man = man;
    }
    void insertWines(){
        Form one = new Form();
        one.setBrandName("B");
        one.setFancifulName("");
        one.setAlcoholType(AlcoholType.Wine);
        one.setAlcoholContent((float)9.99);
        Address addy = new Address("NICE", "CA", "94564", "4900 BARTLETT SPRINGS RD", "NICE WINE COMPANY, INC.");
        one.setMailingAddress(addy);
        one.getBrewersPermit().add("BWN-CA-21173");
        one.setEmail("nomail@nomail.com");
        one.setBlownBrandedEmbossedInfo("NONE");
        one.setSource(false);
        WineFormItems onewine = new WineFormItems();
        onewine.setAppellation(" ");
        onewine.setGrapeVarietal("Chardonnay");
        onewine.setpH((float)7.7);
        onewine.setVintageYear("2017");
        one.setWineFormItems(onewine);
        one.setDateSubmitted(Timestamp.from(Instant.now()));
        one.setSerialNumber("180031");
        db.dbInsert.insertForm(one, man);

        
    }
}
