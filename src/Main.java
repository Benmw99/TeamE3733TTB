
public class Main {

    public static void main(String[] args) {
        //Test Agent login:TestAgent Password:1234
        //Test Company login:TestCompany Password:1234
        /*try {
            DB.Database db = DB.Database.getInstance();
            db.tableBuilder.resetDB();
            db.dbInsert.insertAgent("Joe Cool", 445, "TestAgent", "1234");
            DB.SampleData s = new SampleData(db);
        }catch(Exception e){
            System.out.println(e.toString());
        }*/
        UI.MainUI.main( args);
    }
}
