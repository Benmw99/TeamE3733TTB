import DB.*;
import java.sql.DriverManager;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TableBuilder init = new TableBuilder("./ttb.db");
        init.resetDB();
        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException e) {}
    }
}