package DB.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class TableBuilderTest {
    @BeforeClass
    public static void setup() {
        DB.TableBuilder init = DB.TableBuilder.getInstance();
        init.resetDB();
        DB.DBInsert insert = DB.DBInsert.getInstance();
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");
        try {
            insert.insertCompany(12345, "Budweiser", "test123", "qwerty");
            insert.insertForm("123", "Bud-lite", "Bud", true, false, null, "123@gmail.com", 12345, timestamp, "John", "7817817811", 2);
            insert.insertAddress("12345", true, "Worcester", "MA", "100 Road Road", 1);
            insert.insertAddress("67890", false, "Acton", "MA", "200 Street Street", 1);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void selectAllCompany() {
        DB.DBSelect selection = DB.DBSelect.getInstance();
        ResultSet rset = selection.selectAllCompany();
        int compID = 0;
        String compName = "";
        String loginName = "";
        String password = "";
        try {
            while (rset.next()) {
                compID = rset.getInt("Company_ID");
                compName = rset.getString("Company_Name");
                loginName = rset.getString("Login_Name");
                password = rset.getString("Password");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        assertEquals(12345, compID);
        assertEquals("Budweiser", compName);
        assertEquals("test123", loginName);
        assertEquals("qwerty", password);
    }

    @Test
    public void selectAllAddress() {
        DB.DBSelect selection = DB.DBSelect.getInstance();
        ResultSet rset = selection.selectAllAddress();
        String id = "";
        String street = "";
        try {
            while (rset.next()) {
                id = id + rset.getInt("ID") + ",";
                street = street + rset.getString("Street") + ",";
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        assertEquals("1,2,", id);
        assertEquals("100 Road Road,200 Street Street,", street);
    }

    @AfterClass
    public static void close() {
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}