import java.sql.*;


//This class may very well not exist on the final project, I'm really just using this as a place to store all the SQL
//strings as I write them. We definitely need to write those, lol.
//Even if this class doesn't exist in the final all these methods and strings will be used
public class TableBuilder {
    private Connection connection;
    private static final String IMAGESIZE = "1M";

    TableBuilder(String path){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
        }
    }

    void resetDB() {
        try {
            String dropString = "Drop table Address";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Wine";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Agents";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Reps";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Company";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Approval";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table BrewersPermit";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table OtherInfo";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Label";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Users";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Form";
            Statement stmt = connection.createStatement();
            stmt.execute(dropString);
        } catch (SQLException e) {}
        //These might not be in the right order for foreign keys
        buildForm();
        System.out.println("Build Form");
        buildUser();
        System.out.println("Build Users");
        buildBrewersPermit();
        System.out.println("Build Permit");
        buildApproval();
        System.out.println("Build Approval");
        buildAddress();
        System.out.println("Build Address");
        buildCompany();
        System.out.println("Build Company");
        buildOtherInfo();
        System.out.println("Build Other Info");
        buildWine();
        System.out.println("Build Wine");
        buildLabel();
        System.out.println("Build Label");
        buildAgents();
        System.out.println("Build Agents");
        buildReps();
        System.out.println("Build Reps");
    }

    void sendStatement(String buildString) {
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println("SQL State: " + e.getErrorCode());
            System.out.println("Error Code: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());
        }
    }

    void buildAddress(){
        String buildString = "CREATE TABLE ADDRESS (" +
                "Zip_Code VARCHAR(8), " +
                "isMailing BOOLEAN, " +
                "City VARCHAR(32), " +
                "TTB_ID BIGINT, " + //TODO FOREIGNKEY, Primary Key
                "State VARCHAR(2), " +
                "Street_Name VARCHAR(32))";
        sendStatement(buildString);
    }

    void buildOtherInfo(){
        String buildString = "CREATE TABLE OTHERINFO (" +
                "TTB_ID BIGINT," + //TODO FOREIGNKEY
                "Text VARCHAR(256), " +
                "Constraint otherInfoPK Primary Key (TTB_ID))";
        sendStatement(buildString);
    }

    void buildWine(){
        String buildString = "CREATE TABLE WINE (" +
                "pH REAL," + //Might need to make that bigger to store more precision
                "TTB_ID BIGINT," + //TODO FOREIGN KEY
                "Grape_Varietals VARCHAR(256)," +
                "Wine_Appellation VARCHAR(32), " +
                "Constraint Wine_PK Primary Key (TTB_ID))";
        sendStatement(buildString);
    }

    void buildCompany(){
        String buildString = "CREATE TABLE COMPANY (" +
                "Company_ID BIGINT," + //TODO Foreign Key/Inheritance
                "Company_Name VARCHAR(256))";
        sendStatement(buildString);
    }

    void buildBrewersPermit(){
        String buildString = "CREATE TABLE BREWERSPERMIT (" +
                "Brewers_No BIGINT," +
                "TTB_ID BIGINT," + //TODO FOREIGNKEY
                "isPrimary BOOLEAN, " +
                "Constraint Brewers_Permit_PK Primary Key (TTB_ID, Brewers_No))";
        sendStatement(buildString);
    }
    void buildApproval(){
        String buildString = "CREATE TABLE APPROVAL (" +
                "Approving_Agent VARCHAR(32)," +
                "TTB_ID BIGINT," + //TODO FOREIGNKEY
                "Date TIMESTAMP," +
                "Expiration TIMESTAMP," +
                "Qualification VARCHAR(256), " +
                "Constraint Approval_PK Primary Key (TTB_ID))";
        sendStatement(buildString);
    }

    void buildUser(){
        String buildString = "CREATE TABLE USERS (" +
                "Login_Name VARCHAR(32), " + //TODO Primary Key
                "Password VARCHAR(256))";
        sendStatement(buildString);
    }
    void buildLabel(){
        String buildString = "CREATE TABLE LABEL (" +
                "ID BigInt, " +
                "Image blob(" + IMAGESIZE + "), " +
                "ImageName varchar(64), " +
                "Constraint labels_PK Primary Key (id))";
        sendStatement(buildString);
    }

    void buildForm(){
        String buildString = "CREATE TABLE FORM (" +
                "TTB_ID BIGINT," +
                "Serial_Number VARCHAR(8)," +
                "Fanciful_Name VARCHAR(256)," +
                "Brand_Name VARCHAR(256)," +
                "Source SMALLINT," +
                "APPROVE SMALLINT," +
                "Rep_ID VARCHAR(16)," + //TODO Foreign Key
                "Email VARCHAR(256)," +
                "Company_ID BIGINT," + //TODO MAKE A FOREIGN KEY
                "Date_Submitted TIMESTAMP," +
                "Applicant_Name VARCHAR(32)," +
                "Phone VARCHAR(12)," +
                "Alcohol_Type SMALLINT," +
                "Constraint form_PK Primary Key (TTB_ID))";
        sendStatement(buildString);
    }

    void buildAgents() {
        String buildString = "CREATE TABLE AGENTS (" +
                "Agent_Name VARCHAR(32), " +
                "Agent_ID BIGINT)"; //TODO Foreign key/inheritance
        sendStatement(buildString);
    }

    void buildReps() {
        String buildString = "CREATE TABLE REPS (" +
                "RepID VARCHAR(16))"; //TODO Foreign key/inheritance
        sendStatement(buildString);
    }
}
