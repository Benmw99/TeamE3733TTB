package Entities;

import java.util.ArrayList;

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

    public void printResults(){

        for( int i = 1; i < results.size(); i++){

        }

    }

}
