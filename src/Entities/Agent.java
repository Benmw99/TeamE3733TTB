package Entities;

public class Agent implements IUser{

    String repID;

    public Agent(String repID) {
        this.repID = repID;
    }

    @Override
    public void login() {

    }

    @Override
    public String search() {
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
