package DB.Test;

import DB.DBInsert;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class InsertTest {

    @BeforeClass
    public static void setup() {
        DB.TableBuilder init = DB.TableBuilder.getInstance();
        init.resetDB();
        DB.DBInsert insert = DB.DBInsert.getInstance();
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");
        try {
            insert.insertCompany(12345, "Budweiser", "test123", "qwerty");
            insert.insertForm("12112", "Buddy", "Budweiser", true, false, null, "abc@gmail.com",
                    12345, timestamp, "ABC", "12312124", 2);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void checkNullForm() {
        DB.DBSelect sel = DB.DBSelect.getInstance();
        try {
            assertTrue(sel.selectAllForms().getFetchSize() > 0);
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    @AfterClass
    public static void close(){
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}