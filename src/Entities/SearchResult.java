package Entities;

import Entities.Sorting.BrandNameSort;
import Entities.Sorting.DateSort;

import java.util.ArrayList;
import java.util.Collections;



public class SearchResult {
    private ArrayList<Form> results;
    private String query;

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

    public SearchResult(ArrayList<Form> results, String query) {
        this.results = results;
        this.query = query;
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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void printResults(){
        DB.Database db = DB.Database.getInstance();
        db.dbSelect.downloadResults(query);
    }


    public void sortBrandName(){
        Collections.sort(results, new BrandNameSort());
    }

    public void sortDate(){
        Collections.sort(results, new DateSort());
    }


}
