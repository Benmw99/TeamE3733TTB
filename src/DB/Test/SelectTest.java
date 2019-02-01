package DB.Test;
import DB.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;
public class SelectTest {
    String path = "./ttb.db";
    DBSelect sel;
    @Before
    public void create(){
        TableBuilder init = new TableBuilder(path);
        init.resetDB();
        init.close();
        DBInsert ins = new DBInsert(path);
        try {
            ins.insertCompany(123, "Budweiser", "Buddy", "12345");
            ins.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
        } catch (SQLException e){
            System.out.println("ERROR: TEST DB INIT FAILED.");
           System.out.println(e.toString());
        }
        ins.close();
        sel = new DBSelect(path);
    }
    @Test
    public void loginCompanyTest(){
      assertTrue(sel.AuthenticateCompany("Buddy", "12345"));
      assertFalse(sel.AuthenticateCompany("Buddy", "GOD IS DEAD"));
      assertFalse(sel.AuthenticateCompany("UNREGISTERDCOMPANY", "12345"));
    }
    @Test
    public void loginAgentTest(){
        assertTrue(sel.AuthenticateAgent("Agent_Mark", "PassWord"));
        assertFalse(sel.AuthenticateAgent("Agent_Mark", "WrongPass"));
        assertFalse(sel.AuthenticateAgent("Agent_Mork", "PassWord"));
    }
    @After
    public void close(){
        sel.close();
    }
}
