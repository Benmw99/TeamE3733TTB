import java.sql.*;


//This class may very well not exist on the final project, I'm really just using this as a place to sore all the SQL
//strings as I write them. We definitely need to write those, lol.
public class TableBuilder {
    private Connection connection;
    private static final String IMAGESIZE = "1M";

    TableBuilder(String path){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void resetDB() {
        String dropString = "DROP TABLE ADDRESS, USER, AGENTS, REP, COMPANY, FORM, BREWERSPERMIT, ADDRESS, OTHERINFO, LABEL, APPROVAL, WINE";
        try {
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) { }
        buildBrewersPermit();
        buildApproval();
        buildAddress();
        buildCompany();
        buildOtherInfo();
        buildUser();
        buildWine();
        buildForm();
        buildLabel();
    }

    void buildAddress(){
        String buildString = "CREATE TABLE ADDRESS ('Zip_Code' VARCHAR(8)," +
                " 'isMailing' BOOL," +
                " 'City' VARCHAR(32)," +
                " 'TTB_ID' INT(16)," + //TODO FOREIGNKEY, Primary Key
                " 'State' VARCHAR(2)," +
                " 'Street_Name' VARCHAR(32))";
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildOtherInfo(){
        String buildString = "CREATE TABLE OTHER_INFO (" +
                "'TTB_ID' INT(16)," + //TODO FOREIGNKEY
                "'Text' VARCHAR(256), " +
                "Constraint otherInfoPK Primary Key (TTB_ID))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch(SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildWine(){
        String buildString = "CREATE TABLE WINE ('pH' DOUBLE(2)," +
                "'TTB_ID' INT(16)," + //TODO FOREIGN KEY
                "'Grape_Varietals' VARCHAR(256)," +
                "'Wine_Appellation' VARCHAR(32), " +
                "Constraint Wine_PK Primary Key (TTB_ID))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildCompany(){
        String buildString = "CREATE TABLE COMPANY (" +
                "'Company_ID' INT(16)," + //TODO Primary Key and Foreign Key
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
                "'TTB_ID' INT(16)," + //TODO FOREIGNKEY
                "'isPrimary' BOOL, " +
                "Constraint Brewers_Permit_PK Primary Key (TTB_ID, Brewers_No))";
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
                "'TTB_ID' INT(16)" + //TODO FOREIGNKEY
                "'Date' TIMESTAMP," +
                "'Expiration' TIMESTAMP," +
                "'Qualification' VARCHAR(256), " +
                "Constraint Approval_PK Primary Key (TTB_ID))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildUser(){
        String buildString = "CREATE TABLE USER (" +
                "'Login_Name' VARCHAR(32)," + //TODO Primary Key
                "'Password' VARCHAR(256))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
    void buildLabel(){
        String buildString = "CREATE TABEL LABEL (" +
                "id int, "+
                "image blob(" + IMAGESIZE + "), " +
                "imageName varchar(64), " +
                "Constraint labels_PK Primary Key (id))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }

    void buildForm(){
        String buildString = "CREATE TABLE FORM (" +
                "TTB_ID INT(16)," +
                "Serial_Number VARCHAR(8)," +
                "Fanciful_Name VARCHAR(256)," +
                "Brand_Name VARCHAR(256)," +
                "Source INT(1)," +
                "APPROVE INT(1)," +
                "Rep_ID VARCHAR(16)," + //TODO Foreign Key
                "Email VARCHAR(256)," +
                "Company_ID INT(16)," + //TODO MAKE A FOREIGN KEY
                "Date_Submitted TIMESTAMP," +
                "Applicant_Name VARCHAR(32)," +
                "Phone VARCHAR(12)," +
                "Alcohol_Type INT(2)" +
                "Constraint form_PK Primary Key (TTB_ID))";
        try {
            PreparedStatement ps = connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
}
