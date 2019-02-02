package DB.Test;

import DB.*;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class SelectTest {

    DBSelect sel;

    @BeforeClass
    public static void create(){
        TableBuilder init = DB.TableBuilder.getInstance();
        init.resetDB();
        DBInsert ins = DB.DBInsert.getInstance();
        try {
            ins.insertCompany(123, "Budweiser", "Buddy", "12345");
            ins.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
        } catch (SQLException e){
            System.out.println("ERROR: TEST DB INIT FAILED.");
           System.out.println(e.toString());
        }
    }
    @Test
    public void loginCompanyTest(){
      sel = DB.DBSelect.getInstance();
      assertTrue(sel.AuthenticateCompany("Buddy", "12345"));
      assertFalse(sel.AuthenticateCompany("Buddy", "GOD IS DEAD"));
      assertFalse(sel.AuthenticateCompany("UNREGISTERDCOMPANY", "12345"));
    }

    @Test
    public void loginAgentTest(){
        sel = DB.DBSelect.getInstance();
        assertTrue(sel.AuthenticateAgent("Agent_Mark", "PassWord"));
        assertFalse(sel.AuthenticateAgent("Agent_Mark", "WrongPass"));
        assertFalse(sel.AuthenticateAgent("Agent_Mork", "PassWord"));
    }
    @AfterClass
    public static void close(){
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}
