package Entities;

import DB.Database;

public interface IUser {

    String getLogin();
    void setLogin(String login);
    String getPassword();
    void setPassword(String password);

    boolean authenticate(Database db);
    IUser loadUser();


    //needs additional parameters relating to size of returned search
    SearchResult search();

}
