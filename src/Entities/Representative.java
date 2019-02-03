package Entities;

import DB.Database;

import java.util.Objects;

public class Representative implements IUser {

    private String repID;
    private String login;
    private String password;

    public Representative(String repID, String login, String password) {
        this.repID = repID;
        this.login = login;
        this.password = password;
    }

    public Representative(){
        this.repID = null;
        this.login = null;
        this.password = null;
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

    public boolean authenticate(){
        DB.Database db = DB.Database.getInstance();
        return db.dbSelect.AuthenticateRep(login,password);
    }

    public void loadUser(){
        DB.Database db = DB.Database.getInstance();
        Representative rep = db.dbSelect.getRepresentative(login);
        this.repID = rep.getRepID();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Representative that = (Representative) o;
        return Objects.equals(repID, that.repID) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

}
