package UI;

import Entities.Agent;

public class LoginHelper {

    public ILogin controller;

    public LoginHelper(ILogin controller){
        this.controller = controller;
        controller.setLoginHelper(this);
    }

    public boolean authenticate(){
//        String user = controller.getLoginUserUsernameTextField().getText(); //TODO: fix this, getLoginUserUsernameTextField() returns null
        AttributeContainer attributeContainer = AttributeContainer.getInstance();
        attributeContainer.currentUser = new Agent();
        return true; //TODO MAKE THIS REAL
    }
}
