import Entities.AlcoholType;
import Entities.Form;
import Entities.Manufacturer;

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
            Manufacturer man = new Manufacturer();

            man.setManID(9999);
            Form f1 = new Form();
            f1.setTtbID(1);
            f1.setDateSubmitted(Timestamp.from(Instant.now()));
            f1.setBrandName("Brand1");
            Form f2 = new Form();
            f2.setTtbID(2);
            f2.setDateSubmitted(Timestamp.from(Instant.now()));
            f2.setBrandName("Brand2");
            Form f3 = new Form();
            f3.setTtbID(3);
            f3.setDateSubmitted(Timestamp.from(Instant.now()));
            f3.setBrandName("Brand3");
            man.submitForm(f1);
            man.submitForm(f2);
            man.submitForm(f3);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
