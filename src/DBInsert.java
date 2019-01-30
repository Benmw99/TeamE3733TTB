import java.sql.*;

public class DBInsert {
    private Connection connection;
    DBInsert(String path ){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Inserts a representative into the Database.
     * @param Rep_ID The Rep_ID for the new representative
     * @throws SQLException
     */
    void insertReps(String Rep_ID) throws SQLException{
        String insertString = "INSERT INTO REPS (Rep_ID) VALUES (?)"; //TODO the rest of the rep info to insert
        PreparedStatement statement =  connection.prepareStatement(insertString);
        statement.setString(1, Rep_ID);
        statement.execute();
    }

    void sendStatement(String buildString) {
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
    void insertAddress(String Zip, Boolean isMailing, String City, String State, String Street, int TTB_ID, int ID) throws SQLException{
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
     *  Inserts an Other_Info entry into the DB, attatches to a TTB_Form
     * @param TTB_ID The form to attach to
     * @param text The text of the other info //TODO standardize string length
     * @throws SQLException
     */
    void insertOtherInfo(int TTB_ID, String text) throws SQLException{
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
    void insertWine(int TTB_ID, String Grape_Varietals, String Wine_Appellation) throws SQLException{
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
    void insertBrewersPermit(int Permit_No, int TTB_ID, Boolean isPrimary) throws SQLException{
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
    void insertAgent(String name, int ID, String Login_Name, String Password) throws SQLException{
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
    void insertCompany(int Company_ID, String Company_Name, String Login_Name, String Password) throws SQLException {
        String insertString = "INSERT INTO COMPANY (Company_ID, Company_Name, Login_Name, Password) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(insertString);
        statement.setInt(1, Company_ID);
        statement.setString(2, Company_Name);
        statement.setString(3, Login_Name);
        statement.setString(4, Password);
        statement.execute();
    }

}
