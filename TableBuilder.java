import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//This class may very well not exist on the final project, I'm really just using this as a place to sore all the SQL
//strings as I write them. We definitely need to write those, lol.
public class TableBuilder {
    Connection connection;


    void buildAddress(){
        String buildString = "CREATE TABLE ADDRESS ('Zip_Code' VARCHAR(8)," +
                " 'isMailing' BOOL," +
                " 'City' VARCHAR(32)," +
                " 'TTB_ID' INT(16)," +
                " 'State' VARCHAR(2)," +
                " 'Street_Name' VARCHAR(32))"
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildOtherInfo(){
        String buildString = "CREATE TABLE OTHER_INFO (" +
                "'TTB_ID' INT(16)," +
                "'Text' VARCHAR(256))"
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch(SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildWine(){
        String buildString = "CREATE TABLE WINE ('pH' DOUBLE(2)," +
                "'TTB_ID' INT(16)," +
                "'Grape_Varietals' VARCHAR(256)," +
                "'Wine_Appellation' VARCHAR(32))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildCompany(){
        String buildString = "CREATE TABLE COMPANY (" +
                "'Company_ID' INT(16) PRIMARY KEY," +
                "'Company_Name' VARCHAR(256))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildBrewersPermit(){
        String buildString = "CREATE TABLE BREWERS_PERMIT (" +
                "'Brewers_No' INT(16)," +
                "'TTB_ID' INT(16)," +
                "'isPrimary' BOOL)";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
    void buildApproval(){
        String buildString = "CREATE TABLE APPROVAL (" +
                "'Approving_Agent' VARCHAR(32)," +
                "'TTB_ID' INT(16)" +
                "'Date' TIMESTAMP," +
                "'Expiration' TIMESTAMP," +
                "'Qualification' VARCHAR(256))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildUser(){
        String buildString = "CREATE TABLE USER (" +
                "'Login_Name' VARCHAR(32)," +
                "'Password' VARCHAR(256))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

}
