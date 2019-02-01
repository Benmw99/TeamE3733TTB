package Entities;

public interface IUser {

    String login = null;
    String password = null;

    void login();
    //This should be of type SearchEngine, but that doesn't exist yet
    String search();

}
