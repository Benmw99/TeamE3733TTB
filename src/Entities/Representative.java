package Entities;

import DB.Database;

public class Representative implements IUser {

    private String repID;
    private String login;
    private String password;

    public Representative(String repID, String login, String password) {
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

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(Database db){

        return db.dbSelect.AuthenticateCompany(login,password);
    }

    public IUser loadUser(){
        return null; // needs implementation
    }


    public SearchResult search() {
        return null;
    }

    void SubmitForm() {

    }

    void SubmitLabel() {

    }

    void CheckProgress() {

    }


}
