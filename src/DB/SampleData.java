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
        this.insertWines();
    }

    void insertMan(){
        Manufacturer man = new Manufacturer("WALT DISNEY", "1234");
        this.man = man;
    }
    public void insertWines(){
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
        onewine.setVintageYear(2017);
        one.setWineFormItems(onewine);
        one.setDateSubmitted(Timestamp.from(Instant.now()));
        one.setSerialNumber("180031");
        db.dbInsert.insertForm(one, man);

        Form two = new Form();
        two.setBrandName("21ST AMENDMENT BREWERY");
        two.setFancifulName("TASTY");
        two.setAlcoholType(AlcoholType.Wine);
        two.setAlcoholContent((float)9.99);
        addy = new Address("SAN LEANDRO", "CA", "94577", "2010 WILLIAMS ST STE A", "THE 21ST AMENDMENT BREWERY, THE 21ST AMENDMENT BREWERY CAFE, LLC");
        two.setMailingAddress(addy);
        two.getBrewersPermit().add("BR-CA-AME-15004");
        two.setEmail("jomail@nomail.com");
        two.setBlownBrandedEmbossedInfo("Nada");
        two.setSource(false);
        WineFormItems twowine = new WineFormItems();
        twowine.setAppellation(" ");
        twowine.setGrapeVarietal(" ");
        twowine.setpH((float)7.7);
        twowine.setVintageYear(2018);
        two.setWineFormItems(twowine);
        two.setDateSubmitted(Timestamp.from(Instant.now()));
        two.setSerialNumber("18TK02");
        db.dbInsert.insertForm(two, man);

        Form three = new Form();
        three.setBrandName("BITCH BUBBLY");
        three.setFancifulName(" ");
        three.setAlcoholType(AlcoholType.Wine);
        three.setAlcoholContent((float)9.99);
        addy = new Address("NAPA", "CA", "94559", "1443 MAIN ST SUITE 122 ", "GRATEFUL PALATE, PETIT HAMEAU, LLC");
                three.setMailingAddress(addy);
        three.getBrewersPermit().add("CA-I-16739");
        three.setEmail("slomail@nomail.com");
        three.setBlownBrandedEmbossedInfo("Nada");
        three.setSource(false);
        three.setPhoneNumber("(916) 483-2791");
        WineFormItems threewine = new WineFormItems();
        threewine.setAppellation(" ");
        threewine.setGrapeVarietal(" ");
                threewine.setpH((float)4.7);
        threewine.setVintageYear(2018);
        three.setWineFormItems(threewine);
        three.setDateSubmitted(Timestamp.from(Instant.now()));
        three.setSerialNumber("18PH01");
        db.dbInsert.insertForm(three, man);

        Form four = new Form();
        four.setBrandName("REKLAIMED VINES");
        four.setFancifulName("HONEY BADGER");
        four.setAlcoholType(AlcoholType.Wine);
        four.setAlcoholContent((float)29.49);
        addy = new Address("MCVEYTOWN", "PA", "17051", "6160 FERGUSON VALLEY RD", "REKLAIMED VINES, REKLAIMED VINES LLC");
        four.setMailingAddress(addy);
        four.getBrewersPermit().add("BWN-PA-21174");
        four.setEmail("bozomail@nomail.com");
        four.setBlownBrandedEmbossedInfo("Nada");
        four.setSource(false);
        four.setPhoneNumber("(717) 250-1027");
        WineFormItems fourwine = new WineFormItems();
        fourwine.setAppellation(" ");
        fourwine.setGrapeVarietal("N/A");
        fourwine.setpH((float)8.7);
        fourwine.setVintageYear(2018);
        four.setWineFormItems(fourwine);
        four.setDateSubmitted(Timestamp.from(Instant.now()));
        four.setSerialNumber("180012");
        db.dbInsert.insertForm(four, man);

    }
}
