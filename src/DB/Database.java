package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    Connection connection;

    public Database(String path){
        try {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }
    public void close(){
        try {
            connection.close();
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }

}
