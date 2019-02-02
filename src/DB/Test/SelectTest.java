package DB.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class SelectTest {
    @BeforeClass
    public static void setup() {
        DB.Database db = DB.Database.getInstance();
        db.tableBuilder.resetDB();
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");
        try {
            db.dbInsert.insertCompany(123, "Budweiser", "Buddy", "12345");
            db.dbInsert.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
            db.dbInsert.insertForm("12112", "Buddy", "Budweiser", true, false, null, "abc@gmail.com",
                    123, timestamp, "ABC", "12312124", 2);
        } catch (SQLException e){
            System.out.println("ERROR: TEST DB INIT FAILED.");
           System.out.println(e.toString());
        }
    }
    @Test
    public void loginCompanyTest(){
      DB.Database db = DB.Database.getInstance();
      assertTrue(db.dbSelect.AuthenticateCompany("Buddy", "12345"));
      assertFalse(db.dbSelect.AuthenticateCompany("Buddy", "GOD IS DEAD"));
      assertFalse(db.dbSelect.AuthenticateCompany("UNREGISTERDCOMPANY", "12345"));
    }

    @Test
    public void loginAgentTest(){
        DB.Database db = DB.Database.getInstance();
        assertTrue(db.dbSelect.AuthenticateAgent("Agent_Mark", "PassWord"));
        assertFalse(db.dbSelect.AuthenticateAgent("Agent_Mark", "WrongPass"));
        assertFalse(db.dbSelect.AuthenticateAgent("Agent_Mork", "PassWord"));
    }

    @Test
    public void downloadResultsTest() {
        DB.Database db = DB.Database.getInstance();
        String query = "Select * FROM Form";
        assertTrue(db.dbSelect.downloadResults(query));
    }

    /*@AfterClass
    public static void close(){
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }*/
}
