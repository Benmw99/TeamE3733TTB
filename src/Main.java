import Entities.AlcoholType;
import Entities.Form;
import Entities.Manufacturer;

import java.sql.Timestamp;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        try {
            DB.Database db = DB.Database.getInstance();
//            db.tableBuilder.resetDB();
            db.dbInsert.insertCompany(12345, "Budweiser", "User", "Pass");
            db.dbInsert.insertAgent("joe cool", 445, "JoeCool", "L33t");
            db.dbInsert.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
