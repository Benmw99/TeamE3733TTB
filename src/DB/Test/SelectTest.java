package DB.Test;
import DB.*;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;
public class SelectTest {
    @Before
    public void create(){
        String path = "./ttb.db";
        TableBuilder init = new TableBuilder(path);
        init.resetDB();
        DBInsert ins = new DBInsert(path);
        try {
            ins.insertCompany(123, "Budweiser", "Buddy", "12345");
        } catch (SQLException e){
            System.out.println("ERROR: TEST DB INIT FAILED.");
        }
    }
    @Test
    public void loginCompanyTest(){
      DBSelect sel = new DBSelect("./ttb.db");
      assertTrue(sel.AuthenticateCompany("Buddy", "12345"));
      assertFalse(sel.AuthenticateCompany("Buddy", "GOD IS DEAD"));
      assertFalse(sel.AuthenticateCompany("UNREGISTERDCOMPANY", "12345"));
    }
}
