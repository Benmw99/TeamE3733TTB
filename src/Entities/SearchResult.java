package Entities;

import Entities.Sorting.BrandNameSort;
import Entities.Sorting.DateSort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class SearchResult {
    private ArrayList<Form> results;

    /**
     * blank constructor for searchResult class
     */
    public SearchResult(){
        results = new ArrayList<Form>();
    }

    /**
     * constructor for searchResult class
     * @param forms takes arraylist for constructor
     */
    public SearchResult(ArrayList<Form> forms){
        this.results = forms;
    }

    /**
     * used to add a single result to the form
     * @param form result to be added
     */
    public void addResult(Form form){
        results.add(form);
    }

    /**
     * Used to add multiple results to the object
     * @param forms results to be added
     */
    public void addResults(ArrayList<Form> forms){
        results.addAll(forms);
    }

    public boolean printResults(){

        try {
            String home = System.getProperty("user.home");
            Date date = new Date() ;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
            File file = new File(home + "/Downloads/" + "TTBSearch" +dateFormat.format(date) + ".csv");
            FileWriter outputfile = new FileWriter(file);
            //CSVWriter writer = new CSVWriter(outputfile);
            //String[] header = { "Name", "Class", "Marks" };
            //writer.writeNext(header);

            for (int i = 1; i < results.size(); i++) {

            }


            return true;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }


    public void sortBrandName(){
        Collections.sort(results, new BrandNameSort());
    }

    public void sortDate(){
        Collections.sort(results, new DateSort());
    }


}
