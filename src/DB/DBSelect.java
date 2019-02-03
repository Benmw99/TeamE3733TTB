package DB;

import Entities.SearchResult;

import Entities.*;
import Entities.AlcoholType;
import Entities.Form;
import Entities.Manufacturer;
import java.lang.Exception;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


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
    public boolean downloadResults(String query, AdvancedSearch search) { //TODO GET RID OF DUPLICATE CODE
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String download = "CALL SYSCS_UTIL.SYSCS_EXPORT_QUERY ("+ query +",?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(download);
            int set = 1;
            if (search.source != null) {
                ps.setBoolean(set, search.source);
                set += 1;
            }
            if (search.serialNumber != null) {
                ps.setString(set, search.serialNumber);
                set += 1;
            }
            if (search.brandName != null) {
                ps.setString(set, search.brandName);
                set += 1;
            }
            if (search.fancifulName != null) {
                ps.setString(set, search.fancifulName);
                set += 1;
            }
            if (search.type == 1 && search.vintageYear > 0) {
                ps.setInt(set, search.vintageYear);
                set += 1;
            }
            if (search.type == 1 && search.pH > 0) {
                ps.setFloat(set, search.pH);
                set += 1;
            }
            if (search.type == 1 && search.grapeVarietal != null) {
                ps.setString(set, search.grapeVarietal);
                set += 1;
            }
            if (search.type == 1 && search.appellation != null) {
                ps.setString(set, search.appellation);
                set += 1;
            }
            if (search.ttbID > 0) {
                ps.setInt(set, search.ttbID);
                set += 1;
            }
            ps.setString(set + 1,"TTBSearch" + dateFormat.format(date) + ".csv");
            ps.setString(set + 2,null);
            ps.setString(set + 3,null);
            ps.setString(set + 4,null);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    //TODO Implement Sorting
    //public Timestamp timestamp; NOT IMPLEMENTED YET
    //THIS IS THE CIVILIAN SEARCH
    public SearchResult searchBy(AdvancedSearch as) { //TODO GET RID OF DUPLICATE CODE
        SearchResult result = new SearchResult();
        result.setSearch(as);
        //The base search string
        String baseString;
        if (as.type == 1 && ((as.vintageYear > 0) || (as.pH > 0) || (as.grapeVarietal != null) || (as.appellation != null))) {
            baseString = "SELECT TTB_ID FROM Form JOIN Wine ON Form.TTB_ID = Wine.TTB_ID WHERE APPROVE = TRUE";
        } else {
            baseString = "SELECT TTB_ID FROM Form WHERE APPROVE = TRUE";
        }
        //Manually goes through and checks if stuff is set and then adds it to the string. Later it will set all those question marks
        if (as.source != null) {
            baseString += " AND Source = ?";
        }
        if (as.serialNumber != null) {
            baseString += " AND Serial_Number = ?";
        }
        if (as.alcoholType != null) {
            baseString += " AND Alcohol_Type = " + as.type;
        }
        if (as.brandName != null) {
            baseString += " AND Brand_Name = ?";
        }
        if (as.fancifulName != null) {
            baseString += " AND Fanciful_Name = ?";
        }
        if (as.type == 1 && as.vintageYear > 0) {
            baseString += " AND Vintage = ?";
        }
        if (as.type == 1 && as.pH > 0) {
            baseString += " AND PH = ?";
        }
        if (as.type == 1 && as.grapeVarietal != null) {
            baseString += " AND Grape_Varietals = ?";
        }
        if (as.type == 1 && as.appellation != null) {
            baseString += " AND Wine_Appellation = ?";
        }
        if (as.ttbID > 0) {
            baseString += " AND TTB_ID = ?";
        }
        result.setQuery(baseString);
        System.out.println(baseString);
        if (as.numResults > 0) {
            baseString = baseString + " FETCH NEXT " + as.numResults + " ROWS ONLY";
        }
        try {
            PreparedStatement statement = connection.prepareStatement(baseString);

            //Manually sets those question marks
            int set = 1;
            if (as.source != null) {
                statement.setBoolean(set, as.source);
                set += 1;
            }
            if (as.serialNumber != null) {
                statement.setString(set, as.serialNumber);
                set += 1;
            }
            if (as.brandName != null) {
                statement.setString(set, as.brandName);
                set += 1;
            }
            if (as.fancifulName != null) {
                statement.setString(set, as.fancifulName);
                set += 1;
            }
            if (as.type == 1 && as.vintageYear > 0) {
                statement.setInt(set, as.vintageYear);
                set += 1;
            }
            if (as.type == 1 && as.pH > 0) {
                statement.setFloat(set, as.pH);
                set += 1;
            }
            if (as.type == 1 && as.grapeVarietal != null) {
                statement.setString(set, as.grapeVarietal);
                set += 1;
            }
            if (as.type == 1 && as.appellation != null) {
                statement.setString(set, as.appellation);
                set += 1;
            }
            if (as.ttbID > 0) {
                statement.setInt(set, as.ttbID);
                set += 1;
            }

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                result.addResult(getFormByTTB_ID(rs.getInt("TTB_ID")));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return result;
    }

    public Manufacturer getManufacturer(String login_name) throws Exception{
        String selString = "SELECT * FROM COMPANY WHERE Login_Name=?";
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setString(1, login_name);
            ResultSet rs = ps.executeQuery();
            //TODO When NICK WRITES A VALID MANUFACTURER CONSTRUCTOR, I WILL PASS THE NEEDED INFO INTO THERE
            return new Manufacturer(rs.getInt("Company_ID"), rs.getString("Company_Name"), rs.getString("Login_Name"),
                    rs.getString("Password"));
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
    public List<Integer> getTUB_IDblManufacturer(Manufacturer man){
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

    /**
     * Retrieves the form according to the minimal Application
     * @param TTB_ID The TTB_ID of the form to retrieve
     * @return
     */
    public Form getFormMinimal(int TTB_ID){
        String selString = "SELECT * FROM FORM WHERE TTB_ID=?";
        String wineString = "SELECT * FROM WINE WHERE TTB_ID=?";
        Form form = new Form();
        WineFormItems wine;
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setInt(1, TTB_ID);
            ResultSet rs = ps.executeQuery();
            form.setAlcoholContent(rs.getFloat("Alcohol_Content"));
            AlcoholType type;
            if (rs.getInt("Alcohol_Type") == 1) {
                type = AlcoholType.Wine;
            } else if (rs.getInt("Alcohol_Type") == 2) {
                type = AlcoholType.MaltBeverage;
            } else {
                type = AlcoholType.DistilledLiquor;
            }
            if(type == AlcoholType.Wine){
                ps.close();
                ps = connection.prepareStatement(wineString);
                rs = ps.executeQuery();
                wine = new WineFormItems();
                wine.setpH(rs.getFloat("pH"));
                wine.setVintageYear(rs.getInt("Vintage_Year"));
                form.setWineFormItems(wine);
            }
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return form;
    }


    /**
     *  We will get back to this later... it's very important, but not very important right now.
     * @param TTB_ID
     * @return
     */
    public Form getFormByTTB_ID(int TTB_ID){
        String selString = "SELECT * FROM FORM WHERE TTB_ID=?";
        String otherInfString = "SELECT * FROM OTHERINFO WHERE TTB_ID=?";
        String brewersPermit = "SELECT * FROM BREWERSPERMIT WHERE TTB_ID=?";
        String addressString = "SELECT * FROM ADDRESS WHERE TTB_ID = ?";
        ArrayList<String> list_permits = new ArrayList<String>();
        ArrayList<Address> addresses = new ArrayList<Address>();
        Form form = new Form();
        //TODO Communicate with Nick about addresses.
        try {
            PreparedStatement ps = connection.prepareStatement(selString);
            ps.setInt(1, TTB_ID);
            ResultSet rs = ps.executeQuery();
            rs.next();
            form.setFancifulName(rs.getString("Fanciful_Name"));
            form.setBrandName(rs.getString("Brand_Name"));
            form.setSource(rs.getBoolean("Source"));
            form.setRepID(rs.getString("Rep_ID"));
            form.setTtbID(TTB_ID);
            form.setEmail(rs.getString("Email"));
            form.setDateSubmitted(rs.getTimestamp("Date_Submitted")); //TODO HANDLE CONVERSION
            form.setApplicantName(rs.getString("Applicant_Name"));
            form.setPhoneNumber(rs.getString("Phone"));
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
            rs.next();
            form.setBlownBrandedEmbossedInfo(rs.getString("Text"));
            ps.close();
            /* BREWERS PERMIT BLOCK */
            ps = connection.prepareStatement(brewersPermit);
            ps.setInt(1, TTB_ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list_permits.add(rs.getString("Brewers_No"));
            }
            form.setBrewersPermit(list_permits);
            ps.close();
            /* Address Block */
            ps = connection.prepareStatement(addressString);
            ps.setInt(1, TTB_ID);
            rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getBoolean("isMailing")){
                   Address mailing = new Address(rs.getString("City"), rs.getString("State"),
                           rs.getString("Zip_Code"), rs.getString("Street"), "NAME");
                   //TODO RESOLVE PROBLEMS WITH NAME
                } else {
                    addresses.add(new Address(rs.getString("City"), rs.getString("State"),
                            rs.getString("Zip_Code"), rs.getString("Street"), "NAME"));
                }
            }
            form.setAddress(addresses);
            ps.close();
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return form;
    }

    /**Get first three not-yet-approved forms for an agent to look over
     *
     */

    public List<Form> getThreeForms(){
        String selStr = "SELECT * FROM FORM WHERE APPROVE=?";
        List<Integer> list_ID = new ArrayList<Integer>();
        List<Form> list_form = new ArrayList<Form>();
        try{
            PreparedStatement ps = connection.prepareStatement(selStr);
            ps.setBoolean(1, false);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while(rs.next() && i < 3){
                i ++;
                list_ID.add(rs.getInt("TTB_ID"));
            }
            ps.close();
    } catch (SQLException e){
            System.out.println(e.toString());
        }
        while(!list_ID.isEmpty()){
            list_form.add(this.getFormByTTB_ID(list_ID.get(0)));
            list_ID.remove(0);
        }
        return list_form;
    }

    //TODO MAKE AN UPDATE CLASS

    public void approveForm(Form form, Approval approval){
        String selStr = "UPDATE FORM SET APPROVAL=? WHERE ID=? ";
        try{
            PreparedStatement ps = connection.prepareStatement(selStr);
            ps.setInt(2, form.getTtbID());
            ps.setBoolean(1, true);
            ps.execute();
            ps.close();
            //TODO MAKE AN INSERT APPROVAL ONCE APPROVALS MAKE SENSE
    } catch (SQLException e){
            System.out.println(e.toString());
        }
    }




/*
    public ArrayList<Address> getListAddress(int TTB_ID){
        String addressString = "SELECT * FROM ADDRESS WHERE TTB_ID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(addressString);
        } catch (SQLException e ){
            System.out.println(e.toString());
        }
    }
*/

    //TODO SELECT BY TYPE

    public void selectFormsWithData(){
// this will probably return Type Form
    }
    //TODO SELECT BY OWNER

    //TODO BIG OL' SELECT FUNCTION FOR FORMS
}
