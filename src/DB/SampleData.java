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

        Form five = new Form();
        five.setBrandName("BESTOWER");
        five.setFancifulName(" ");
        five.setAlcoholType(AlcoholType.Wine);
        five.setAlcoholContent((float)5.6);
        addy = new Address("SONOMA", "CA", "95476", "21692 EIGHTH ST E BLDG B", "LEDSON VINEYARDS AND WINERY, STEVE NOBLE LEDSON");
        five.setMailingAddress(addy);
        five.getBrewersPermit().add("BWN-CA-15252");
        five.setEmail(" ");
        five.setBlownBrandedEmbossedInfo("COOL");
        five.setSource(false);
        five.setPhoneNumber("707-537-3810");
        WineFormItems fivewine = new WineFormItems();
        fivewine.setAppellation("SONOMA VALLEY");
        fivewine.setGrapeVarietal("N/A");
        fivewine.setpH((float)7.6);
        fivewine.setVintageYear(2014);
        five.setWineFormItems(fivewine);
        five.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(five, man);

        Form six = new Form();
        six.setCompanyID(123);
        six.setBrandName("DOMAINE DE MONTBOURGEAU");
        six.setFancifulName(" ");
        six.setAlcoholType(AlcoholType.Wine);
        six.setAlcoholContent((float)11);
        addy = new Address("OAKLAND", "CA", "94621", "7305 EDGEWATER DR SUITE E 1", "JJ BUCKLEY, LLC");
        six.setMailingAddress(addy);
        six.getBrewersPermit().add("CA-I-16655");
        six.setEmail(" ");
        six.setBlownBrandedEmbossedInfo(" UH ");
        six.setSource(true);
        six.setPhoneNumber("617-470-6030");
        WineFormItems sixwine = new WineFormItems();
        sixwine.setAppellation("L'ETOILE");
        sixwine.setGrapeVarietal("CHARDONNAY BLEND");
        sixwine.setpH((float) 7.9);
        sixwine.setVintageYear(2018);
        six.setWineFormItems(sixwine);
        six.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(six, man);

        Form seven = new Form();
        seven.setCompanyID(123);
        seven.setBrandName("PRIMARY WINE CO.");
        seven.setFancifulName(" ");
        seven.setAlcoholType(AlcoholType.Wine);
        seven.setAlcoholContent((float)12.5);
        addy = new Address("BUELLTON", "CA", "93427", "35 INDUSTRIAL WAY", "TERRAVANT WINE COMPANY, TERRAVANT WINE COMPANY, LLC");
        seven.setMailingAddress(addy);
        seven.getBrewersPermit().add("BWN-CA-16071");
        seven.setEmail(" ");
        seven.setBlownBrandedEmbossedInfo(" I LIKE CALI");
        seven.setSource(false);
        seven.setPhoneNumber("(805) 686-9400");
        WineFormItems sevenwine = new WineFormItems();
        sevenwine.setAppellation("CALIFORNIA");
        sevenwine.setGrapeVarietal("Pinot noir");
        sevenwine.setpH((float)7.8);
        sevenwine.setVintageYear(2018);
        seven.setWineFormItems(sevenwine);
        seven.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(seven, man);

        Form eight = new Form();
        eight.setCompanyID(123);
        eight.setBrandName("SANTA CRUZ DE ALPERA");
        eight.setFancifulName(" ");
        eight.setAlcoholType(AlcoholType.Wine);
        eight.setAlcoholContent((float)7.5);
        addy = new Address("NORCO", "CA", "92860", "1700 NORCO AVE STE 211", "SENIC INTERNATIONAL CORP.");
        eight.setMailingAddress(addy);
        eight.getBrewersPermit().add("CA-I-21779");
        eight.setEmail(" ");
        eight.setBlownBrandedEmbossedInfo("NOPE");
        eight.setSource(true);
        eight.setPhoneNumber("909-321-5600");
        WineFormItems eightwine = new WineFormItems();
        eightwine.setAppellation("SPAIN");
        eightwine.setGrapeVarietal("Verdejo Grapes");
        eightwine.setpH((float)8.5);
        eightwine.setVintageYear(2018);
        eight.setWineFormItems(eightwine);
        eight.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(eight, man);

        Form nine = new Form();
        nine.setCompanyID(123);
        nine.setBrandName("POGGIO AL TESORO");
        nine.setFancifulName(" ");
        nine.setAlcoholType(AlcoholType.Wine);
        nine.setAlcoholContent((float)15.5);
        addy = new Address("OAKLAND", "CA", "94621", "7305 EDGEWATER DR SUITE E 1", "JJ BUCKLEY, LLC");
        nine.setMailingAddress(addy);
        nine.getBrewersPermit().add("CA-I-16655");
        nine.setEmail(" ");
        nine.setBlownBrandedEmbossedInfo(" AHHHHH ");
        nine.setSource(false);
        nine.setPhoneNumber("617-470-6030");
        WineFormItems ninewine = new WineFormItems();
        ninewine.setAppellation("BOLGHERI SUPERIORE");
        ninewine.setGrapeVarietal("N/A");
        ninewine.setpH((float)8.25);
        ninewine.setVintageYear(2018);
        nine.setWineFormItems(ninewine);
        nine.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(nine,man);

        Form ten = new Form();
        ten.setCompanyID(123);
        ten.setBrandName("ORLANDO ABRIGO");
        ten.setFancifulName("MERUZZANO");
        ten.setAlcoholType(AlcoholType.Wine);
        ten.setAlcoholContent((float)14);
        addy = new Address("NEW YORK", "NY", "10011", "116 W 23RD ST STE 500", "ENOTRIA WINE IMPORTS, ENOTRIA WINE IMPORTS OF NEW YORK LLC");
        ten.setMailingAddress(addy);
        ten.getBrewersPermit().add("NY-I-15421");
        ten.setEmail(" ");
        ten.setBlownBrandedEmbossedInfo(" YEEE ");
        ten.setSource(false);
        ten.setPhoneNumber("917-226-5146");
        WineFormItems tenwine = new WineFormItems();
        tenwine.setAppellation("BARBARESCO");
        tenwine.setGrapeVarietal("N/A");
        tenwine.setpH((float)7.8);
        tenwine.setVintageYear(2015);
        ten.setWineFormItems(tenwine);
        ten.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(ten, man);

        Form eleven = new Form();
        eleven.setCompanyID(123);
        eleven.setBrandName("HARMONY WINERY");
        eleven.setFancifulName(" ");
        eleven.setAlcoholType(AlcoholType.Wine);
        eleven.setAlcoholContent((float)12.5);
        addy = new Address("Fishers", "IN", "46038", "7350 VILLAGE SQUARE LN STE 200", "Harmony Winery, Outtavine, LLC");
        eleven.setMailingAddress(addy);
        eleven.getBrewersPermit().add("BWN-IN-20016");
        eleven.setEmail(" ");
        eleven.setBlownBrandedEmbossedInfo(" HELP ");
        eleven.setSource(true);
        eleven.setPhoneNumber("317-408-4339");
        WineFormItems elevenwine = new WineFormItems();
        elevenwine.setAppellation("AMERICAN");
        elevenwine.setGrapeVarietal("Malbec");
        elevenwine.setpH((float)7.5);
        elevenwine.setVintageYear(2002);
        eleven.setWineFormItems(elevenwine);
        eleven.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(eleven, man);

        Form twelve = new Form();
        twelve.setCompanyID(123);
        twelve.setBrandName("TIMBER RIDGE ROSE");
        twelve.setFancifulName(" ");
        twelve.setAlcoholType(AlcoholType.Wine);
        twelve.setAlcoholContent((float)12.0);
        addy = new Address("SPENCER", "IN", "47460", "491 TIMBER RIDGE RD", "OWEN VALLEY WINERY, OWEN VALLEY WINERY LLC");
        twelve.setMailingAddress(addy);
        twelve.getBrewersPermit().add("BWN-IN-15037");
        twelve.setEmail(" ");
        twelve.setBlownBrandedEmbossedInfo(" NOOOOO ");
        twelve.setSource(false);
        twelve.setPhoneNumber("812-828-0883");
        WineFormItems twelvewine = new WineFormItems();
        twelvewine.setAppellation("INDIANA UPLANDS");
        twelvewine.setGrapeVarietal("N/A");
        twelvewine.setpH((float)7.8);
        twelvewine.setVintageYear(2015);
        twelve.setWineFormItems(twelvewine);
        twelve.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(twelve, man);

        Form thirteen = new Form();
        thirteen.setCompanyID(123);
        thirteen.setBrandName("CRAGGY RANGE");
        thirteen.setFancifulName("LE BEAUX CAILLOUX");
        thirteen.setAlcoholType(AlcoholType.Wine);
        thirteen.setAlcoholContent((float)13.0);
        addy = new Address("AMERICAN CANYON", "CA", "94503", "255 LOMBARD RD STE A", "VIN-GO, LLC");
        thirteen.setMailingAddress(addy);
        thirteen.getBrewersPermit().add("CA-I-21701");
        thirteen.setEmail(" ");
        thirteen.setBlownBrandedEmbossedInfo(" ALMOST THERE ");
        thirteen.setSource(true);
        thirteen.setPhoneNumber("707-558-0702");
        WineFormItems thirteenwine = new WineFormItems();
        thirteenwine.setAppellation("HAWKES BAY");
        thirteenwine.setGrapeVarietal("Chardonnay");
        thirteenwine.setpH((float)7.6);
        thirteenwine.setVintageYear(2016);
        thirteen.setWineFormItems(thirteenwine);
        thirteen.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(thirteen, man);

        Form fourteen = new Form();
        fourteen.setCompanyID(123);
        fourteen.setBrandName("MARQUES DE NAVARRO");
        fourteen.setFancifulName(" ");
        fourteen.setAlcoholType(AlcoholType.Wine);
        fourteen.setAlcoholContent((float)13);
        addy = new Address("BRANFORD", "CT", "06405", "25 BUSINESS PARK DR", "MURPHY DISTRIBUTORS, DO VALLE, LLC");
        fourteen.setMailingAddress(addy);
        fourteen.getBrewersPermit().add("CT-I-15077");
        fourteen.setEmail(" ");
        fourteen.setBlownBrandedEmbossedInfo(" ONLY ONE MORE ");
        fourteen.setSource(true);
        fourteen.setPhoneNumber("203-483-3100");
        WineFormItems fourteenwine = new WineFormItems();
        fourteenwine.setAppellation("LONTUE VALLEY");
        fourteenwine.setGrapeVarietal("Cabernet Sauvignon");
        fourteenwine.setpH((float)7.5);
        fourteenwine.setVintageYear(2017);
        fourteen.setWineFormItems(fourteenwine);
        fourteen.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(fourteen, man);

        Form fifteen = new Form();
        fifteen.setCompanyID(123);
        fifteen.setBrandName("STONE & KEY CELLARS");
        fifteen.setFancifulName(" ");
        fifteen.setAlcoholType(AlcoholType.Wine);
        fifteen.setAlcoholContent((float)15.7);
        addy = new Address("MONTGOMERYVILLE", "PA", "18936", "435 DOYLESTOWN RD", "STONE AND KEY CELLARS, LLC");
        fifteen.setMailingAddress(addy);
        fifteen.getBrewersPermit().add("BWN-PA-21021");
        fifteen.setEmail(" ");
        fifteen.setBlownBrandedEmbossedInfo(" WE THERE ");
        fifteen.setSource(false);
        fifteen.setPhoneNumber("215-855-4567");
        WineFormItems fifteenwine = new WineFormItems();
        fifteenwine.setAppellation("AMERICAN");
        fifteenwine.setGrapeVarietal("Cabernet Sauvignon");
        fifteenwine.setpH((float)7.9);
        fifteenwine.setVintageYear(2018);
        fifteen.setWineFormItems(fifteenwine);
        fifteen.setDateSubmitted(Timestamp.from(Instant.now()));
        db.dbInsert.insertForm(fifteen, man);

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

        Form twentytwo = new Form();
        twentytwo.setCompanyID(123);
        twentytwo.setBrandName("JUICE JR.");
        twentytwo.setFancifulName(" ");
        twentytwo.setAlcoholType(AlcoholType.MaltBeverage);
        twentytwo.setAlcoholContent((float)6);
        addy = new Address("PORTLAND", "OR", "97211", "2204 NE ALBERTA ST STE 101", "GREAT NOTION BREWING & BARREL HOUSE, HUMBOLDT STREET COLLECTIVE, LLC");
        twentytwo.setMailingAddress(addy);
        twentytwo.getBrewersPermit().add("BR-OR-21137");
        twentytwo.setEmail(" ");
        twentytwo.setBlownBrandedEmbossedInfo(" TIME FOR MORE ");
        twentytwo.setSource(false);
        twentytwo.setPhoneNumber("503-548-4491");
        twentytwo.setDateSubmitted(Timestamp.from(Instant.now()));
        twentytwo.setSerialNumber("180005");
        db.dbInsert.insertForm(twentytwo, man);

        Form twentythree = new Form();
        twentythree.setCompanyID(123);
        twentythree.setBrandName("SPACE INVADER");
        twentythree.setFancifulName(" ");
        twentythree.setAlcoholType(AlcoholType.MaltBeverage);
        twentythree.setAlcoholContent((float)7);
        addy = new Address("PORTLAND", "OR", "97211", "2204 NE ALBERTA ST STE 101", "GREAT NOTION BREWING & BARREL HOUSE, HUMBOLDT STREET COLLECTIVE, LLC");
        twentythree.setMailingAddress(addy);
        twentythree.getBrewersPermit().add("BR-OR-21137");
        twentythree.setEmail(" ");
        twentythree.setBlownBrandedEmbossedInfo(" SO TIRED ");
        twentythree.setSource(false);
        twentythree.setPhoneNumber("503-548-4491");
        twentythree.setDateSubmitted(Timestamp.from(Instant.now()));
        twentythree.setSerialNumber("180007");
        db.dbInsert.insertForm(twentythree, man);

        Form twentyfour = new Form();
        twentyfour.setCompanyID(123);
        twentyfour.setBrandName("CARROT CAKE");
        twentyfour.setFancifulName("CARROT CAKE IMPERIAL AMBER ALE");
        twentyfour.setAlcoholType(AlcoholType.MaltBeverage);
        twentyfour.setAlcoholContent((float)9);
        addy = new Address("GOOCHLAND", "VA", "23063", "4100 KNOLLS POINT DR", "Lickinghole Creek Craft Brewery LLC");
        twentyfour.setMailingAddress(addy);
        twentyfour.getBrewersPermit().add("BR-VA-20016");
        twentyfour.setEmail(" ");
        twentyfour.setBlownBrandedEmbossedInfo(" I DONE WITH THIS ");
        twentyfour.setSource(false);
        twentyfour.setPhoneNumber("804-314-8717");
        twentyfour.setDateSubmitted(Timestamp.from(Instant.now()));
        twentyfour.setSerialNumber("1302170");
        db.dbInsert.insertForm(twentyfour, man);

        Form twentyfive = new Form();
        twentyfive.setCompanyID(123);
        twentyfive.setBrandName("GREAT LAKES BREWING CO");
        twentyfive.setFancifulName("73 A KOLSCH-STYLE ALE BREWED IN HONOR OF IRON MAN JOE THOMAS");
        twentyfive.setAlcoholType(AlcoholType.MaltBeverage);
        twentyfive.setAlcoholContent((float)7.6);
        addy = new Address("CLEVELAND", "OH", "44113", "1947 W 28TH ST", "THE GREAT LAKES BREWING CO.");
        twentyfive.setMailingAddress(addy);
        twentyfive.getBrewersPermit().add("BR-OH-GRE-1");
        twentyfive.setEmail(" ");
        twentyfive.setBlownBrandedEmbossedInfo(" WHYYY ");
        twentyfive.setSource(false);
        twentyfive.setPhoneNumber("216-372-6978");
        twentyfive.setDateSubmitted(Timestamp.from(Instant.now()));
        twentyfive.setSerialNumber("180019");
        db.dbInsert.insertForm(twentyfive, man);

        Form twentysix = new Form();
        twentysix.setCompanyID(123);
        twentysix.setBrandName("LUCKY ENVELOPE BREWING");
        twentysix.setFancifulName("GRAPEFRUIT ENIAC IPA");
        twentysix.setAlcoholType(AlcoholType.MaltBeverage);
        twentysix.setAlcoholContent((float)7);
        addy = new Address("SEATTLE", "WA", "98107", "907 NW 50TH ST", "LUCKY ENVELOPE BREWING, LUCKY ENVELOPE BREWING LLC");
        twentysix.setMailingAddress(addy);
        twentysix.getBrewersPermit().add("BR-WA-21156");
        twentysix.setEmail(" ");
        twentysix.setBlownBrandedEmbossedInfo("I JUST WANT AN IPA");
        twentysix.setSource(false);
        twentysix.setPhoneNumber("206-289-0425");
        twentysix.setDateSubmitted(Timestamp.from(Instant.now()));
        twentysix.setSerialNumber("18KC19");
        db.dbInsert.insertForm(twentysix, man);

        Form twentyseven = new Form();
        twentyseven.setCompanyID(123);
        twentyseven.setBrandName("PERCIVAL BREWING COMPANY");
        twentyseven.setFancifulName(" ");
        twentyseven.setAlcoholType(AlcoholType.MaltBeverage);
        twentyseven.setAlcoholContent((float)8.2);
        addy = new Address("NORWOOD", "MA", "02062", "83 MORSE ST BLDG 4 STE 4A & 4B", "PERCIVAL BREWING COMPANY LLC");
        twentyseven.setMailingAddress(addy);
        twentyseven.getBrewersPermit().add("BR-MA-21086");
        twentyseven.setEmail(" ");
        twentyseven.setBlownBrandedEmbossedInfo(" AHHH ");
        twentyseven.setSource(false);
        twentyseven.setPhoneNumber("781-664-4705");
        twentyseven.setDateSubmitted(Timestamp.from(Instant.now()));
        twentyseven.setSerialNumber("186345");
        db.dbInsert.insertForm(twentyseven, man);

        Form twentyeight = new Form();
        twentyeight.setCompanyID(123);
        twentyeight.setBrandName("BIRDS FLY SOUTH ALE PROJECT");
        twentyeight.setFancifulName("YOU&I SESSION INDIA PALE ALE");
        twentyeight.setAlcoholType(AlcoholType.MaltBeverage);
        twentyeight.setAlcoholContent((float)4.5);
        addy = new Address("Greenville", "SC", "29601", "1320 HAMPTON AVENUE EXT BAY 12", "Birds Fly South Ale Project, BIRDS FLY SOUTH ALE PROJECT, LLC");
        twentyeight.setMailingAddress(addy);
        twentyeight.getBrewersPermit().add("BR-SC-21039");
        twentyeight.setEmail(" ");
        twentyeight.setBlownBrandedEmbossedInfo(" ERK ");
        twentyeight.setSource(false);
        twentyeight.setPhoneNumber("727-482-2709");
        twentyeight.setDateSubmitted(Timestamp.from(Instant.now()));
        twentyeight.setSerialNumber("181010");
        db.dbInsert.insertForm(twentyeight, man);

        Form twentynine = new Form();
        twentynine.setCompanyID(123);
        twentynine.setBrandName("SCHELL'S");
        twentynine.setFancifulName("STAG SERIES SAHTI BREWED WITH JUNIPER BERRIES");
        twentynine.setAlcoholType(AlcoholType.MaltBeverage);
        twentynine.setAlcoholContent((float)8.9);
        addy = new Address("NEW ULM", "MN", "56073", "1860 SCHELL RD", "AUGUST SCHELL BREWING COMPANY");
        twentynine.setMailingAddress(addy);
        twentynine.getBrewersPermit().add("BR-MN-SCH-1");
        twentynine.setEmail(" ");
        twentynine.setBlownBrandedEmbossedInfo(" ONE MORE TO GO ");
        twentynine.setSource(false);
        twentynine.setPhoneNumber("507-354-5528");
        twentynine.setDateSubmitted(Timestamp.from(Instant.now()));
        twentynine.setSerialNumber("180770");
        db.dbInsert.insertForm(twentynine, man);

        Form thirty = new Form();
        thirty.setCompanyID(123);
        thirty.setBrandName("SMULTRONSTÄLLET");
        thirty.setFancifulName(" ");
        thirty.setAlcoholType(AlcoholType.MaltBeverage);
        thirty.setAlcoholContent((float)9.3);
        addy = new Address("PENNINGTON", "NJ", "08534", "1595 REED RD UNIT 2", "THE REFEREND BIER BLENDERY, THE REFEREND, LLC");
        thirty.setMailingAddress(addy);
        thirty.getBrewersPermit().add("BR-NJ-21053");
        thirty.setEmail(" ");
        thirty.setBlownBrandedEmbossedInfo(" LAST ONE ");
        thirty.setSource(false);
        thirty.setPhoneNumber("609-474-0443");
        thirty.setDateSubmitted(Timestamp.from(Instant.now()));
        thirty.setSerialNumber("180035");
        db.dbInsert.insertForm(thirty, man);

    }
}
