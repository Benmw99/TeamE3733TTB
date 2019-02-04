public class Main {

    public static void main(String[] args) {
        try {
            DB.Database db = DB.Database.getInstance();
            db.tableBuilder.resetDB();
            db.dbInsert.insertCompany(123, "Buddweiser", "User", "Pass");
            db.dbInsert.insertAgent("joe cool", 445, "JoeCool", "L33t");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        UI.MainUI.main( args);
    }
}
