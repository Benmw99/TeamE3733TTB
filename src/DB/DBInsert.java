package DB;

import java.sql.*;

public class DBInsert {
    private Connection connection;

    public DBInsert(String path ){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    private void sendStatement(String buildString) {
        try {
            PreparedStatement ps =  connection.prepareStatement(buildString);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Inserts an address into the database, attatched to the TTB form corresponding to the TTB_ID
     * @param Zip The Zip code, shouldn't exceed 8 chars
     * @param isMailing A Boolean, true iff this is the mailing address
     * @param City The city name, TODO Standardize all string lengths
     * @param State The State, TODO Standardize all string lengths
     * @param Street The street address TODO Standardize all string lengths
     * @param TTB_ID The TTB_ID of the form this address goes with
     * @param ID The unique ID for this form. May be auto generated later...
     * @throws SQLException
     */
    public void insertAddress(String Zip, Boolean isMailing, String City, String State, String Street, int TTB_ID, int ID) throws SQLException{
        String insertString = "INSERT INTO ADDRESS (Zip_Code, isMailing, City, Street_Name, State, TTB_ID, ID) VALUES (" +
                "?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setString(1, Zip);
        statement.setBoolean(2, isMailing);
        statement.setString(3, City);
        statement.setString(4, Street);
        statement.setString(5, State);
        statement.setInt(6, TTB_ID);
        statement.setInt(7, ID);
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
        String insertString = "INSERT INTO AGENTS (Name, Agent_ID, Login_Name, Password) VALUES (?, ?, ?, ?)";
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
     * @param TTB_ID
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
    public void insertForm(int TTB_ID, String Serial_Number, String Fanciful_Name, String Brand_Name, Boolean Source,
                    Boolean Approve, String Rep_ID, String email, int Company_ID, Timestamp submitted, String name,
                    String phone, int Alcohol_Type) throws SQLException {
        String insertString = "INSERT INTO FORM (TTB_ID, Serial_Number, Fanciful_Name, Brand_Name, Source, Approve," +
                " Rep_ID, Email, Company_ID, Date_Submitted, Applicant_Name, Phone, Alcohol_Type) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, TTB_ID);
        statement.setString(2, Serial_Number);
        statement.setString(3, Fanciful_Name);
        statement.setString(4, Brand_Name);
        statement.setBoolean(5, Source);
        statement.setBoolean(6, Approve);
        statement.setString(7, Rep_ID);
        statement.setString(8, email);
        statement.setInt(9, Company_ID);
        statement.setTimestamp(10, submitted);
        statement.setString(11, name);
        statement.setString(12, phone);
        statement.setInt(13, Alcohol_Type);
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
}
