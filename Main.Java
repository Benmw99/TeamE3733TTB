class Main {
    public static void main(String[] args) {
        TableBuilder init = new TableBuilder("./ttb.db");
        init.resetDB();
        System.out.println("Finished building the DB");
    }
}