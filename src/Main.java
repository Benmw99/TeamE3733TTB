public class Main {

    public static void main(String[] args) {
        try {
            DB.Database db = DB.Database.getInstance();
            db.tableBuilder.resetDB();
            db.dbInsert.insertCompany(123, "Buddweiser", "User1", "Pass1");
            db.dbInsert.insertAgent("joe cool", 445, "User2", "Pass2");

        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
