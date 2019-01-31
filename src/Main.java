import DB.TableBuilder;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TableBuilder init = new TableBuilder("./ttb.db");
        init.resetDB();
    }
}