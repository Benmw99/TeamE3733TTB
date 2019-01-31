import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class TableBuilderTest {
    @Before
    public void setup() {
        DB.TableBuilder init = new DB.TableBuilder("./ttb.db");
        init.resetDB();
        DB.DBInsert insert = new DB.DBInsert("./ttb.db");
        try{
            insert.insertCompany(12345, "Budweiser", "test123", "qwerty");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void selectAllCompany() {
        DB.DBSelect selection = new DB.DBSelect("./ttb.db");
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
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}