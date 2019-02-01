package Entities;

import DB.DBSelect;

public class Agent implements IUser{

    String repID;
    String login;
    String password;

    public Agent(String repID, String login, String password) {
        this.repID = repID;
        this.login = login;
        this.password = password;
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




    public boolean authenticate(){
        return false; //needs implementation
    }

    public IUser loadUser(){
        return null; // needs implementation
    }

    public SearchResult search() {
        return null;
    }

    void approveForm() {

    }

    void rejectForm() {

    }

    void fillQueue() {

    }

    Form importPhysicalForm() {
        Form form = new Form();
        return form;
    }

    void SendToAgent() {

    }


}
