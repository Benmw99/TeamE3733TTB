import DB.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DB.Database db = DB.Database.getInstance();
        db.tableBuilder.resetDB();
        try {
            db.dbInsert.insertCompany(123, "Buddwedfdsfsd", "User", "Pass");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);

    }

}
