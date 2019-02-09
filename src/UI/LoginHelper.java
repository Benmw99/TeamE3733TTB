package UI;

public class LoginHelper {

    public ILogin controller;

    public LoginHelper(ILogin controller){
        this.controller = controller;
        controller.setLoginHelper(this);
    }

    public boolean authenticate(){
        String user = controller.getLoginUserUsernameTextField().getText();
        return true; //TODO MAKE THIS REAL
    }
}
