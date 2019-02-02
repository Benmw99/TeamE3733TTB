package DB;

import Entities.Agent;
import Entities.AlcoholType;
import Entities.Form;
import Entities.Manufacturer;
import java.lang.Exception;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBSelect extends Database {
//TODO MAKE ALL SELECTS RETURN ENTITIES
    public DBSelect(String path) {
        super(path);
    }

    private ResultSet sendQuery(String queryString){
        ResultSet rs = null;
        try{
            PreparedStatement ps = connection.prepareStatement(queryString);
            rs = ps.executeQuery();
        } catch (SQLException e){

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

    public Boolean AuthenticateCompany(String login, String pass) {
        String selectString = "SELECT COUNT(*) FROM COMPANY WHERE Login_Name =? AND Password =? ";
        return doAuthenticate(login, pass, selectString);
    }

    public Boolean AuthenticateAgent(String login, String pass) {
        String selectString = "SELECT COUNT(*) FROM AGENTS WHERE Login_Name =? AND Password =? ";
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

    public Manufacturer getManufacturer(String login_name) throws Exception{
        String selString = "SELECT * FROM COMPANY WHERE Login_Name=?";
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setString(1, login_name);
            ResultSet rs = ps.executeQuery();
            //TODO When NICK WRITES A VALID MANUFACTURER CONSTRUCTOR, I WILL PASS THE NEEDED INFO INTO THERE
            return new Manufacturer();
        } catch (SQLException e) {
            System.out.println("No Company found.");
            System.out.println(e.toString());
            throw new Exception("Company Does Not Exist.");
        }
    }

    /**
     * Get a List of TTB_ID's associated with the manufactuer
     * @param man The manufacturer who has logged in to look at their forms
     * @return A list of Ints representing their TTB_ID's
     */
    public List<Integer> getTTB_IDbyManufactuer(Manufacturer man){
        String selString = "SELECT TTB_ID FROM FORM WHERE Company_ID=? ";
        int comp_id = man.manID;
        List<Integer> list_of_ids= new ArrayList<Integer>();
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setInt(1, comp_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                list_of_ids.add(rs.getInt("TTB_ID"));
            }
        }catch (SQLException e){
                System.out.println(e.toString());
            }
        return list_of_ids;
        }

    public Form getFormByTTB_ID(int TTB_ID){
        String selString = "SELECT * FROM FORM WHERE TTB_ID=?";
        String otherInfString = "SELECT * FROM OTHERINFO WHERE TTB_ID=?";
        String brewersPermit = "SELECT * FROM BREWERSPERMIT WHERE TTB_ID=?";
        String addressString = "SELECT * FROM ADDRESS WHERE TTB_ID = ?";
        List<String> list_permits = new ArrayList<String>();
        Form form = new Form();
        //TODO Communicate with Nick about addresses.
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setInt(1, TTB_ID);
            ResultSet rs = ps.executeQuery();
            rs.first();
            form.setFancifulName(rs.getString("Fanciful_Name"));
            form.setBrandName(rs.getString("Brand_Name"));
            form.setSource(rs.getBoolean("Source"));
            form.setRepID(rs.getString("Rep_ID"));
            form.setTtbID(TTB_ID);
            form.setEmail(rs.getString("Email"));
            form.setDateSubmitted(rs.getTimestamp("Date_Submitted")); //TODO HANDLE CONVERSION
            form.setApplicantName(rs.getString("Applicant_Name"));
            form.setPhoneNum(rs.getString("Phone"));
            AlcoholType type;
            if (rs.getInt("Alcohol_Type") == 1) {
                type = AlcoholType.Wine;
            } else if (rs.getInt("Alcohol_Type") == 2) {
                type = AlcoholType.MaltBeverage;
            } else {
                type = AlcoholType.DistilledLiquor;
            }
            form.setAlcoholType(type);
            ps.close();
            /* OTHER INFO BLOCK */
            ps = connection.prepareStatement(otherInfString);
            ps.setInt(1, TTB_ID);
            rs = ps.executeQuery();
            rs.first();
            form.setOtherInfo(rs.getString("Text"));
            ps.close();
            /* BREWERS PERMIT BLOCK */
            ps = connection.prepareStatement(brewersPermit);
            ps.setInt(1, TTB_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list_permits.add(rs.getString("Brewers_No"));
            }
            form.setBrewersPermit(list_permits.get(0)); //TODO MAKE THIS TAKE A WHOLE LIST
            ps.close();
            /* Address Block */
            ps = connection.prepareStatement(addressString);
            ps.setInt(1, TTB_ID);
            rs = ps.executeQuery();
            while(rs.next()){
                // This doesn't do anything just yet
            }
            ps.close();
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return form;
    }
    //TODO SELECT BY TYPE

    public void selectFormsWithData(){
// this will probably return Type Form
    }
    //TODO SELECT BY OWNER



    //TODO BIG OL' SELECT FUNCTION FOR FORMS
}
