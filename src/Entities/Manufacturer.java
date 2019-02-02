package Entities;

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
        return false; //needs implementation
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
