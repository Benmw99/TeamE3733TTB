package Entities;

import DB.Database;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Objects;

public class Manufacturer implements IUser {

    public int manID;
    private String manName;
    private String login;
    private String password;


    public Manufacturer(int manID, String manName, String login, String password) {
        this.manID = manID;
        this.manName = manName;
        this.login = login;
        this.password = password;
    }

    public Manufacturer(String login, String password) {
        this.manID = 0;
        this.manName = null;
        this.login = login;
        this.password = password;
    }

    public Manufacturer(){
        this.manID = 0;
        this.manName = null;
        this.login = null;
        this.password = null;
    }

    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = manID;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
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
        return db.dbSelect.AuthenticateCompany(login,password);
    }

    public IUser loadUser(){
        return null; // needs implementation
    }



    public SearchResult search() {
        return null;
    }

    void SubmitForm(Form form) {
        try {
            DB.Database db = DB.Database.getInstance();
            db.dbInsert.insertForm(form, this);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    void SubmitLabel() {

    }

    void CheckProgress() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return manID == that.manID &&
                Objects.equals(manName, that.manName) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

}
