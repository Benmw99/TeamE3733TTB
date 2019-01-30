import java.sql.*;

//This class may very well not exist on the final project, I'm really just using this as a place to store all the SQL
//strings as I write them. We definitely need to write those, lol.
//Even if this class doesn't exist in the final all these create tables will be
public class TableBuilder {
    private Connection connection;
    private static final String IMAGESIZE = "1M";

    TableBuilder(String path){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

     void resetDB() {
        try {
            String dropString = "Drop table Address";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Wine";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Approval";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table BrewersPermit";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table OtherInfo";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Label";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Form";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Agents";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Reps";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        try {
            String dropString = "Drop table Company";
            PreparedStatement ps =  connection.prepareStatement(dropString);
            ps.execute();
        } catch (SQLException e) {}
        System.out.println("Build Agents");
        buildAgents();
        System.out.println("Build Reps");
        buildReps();
        System.out.println("Build Company");
        buildCompany();
        System.out.println("Build Form");
        buildForm();
        System.out.println("Build Permit");
        buildBrewersPermit();
        System.out.println("Build Approval");
        buildApproval();
        System.out.println("Build Address");
        buildAddress();
        System.out.println("Build Other Info");
        buildOtherInfo();
        System.out.println("Build Wine");
        buildWine();
        System.out.println("Build Label");
        buildLabel();
    }

    void sendStatement(String buildString) {
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    ResultSet sendQuery(String queryString){
        ResultSet rs = null;
        try{
            PreparedStatement ps = connection.prepareStatement(queryString);
            rs = ps.executeQuery();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return rs;
    }

    private void buildAddress(){
        String buildString = "CREATE TABLE ADDRESS (" +
                "Zip_Code VARCHAR(8), " +
                "isMailing BOOLEAN, " +
                "City VARCHAR(32), " +
                "TTB_ID BIGINT, " +
                "State VARCHAR(2), " +
                "Street_Name VARCHAR(32), " +
                "ID BIGINT," +
                "Constraint Address_PK Primary Key (ID), " +
                "Constraint Address_FK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildOtherInfo(){
        String buildString = "CREATE TABLE OTHERINFO (" +
                "TTB_ID BIGINT," +
                "Text VARCHAR(256), " +
                "Constraint OtherInfoPK Primary Key (TTB_ID), " +
                "Constraint OtherInfoFK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildWine(){
        String buildString = "CREATE TABLE WINE (" +
                "TTB_ID BIGINT," +
                "Grape_Varietals VARCHAR(256)," +
                "Wine_Appellation VARCHAR(32), " +
                "Constraint Wine_PK Primary Key (TTB_ID), " +
                "Constraint Wine_FK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildBrewersPermit(){
        String buildString = "CREATE TABLE BREWERSPERMIT (" +
                "Brewers_No BIGINT," +
                "TTB_ID BIGINT," +
                "isPrimary BOOLEAN, " +
                "Constraint BrewersPermit_PK Primary Key (TTB_ID, Brewers_No), " +
                "Constraint BrewersPermit_FK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildApproval(){
        String buildString = "CREATE TABLE APPROVAL (" +
                "Approving_Agent VARCHAR(32)," +
                "TTB_ID BIGINT," +
                "Date TIMESTAMP," +
                "Expiration TIMESTAMP," +
                "Qualification VARCHAR(256), " +
                "Constraint Approval_PK Primary Key (TTB_ID), " +
                "Constraint Approval_FK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildLabel(){
        String buildString = "CREATE TABLE LABEL (" +
                "ID BIGINT, " +
                "Image blob(" + IMAGESIZE + "), " +
                "ImageName varchar(64), " +
                "TTB_ID BIGINT, " +
                "Constraint Label_PK Primary Key (id), " +
                "Constraint Label_FK Foreign Key (TTB_ID) References Form(TTB_ID) On Delete Cascade)";
        sendStatement(buildString);
    }

    private void buildForm(){
        String buildString = "CREATE TABLE FORM (" +
                "TTB_ID BIGINT," +
                "Serial_Number VARCHAR(8)," +
                "Fanciful_Name VARCHAR(256)," +
                "Brand_Name VARCHAR(256)," +
                "Source SMALLINT," +
                "APPROVE SMALLINT," +
                "Rep_ID VARCHAR(16)," +
                "Email VARCHAR(256)," +
                "Company_ID BIGINT," +
                "Date_Submitted TIMESTAMP," +
                "Applicant_Name VARCHAR(32)," +
                "Phone VARCHAR(12)," +
                "Alcohol_Type SMALLINT," +
                "Constraint Form_PK Primary Key (TTB_ID), " +
                "Constraint Form_FK_Rep Foreign Key (Rep_ID) References Reps(Rep_ID), " +
                "Constraint Form_FK_Company Foreign Key (Company_ID) References Company(Company_ID))";
        sendStatement(buildString);
    }

    private void buildAgents() {
        String buildString = "CREATE TABLE AGENTS (" +
                "Agent_Name VARCHAR(32), " +
                "Agent_ID BIGINT, " +
                "Login_Name VARCHAR(32), " +
                "Password VARCHAR(256), " +
                "Constraint Agents_PK Primary Key (Login_Name), " +
                "Constraint Agents_UQ Unique (Agent_ID))";
        sendStatement(buildString);
    }

    private void buildReps() {
        String buildString = "CREATE TABLE REPS (" +
                "Rep_ID VARCHAR(16), " +
                "Login_Name VARCHAR(32), " +
                "Password VARCHAR(256), " +
                "Constraint Reps_PK Primary Key (Login_Name), " +
                "Constraint Reps_UQ Unique (Rep_ID))";
        sendStatement(buildString);
    }

    private void buildCompany(){
        String buildString = "CREATE TABLE COMPANY (" +
                "Company_ID BIGINT," +
                "Company_Name VARCHAR(256), " +
                "Login_Name VARCHAR(32), " +
                "Password VARCHAR(256), " +
                "Constraint Company_PK Primary Key (Login_Name), " +
                "Constraint Company_UQ Unique (Company_ID))";
        sendStatement(buildString);
    }

    //TODO communicate w/ rest of team about REP Data Type
    ResultSet selectAllReps(){
        String selectString = "SELECT * FROM REPS";
        return sendQuery(selectString);
    }
    ResultSet selectRepByID(String Rep_ID){
        String selectString = "SELECT * FROM REPS WHERE Rep_ID='";
        selectString += Rep_ID += "'";
        return sendQuery(selectString);
    }
    ResultSet selectAllCompany(){
        String selectString = "SELECT * FROM COMPANY";
        return sendQuery(selectString);
    }
    ResultSet selectAllAgents(){
        String selectString = "SELECT * FROM AGENTS";
        return sendQuery(selectString);
    }


}
