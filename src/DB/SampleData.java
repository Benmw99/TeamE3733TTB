package DB;

import Entities.Form;
import Entities.Manufacturer;

public class SampleData {
    Database db;
    public SampleData(Database db){
        this.db = db;
    }

    void insertMan(){
        Manufacturer man = new Manufacturer("WALT DISNEY", "1234");
    }
    void insertWines(){
        Form one = new Form();
        
    }
}
