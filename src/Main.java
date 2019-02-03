public class Main {

    public static void main(String[] args) {
        DB.Database db = DB.Database.getInstance();
        db.tableBuilder.resetDB();
        UI.MainUI.main( args);
    }
}
