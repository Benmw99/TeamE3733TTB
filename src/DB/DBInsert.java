package DB;

import java.io.FileInputStream;
import java.sql.*;

public class DBInsert extends Database {

    public DBInsert(String path ) {
        super(path);
    }

    //TODO remove this possibly, if unnecessary
    private void sendStatement(String buildString) {
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Inserts an address into the database, attached to the TTB form corresponding to the TTB_ID
     * @param Zip The Zip code, shouldn't exceed 8 chars
     * @param isMailing A Boolean, true iff this is the mailing address
     * @param City The city name, TODO Standardize all string lengths
     * @param State The State, TODO Standardize all string lengths
     * @param Street The street address TODO Standardize all string lengths
     * @param TTB_ID The TTB_ID of the form this address goes with
     * @throws SQLException
     */
    public void insertAddress(String Zip, Boolean isMailing, String City, String State, String Street, int TTB_ID) throws SQLException{
        String insertString = "INSERT INTO ADDRESS (Zip_Code, isMailing, City, Street, State, TTB_ID, ID) VALUES (" +
                "?, ?, ?, ?, ?, ?, NEXT VALUE FOR Address_ID)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setString(1, Zip);
        statement.setBoolean(2, isMailing);
        statement.setString(3, City);
        statement.setString(4, Street);
        statement.setString(5, State);
        statement.setInt(6, TTB_ID);
        statement.execute();
    }

    /**
     *  Inserts an Other_Info entry into the src.DB, attatches to a TTB_Form
     * @param TTB_ID The form to attach to
     * @param text The text of the other info //TODO standardize string length
     * @throws SQLException
     */
    public void insertOtherInfo(int TTB_ID, String text) throws SQLException{
        String insertString = "INSERT INTO OTHERINFO (TTB_ID, Text) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, TTB_ID);
        statement.setString(2, text);
        statement.execute();
    }

    /**
     * Inserts a special wine entry for a wine for a wine, attached to a TTB_Form
     * @param TTB_ID The form to which this is attatched
     * @param Grape_Varietals The grape varietals field for the entry
     * @param Wine_Appellation The wine appellation field for the entry
     * @throws SQLException
     */
    public void insertWine(int TTB_ID, String Grape_Varietals, String Wine_Appellation) throws SQLException{
        String insertString = "INSERT INTO WINE (TTB_ID, Grape_Varietals, Wine_Appellation) VALUES (?,?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, TTB_ID);
        statement.setString(2, Grape_Varietals);
        statement.setString(3, Wine_Appellation);
        statement.execute();
    }

    /**
     *  Inserts a BrewersPermit entry
     * @param Permit_No The brewers permit number
     * @param TTB_ID The form this is associated with
     * @param isPrimary True if and only if this is the primary permit entry for the associated form
     * @throws SQLException
     */
    public void insertBrewersPermit(int Permit_No, int TTB_ID, Boolean isPrimary) throws SQLException{
        String insertString = "INSERT INTO BREWERSPERMIT (Brewers_No, TTB_ID, isPrimary) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, Permit_No);
        statement.setInt(2, TTB_ID);
        statement.setBoolean(3, isPrimary);
        statement.execute();
    }

    /**
     * Inserts an Agent entry
     * @param name The name of the agent
     * @param ID The agent's unique agent ID
     * @param Login_Name the login name the agent will use
     * @param Password The agent's password. //TODO HASH
     * @throws SQLException
     */
    public void insertAgent(String name, int ID, String Login_Name, String Password) throws SQLException{
        String insertString = "INSERT INTO AGENTS (Agent_Name, Agent_ID, Login_Name, Password) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setString(1, name);
        statement.setInt(2, ID);
        statement.setString(3, Login_Name);
        statement.setString(4, Password);
        statement.execute();
    }

    /**
     *  Inserts a comapny entry
     * @param Company_ID The ID For the company
     * @param Company_Name The name of the company
     * @param Login_Name The login name the company will be able to use
     * @param Password The password the company will use //TODO Hash
     * @throws SQLException
     */
    public void insertCompany(int Company_ID, String Company_Name, String Login_Name, String Password) throws SQLException {
        String insertString = "INSERT INTO COMPANY (Company_ID, Company_Name, Login_Name, Password) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, Company_ID);
        statement.setString(2, Company_Name);
        statement.setString(3, Login_Name);
        statement.setString(4, Password);
        statement.execute();
    }

    /**
     *
     * @param Serial_Number
     * @param Fanciful_Name
     * @param Brand_Name
     * @param Source
     * @param Approve
     * @param Rep_ID
     * @param email
     * @param Company_ID
     * @param submitted
     * @param name
     * @param phone
     * @param Alcohol_Type
     * @throws SQLException
     */
    public void insertForm(String Serial_Number, String Fanciful_Name, String Brand_Name, Boolean Source,
                    Boolean Approve, String Rep_ID, String email, int Company_ID, Timestamp submitted, String name,
                    String phone, int Alcohol_Type) throws SQLException {
        String insertString = "INSERT INTO FORM (TTB_ID, Serial_Number, Fanciful_Name, Brand_Name, Source, Approve," +
                " Rep_ID, Email, Company_ID, Date_Submitted, Applicant_Name, Phone, Alcohol_Type) " +
                "VALUES (NEXT VALUE FOR Form_ID, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setString(1, Serial_Number);
        statement.setString(2, Fanciful_Name);
        statement.setString(3, Brand_Name);
        statement.setBoolean(4, Source);
        statement.setBoolean(5, Approve);
        statement.setString(6, Rep_ID);
        statement.setString(7, email);
        statement.setInt(8, Company_ID);
        statement.setTimestamp(9, submitted);
        statement.setString(10, name);
        statement.setString(11, phone);
        statement.setInt(12, Alcohol_Type);
        statement.execute();
    }



    /**
     * Inserts a representative into the Database.
     * @param Rep_ID The Rep_ID for the new representative
     * @throws SQLException
     */
    public void insertReps(String Rep_ID, String login, String password) throws SQLException{
        String insertString = "INSERT INTO REPS (Rep_ID, Login_Name, Password) VALUES (?, ?, ?)";
        PreparedStatement statement =  connection.prepareStatement(insertString);
        statement.setString(1, Rep_ID);
        statement.setString(2, login);
        statement.setString(3, password);
        statement.execute();
    }

    /**
     * Inserts a label into the database
     * @param input A FileInputStream that was made from the input image
     * @param fileName The file name of that image
     * @throws SQLException
     */
    public void insertLabel(FileInputStream input, String fileName) throws SQLException{
        String insertString = "INSERT INTO LABEL VALUES (NEXT VALUE FOR Label_ID, ?, ?)";
        PreparedStatement statement =  connection.prepareStatement(insertString);
        statement.setBinaryStream(1, input);
        statement.setString(2, fileName);
        statement.execute();
    }

    /**
     * Inserts approval into the database
     * @param appovingAgent The approving agents name
     * @param TTB_ID The TTB ID of the form that is being approved
     * @param date The date of its approval
     * @param expiration The expiration of the approved form
     * @param qualification Any special qualification the agent writes in
     * @throws SQLException
     */
    public void insertApproval(String appovingAgent, int TTB_ID, Timestamp date, Timestamp expiration, String qualification) throws SQLException {
        String insertString = "INSERT INTO APPROVAL VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setString(1, appovingAgent);
        statement.setInt(2, TTB_ID);
        statement.setTimestamp(3, date);
        statement.setTimestamp(4, expiration);
        statement.setString(5, qualification);
        statement.execute();
    }
    //TODO APPROVE FORM --> Make UPDATE
}
