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
                    "jim@jimmail.com", 12345, Timestamp.from(Instant.now()), "Jimmy", "6035026034", AlcoholType.MaltBeverage.toInt(), 2.3);
            db.dbInsert.insertForm("23ff", "ColaBooze", "ColB", false, true, null,
                    "tom@jimmail.com", 12345, Timestamp.from(Instant.now()), "Tom", "8918918991", AlcoholType.DistilledLiquor.toInt(), 40.0);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
