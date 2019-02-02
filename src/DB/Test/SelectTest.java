package DB.Test;
import DB.*;
import Entities.AlcoholType;
import Entities.Form;
import Entities.Manufacturer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import java.time.Instant;
import java.util.List;

import static org.junit.Assert.*;
public class SelectTest {
    static DB.Database db = DB.Database.getInstance();

    @BeforeClass
    public static void setup() {
        db.tableBuilder.resetDB();
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");
        try {
            db.dbInsert.insertCompany(123, "Budweiser", "Buddy", "12345");
            db.dbInsert.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
            db.dbInsert.insertForm("123YY", "ABC", "123", true, true, null,
                    "jim@jimmail.com", 123, Timestamp.from(Instant.now()), "Jimmy", "6035026034", 2);
        } catch (SQLException e) {
            System.out.println("ERROR: TEST DB INIT FAILED.");
            System.out.println(e.toString());
        }
    }

    @Test
    public void loginCompanyTest() {
        DB.Database db = DB.Database.getInstance();
        assertTrue(db.dbSelect.AuthenticateCompany("Buddy", "12345"));
        assertFalse(db.dbSelect.AuthenticateCompany("Buddy", "GOD IS DEAD"));
        assertFalse(db.dbSelect.AuthenticateCompany("UNREGISTERDCOMPANY", "12345"));
    }

    @Test
    public void loginAgentTest() {
        DB.Database db = DB.Database.getInstance();
        assertTrue(db.dbSelect.AuthenticateAgent("Agent_Mark", "PassWord"));
        assertFalse(db.dbSelect.AuthenticateAgent("Agent_Mark", "WrongPass"));
        assertFalse(db.dbSelect.AuthenticateAgent("Agent_Mork", "PassWord"));
    }

    @Test
    public void retrieveList_TTBIDTest() {
        Manufacturer man = new Manufacturer(123, null, null, null);
        man.manID = 123;
        Manufacturer man2 = new Manufacturer(456, null, null, null);
        man2.manID = 45543;
        List<Integer> list = db.dbSelect.getTTB_IDbyManufactuer(man);
        assertEquals(1, list.size());
        assertTrue(list.get(0) == 1);
        List<Integer> list2 = db.dbSelect.getTTB_IDbyManufactuer(man2);
        assertTrue(list2.size() == 0);
    }
    @Test
    public void downloadResultsTest() {
        DB.Database db = DB.Database.getInstance();
        String query = "Select * FROM Form";
        assertTrue(db.dbSelect.downloadResults(query));
    }
    @Test
    public void retrieveFormTest(){
        Form form = db.dbSelect.getFormByTTB_ID(1);
        assertEquals("ABC", form.getFancifulName());
    }
    /*@AfterClass
    public static void close(){
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }*/
    }

