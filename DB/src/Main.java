import java.sql.ResultSet;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TableBuilder init = new TableBuilder("./ttb.db");
        init.resetDB();
        System.out.println("Finished building the DB");
        System.out.println("Now inserting data");
        DBInsert insert = new DBInsert("./ttb.db");
        try{
            insert.insertCompany(12345, "Budweiser",
                    "test123", "qwerty");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        System.out.println("Now querying data");
        DBSelect sel = new DBSelect("./ttb.db");
        ResultSet rset = sel.selectAllCompany();
        int compID = 0;
        String compName = "";
        String loginName = "";
        String password = "";
        try {
            while (rset.next()) {
                compID = rset.getInt("Company_ID");
                compName = rset.getString("Company_Name");
                loginName = rset.getString("Login_Name");
                password = rset.getString("Password");
            }
        } catch (SQLException e) {
            System.out.println("SQL State: " + e.getErrorCode());
            System.out.println("Error Code: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("Company ID: " + compID + "\nCompany Name: " + compName + "\nLogin Name: "
                + loginName + "\nPassword: " + password);
    }
}