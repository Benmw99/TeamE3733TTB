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
    public static void create(){
        DB.Database db = DB.Database.getInstance();
        db.tableBuilder.resetDB();
        try {
            db.dbInsert.insertCompany(123, "Budweiser", "Buddy", "12345");
            db.dbInsert.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
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

    @AfterClass
    public static void close(){
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}