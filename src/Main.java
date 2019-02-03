import DB.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DB.Database db = DB.Database.getInstance();
        db.tableBuilder.resetDB();
        try {
            db.dbInsert.insertCompany(123, "Buddwedfdsfsd", "User", "Pass");
            db.dbInsert.insertAgent("Joe Cool", 52376235, "Joe", "Cool" );
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);

    }

}
