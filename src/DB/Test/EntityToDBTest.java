package DB.Test;

import DB.Database;
import Entities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class EntityToDBTest {
    Database db = Database.getInstance();
    Form one;
    @Before
    public void init()

    {
        db.tableBuilder.resetDB();
        one = new Form(AlcoholType.DistilledLiquor,
                "BUDDY", (float) 5.6);
        Manufacturer man = new Manufacturer("sysadmin@swollenjams.com", "PASS");
        man.setManID(123);
        try {
            db.dbInsert.insertCompany(123, "Buddweiser", "User", "Pass");
            db.dbInsert.insertForm(one, man);
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    @Test
    public void getFormTest(){
        assertTrue(one.equals(db.dbSelect.getFormByTTB_ID(one.getTtbID())));
    }

}
