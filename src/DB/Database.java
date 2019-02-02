package DB;

public class Database {
    private static Database database_instance = null;
    public TableBuilder tableBuilder;
    public DBSelect dbSelect;
    public DBInsert dbInsert;

    private Database() {
        tableBuilder = TableBuilder.getInstance();
        dbSelect = DBSelect.getInstance();
        dbInsert = DBInsert.getInstance();
    }

    public static Database getInstance() {
        if (database_instance == null) {
            database_instance = new Database();
        }
        return database_instance;
    }
}
