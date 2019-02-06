package DB;

import Entities.*;

import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;

public class SampleData {
    Database db;
    Manufacturer man;
    public SampleData(Database db){
        this.db = db;
        try {
            db.dbInsert.insertCompany(123,"Brewers Inc.", "USER", "12345");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        this.man = new Manufacturer(123, "Brewers Inc.", "USER", "12345");
        this.insertBooze();
    }

    public void insertBooze(){
        Form one = new Form();
        one.setCompanyID(123);
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
        two.setCompanyID(123);
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
        three.setCompanyID(123);
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
        three.setPhoneNumber("916-483-2791");
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
        four.setCompanyID(123);
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
        four.setPhoneNumber("717-250-1027");
        WineFormItems fourwine = new WineFormItems();
        fourwine.setAppellation(" ");
        fourwine.setGrapeVarietal("N/A");
        fourwine.setpH((float)8.7);
        fourwine.setVintageYear(2018);
        four.setWineFormItems(fourwine);
        four.setDateSubmitted(Timestamp.from(Instant.now()));
        four.setSerialNumber("180012");
        db.dbInsert.insertForm(four, man);

        Form sixteen = new Form();
        sixteen.setCompanyID(123);
        sixteen.setBrandName("Alaskan Amber");
        sixteen.setFancifulName("");
        sixteen.setAlcoholType(AlcoholType.MaltBeverage);
        sixteen.setAlcoholContent((float)14.1);
        addy = new Address("Juneau", "AK", "99801", "5429 SHAUNE DR", "ALASKAN BREWING CO., ALASKAN BREWING, LLC");
        sixteen.setMailingAddress(addy);
        sixteen.getBrewersPermit().add("BR-AK-ALB-1");
        sixteen.setEmail("fake@email.com");
        sixteen.setBlownBrandedEmbossedInfo("embossed");
        sixteen.setSource(true);
        sixteen.setPhoneNumber("907-780-4514");
        sixteen.setDateSubmitted(Timestamp.from(Instant.now()));
        sixteen.setSerialNumber("050003");
        db.dbInsert.insertForm(sixteen, man);

        Form seventeen = new Form();
        seventeen.setCompanyID(123);
        seventeen.setBrandName("Brownstone Nutbrown Ale");
        seventeen.setFancifulName("");
        seventeen.setAlcoholType(AlcoholType.MaltBeverage);
        seventeen.setAlcoholContent((float)9.3);
        addy = new Address("Watkins Glen", "NY", "14891", "301 FRANKLIN STREET", "ROOSTER FISH BREWING");
        seventeen.setMailingAddress(addy);
        seventeen.getBrewersPermit().add("BR-NY-FRA-1");
        seventeen.setEmail("faky@faky.com");
        seventeen.setBlownBrandedEmbossedInfo("Whoops");
        seventeen.setSource(false);
        seventeen.setPhoneNumber("607-535-9797");
        seventeen.setDateSubmitted(Timestamp.from(Instant.now()));
        seventeen.setSerialNumber("060001");
        db.dbInsert.insertForm(seventeen, man);

        Form eighteen = new Form();
        eighteen.setCompanyID(123);
        eighteen.setBrandName("Alaskan IPA");
        eighteen.setFancifulName("India Pale Ale");
        eighteen.setAlcoholType(AlcoholType.MaltBeverage);
        eighteen.setAlcoholContent((float)6.2);
        addy = new Address("Juneau", "AK", "99801", "5429 SHAUNE DR", "ALASKAN BREWING CO., ALASKAN BREWING, LLC");
        eighteen.setMailingAddress(addy);
        eighteen.getBrewersPermit().add("BR-AK-ALB-1 ");
        eighteen.setEmail("noone@not.com");
        eighteen.setBlownBrandedEmbossedInfo("Lies");
        eighteen.setSource(true);
        eighteen.setPhoneNumber("907-780-5917");
        eighteen.setDateSubmitted(Timestamp.from(Instant.now()));
        eighteen.setSerialNumber("060001");
        db.dbInsert.insertForm(eighteen, man);

        Form nineteen = new Form();
        nineteen.setCompanyID(123);
        nineteen.setBrandName("Heavy Seas");
        nineteen.setFancifulName("Hang Ten Weizen Dopplebock");
        nineteen.setAlcoholType(AlcoholType.MaltBeverage);
        nineteen.setAlcoholContent((float)10);
        addy = new Address("Baltimore", "MD", "21227", "4615 HOLLINS FERRY RD", "Clipper City Brewing Company");
        nineteen.setMailingAddress(addy);
        nineteen.getBrewersPermit().add("BR-MD-CLI-1 ");
        nineteen.setEmail("nope@no.net");
        nineteen.setBlownBrandedEmbossedInfo("ooo");
        nineteen.setSource(true);
        nineteen.setPhoneNumber("410-247-7822");
        nineteen.setDateSubmitted(Timestamp.from(Instant.now()));
        nineteen.setSerialNumber("070002");
        db.dbInsert.insertForm(nineteen, man);

        Form twenty = new Form();
        twenty.setCompanyID(123);
        twenty.setBrandName("Blanche De Namur");
        twenty.setFancifulName("Belgian Beer");
        twenty.setAlcoholType(AlcoholType.MaltBeverage);
        twenty.setAlcoholContent((float)3.66);
        addy = new Address("Ashland", "MA", "01721", "58 Union St", "Eurobrew Inc.");
        twenty.setMailingAddress(addy);
        twenty.getBrewersPermit().add("MA-I-15061");
        twenty.setEmail("addy@address.com");
        twenty.setBlownBrandedEmbossedInfo("Fake news");
        twenty.setSource(false);
        twenty.setPhoneNumber("508-202-0574");
        twenty.setDateSubmitted(Timestamp.from(Instant.now()));
        twenty.setSerialNumber("070021");
        db.dbInsert.insertForm(twenty, man);

        Form twentyone = new Form();
        twentyone.setCompanyID(123);
        twentyone.setBrandName("Alaskan Barley Wine Ale");
        twentyone.setFancifulName("");
        twentyone.setAlcoholType(AlcoholType.MaltBeverage);
        twentyone.setAlcoholContent((float)10.4);
        addy = new Address("Juneau", "AK", "99801", "5429 Shaune DR", "ALASKAN BREWING CO., ALASKAN BREWING, LLC");
        twentyone.setMailingAddress(addy);
        twentyone.getBrewersPermit().add("BR-AK-ALB-1 ");
        twentyone.setEmail("mass@mass.wpe");
        twentyone.setBlownBrandedEmbossedInfo("asddfsa");
        twentyone.setSource(false);
        twentyone.setPhoneNumber("907-780-5917");
        twentyone.setDateSubmitted(Timestamp.from(Instant.now()));
        twentyone.setSerialNumber("070002");
        db.dbInsert.insertForm(twentyone, man);
    }
}
