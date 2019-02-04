package Entities;

import DB.Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Entities.ApprovalStatus.*;

public class Agent implements IUser{

    private String repID;
    private String login;
    private String password;
    private String name;

    public Agent(String repID, String login, String password) {
        this.repID = repID;
        this.login = login;
        this.password = password;
    }

    public Agent( String login, String password) {
        this.repID = null;
        this.login = login;
        this.password = password;
    }

    public Agent (){
        this.password = null;
        this.repID = null;
        this.login = null;
    }
    public String getName() {
        return name;
    }

    public String getRepID() {
        return repID;
    }

    public void setRepID(String repID) {
        this.repID = repID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Form> getThreeForms() {
        DB.Database db = DB.Database.getInstance();
        return db.dbSelect.getThreeForms();
    }

    public boolean authenticate(){
        DB.Database db = DB.Database.getInstance();
        return db.dbSelect.AuthenticateAgent(login,password);
    }

    public void loadUser(){

    }

    public SearchResult search(AdvancedSearch advancedSearch) {
        DB.Database db = DB.Database.getInstance();
        return db.dbSelect.searchBy(advancedSearch);
    }

    void approveForm(Form form, String qualifications) {
        form.getApproval().approve(name, qualifications);
        form.setApprovalStatus(Complete);
        DB.Database db = DB.Database.getInstance();
        db.dbSelect.approveForm(form,form.getApproval());

    }

    void rejectForm(Form form) {
        form.setApprovalStatus(Incomplete);
        DB.Database db = DB.Database.getInstance();
        db.dbSelect.approveForm(form, form.getApproval());

    }


    Form importPhysicalForm() {
        Form form = new Form();
        return form;
    }

    void SendToAgent() {

    }

    public void csvDownload(String query, AdvancedSearch advancedSearch){
        DB.Database db = DB.Database.getInstance();
        db.dbSelect.downloadResults(query,advancedSearch);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return Objects.equals(repID, agent.repID) &&
                Objects.equals(login, agent.login) &&
                Objects.equals(password, agent.password) &&
                Objects.equals(name, agent.name);
    }


}
