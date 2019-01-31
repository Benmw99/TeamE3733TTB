package DB;

import java.sql.*;



public class DBSelect {
    Connection connection;

    DBSelect(String path){
        try {
            connection = DriverManager.getConnection("jdbc:derby:" + path + ";create=true");
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

        }
        return rs;
    }

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
    ResultSet selectAllUsers() {
        String selectString = "SELECT * FROM USERS";
        return sendQuery(selectString); //TODO UPDATE WHEN INHERITANCE IS PROPERLY IMPLEMENTED
    }
    ResultSet selectAllForms() {
        String selectString = "SELECT * FROM FORM ";
        return sendQuery(selectString);
    }
}
