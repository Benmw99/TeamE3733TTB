package DB;

import Entities.SearchResult;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DBSelect extends DatabaseAbstract {
    private static DBSelect dbSelect_instance = null;

//TODO MAKE ALL SELECTS RETURN ENTITIES
    private DBSelect(String path) {
        super(path);
    }

    static DBSelect getInstance() {
        if (dbSelect_instance == null) {
            dbSelect_instance = new DBSelect("./ttb.db");
        }
        return dbSelect_instance;
    }

    private ResultSet sendQuery(String queryString){
        ResultSet rs = null;
        try{
            PreparedStatement ps = connection.prepareStatement(queryString);
            rs = ps.executeQuery();
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return rs;
    }

    public ResultSet selectAllReps(){
        String selectString = "SELECT * FROM REPS";
        return sendQuery(selectString);
    }
    public ResultSet selectRepByID(String Rep_ID){
        String selectString = "SELECT * FROM REPS WHERE Rep_ID='";
        selectString += Rep_ID += "'";
        return sendQuery(selectString);
    }
    public ResultSet selectAllCompany(){
        String selectString = "SELECT * FROM COMPANY";
        return sendQuery(selectString);
    }
    public ResultSet selectAllAgents(){
        String selectString = "SELECT * FROM AGENTS";
        return sendQuery(selectString);
    }
    public ResultSet selectAllForms() {
        String selectString = "SELECT * FROM FORM";
        return sendQuery(selectString);
        //TODO GET THE REST OF THE SHIT
    }
    public ResultSet selectAllAddress() {
        String selectString = "SELECT ID, Street FROM ADDRESS";
        return sendQuery(selectString);
    }
    //Will return something else later
    //To be used for displaying a companies submitted forms
    public ResultSet selectByCompany(int companyID) {
        //Serial number or TTB_ID?
        String selectString = "SELECT TTB_ID, Date_Submitted, reviewDate FROM COMPANY WHERE Company_ID = ?";
        ResultSet rset = null;
        try {
            PreparedStatement statement = connection.prepareStatement(selectString);
            statement.setInt(1, companyID);
            rset = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return rset;
    }

    public Boolean AuthenticateCompany(String login, String pass) {
        String selectString = "SELECT COUNT(*) FROM COMPANY WHERE Login_Name =? AND Password =? ";
        return doAuthenticate(login, pass, selectString);
    }

    public Boolean AuthenticateAgent(String login, String pass) {
        String selectString = "SELECT COUNT(*) FROM AGENTS WHERE Login_Name =? AND Password =? ";
        return doAuthenticate(login, pass, selectString);
    }

    public Boolean AuthenticateRep(String login, String pass) {
        String selectString = "SELECT COUNT(*) FROM REPS WHERE Login_Name =? AND Password =? ";
        return doAuthenticate(login, pass, selectString);
    }

    /**
     * A Helper function for authentication
     * @param login The login name
     * @param pass The password
     * @param selectString The select string for the table to authenticate against
     * @return True if the login is valid, else false
     */
    private Boolean doAuthenticate(String login, String pass, String selectString) {
        try {
            PreparedStatement statement = connection.prepareStatement(selectString);
            statement.setString(1, login);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            rs.next();
            if(rs.getInt(1) > 0){
                statement.close();
                return true;
            } else {
                statement.close();
                return false;
            }
        } catch(SQLException e){
            return false;
        }
    }
    //DONE AUTHENTICATE

    /**
     * Downloads the selected results in a file without limit to the number of results
     * @param query The query to be downloaded without a fetch first in it
     */
    public boolean downloadResults(String query) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String download = "CALL SYSCS_UTIL.SYSCS_EXPORT_QUERY (?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(download);
            ps.setString(1,query);
            ps.setString(2,"TTBSearch" + dateFormat.format(date) + ".csv");
            ps.setString(3,null);
            ps.setString(4,null);
            ps.setString(5,null);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    //Figure out what this is passed
    //TODO FINISH THIS
    public Entities.SearchResult searchBy() {
        SearchResult result = new SearchResult();
        String baseString = "SELECT * FROM Form";


        return result;
    }

    //TODO SELECT BY TYPE

    public void selectFormsWithData(){
// this will probably return Type Form
    }
    //TODO SELECT BY OWNER

    //TODO BIG OL' SELECT FUNCTION FOR FORMS
}
