package DB.Test;
import DB.*;
import Entities.Manufacturer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import java.time.Instant;
import java.util.List;

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
        Timestamp timestamp = Timestamp.from(Instant.now());
        try {
            ins.insertCompany(123, "Budweiser", "Buddy", "12345");
            ins.insertReps("200A", "rep", "123");
            ins.insertAgent("Mark", 1263, "Agent_Mark", "PassWord");
            ins.insertCompany(12345, "Budweiser", "test123", "qwerty");
            ins.insertForm("12112", "Buddy", "Budweiser", true, false, null, "abc@gmail.com",
                    12345, timestamp, "ABC", "12312124", 2);
            ins.close();
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
    @Test
    public void retrieveList_TTBIDTest(){
        Manufacturer man = new Manufacturer();
        man.manID = 12345;
        Manufacturer man2 = new Manufacturer();
        man2.manID = 45543;
        List<Integer> list = sel.getTTB_IDbyManufactuer(man);
        assertEquals(1, list.size());
        assertTrue(list.get(0) == 1);
        List<Integer> list2 = sel.getTTB_IDbyManufactuer(man2);
        assertTrue(list2.size() == 0);

    }
    @After
    public void close(){
        sel.close();
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}
