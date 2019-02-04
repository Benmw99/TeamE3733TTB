package Entities;

import Entities.Sorting.BrandNameSort;
import Entities.Sorting.DateSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class SearchResult {
    private ArrayList<Form> results;
    private String query;
    private AdvancedSearch search;

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

    public ArrayList<Form> getResults() {
        return results;
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
        db.dbSelect.downloadResults(query, search);
    }


    public void sortBrandName(){
        Collections.sort(results, new BrandNameSort());
    }

    public void sortDate(){
        Collections.sort(results, new DateSort());
    }


    public AdvancedSearch getSearch() {
        return search;
    }

    public void setSearch(AdvancedSearch search) {
        this.search = search;
    }

    public void getThreeForms() {
        DB.Database db = DB.Database.getInstance();
        db.dbSelect.getThreeForms();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResult that = (SearchResult) o;
        return (results.equals(that.results)) &&
                Objects.equals(query, that.query) &&
                Objects.equals(search, that.search);
    }

}
