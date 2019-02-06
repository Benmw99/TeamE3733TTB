import Entities.AlcoholType;

import java.sql.Timestamp;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        try {
            DB.Database db = DB.Database.getInstance();
            db.tableBuilder.resetDB();
            db.dbInsert.insertCompany(12345, "Budweiser", "User", "Pass");
            db.dbInsert.insertAgent("joe cool", 445, "JoeCool", "L33t");
            db.dbInsert.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
            db.dbInsert.insertForm("123YY", "ABC", "123", true, true, null,
                    "jim@jimmail.com", 12345, Timestamp.from(Instant.now()), "Jimmy", "6035026034", AlcoholType.MaltBeverage.toInt(), 1.0);
//            db.dbInsert.insertForm("123133YY", "ABC213", "112323", true, true, null,
//                    "jim@jimmail231.com", 12345, Timestamp.from(Instant.now()), "Jim123my", "6035026034", AlcoholType.MaltBeverage.toInt(), 1.0);
//            db.dbInsert.insertForm("123123YY", "A1342BC", "12v1253", true, true, null,
//                    "jim@jimmail.1v51451com", 12345, Timestamp.from(Instant.now()), "Jiv3412mmy", "6035026034", AlcoholType.MaltBeverage.toInt(), 1.0);
//            db.dbInsert.insertForm("1243v432v3YY", "A24523652v4BC", "12345v23", true, true, null,
//                    "jim@jimma245il.com", 12345, Timestamp.from(Instant.now()), "Jimmy", "6035026034", AlcoholType.MaltBeverage.toInt(), 1.0);
//
        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
