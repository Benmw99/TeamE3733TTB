import org.junit.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.junit.Assert.*;

public class TableBuilderTest {

    @Test
    public void selectAllCompany() {
        TableBuilder init = new TableBuilder("./ttb.db");
        init.resetDB();
        DBInsert insert = new DBInsert("./ttb.db");
        try{
            insert.insertCompany(12345, "Budweiser", "test123", "qwerty");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        ResultSet rset = init.selectAllCompany();
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
}