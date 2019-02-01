package DB.Test;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class InsertTest {
    @Before
    public void setup() {
        DB.TableBuilder init = new DB.TableBuilder("./ttb.db");
        init.resetDB();
        DB.DBInsert insert = new DB.DBInsert("./ttb.db");
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
        DB.DBSelect sel = new DB.DBSelect("./ttb.db");
        try {
            assertTrue(sel.selectAllForms().getFetchSize() > 0);
        } catch(SQLException e){
            System.out.println(e.toString());
        }

    }
}