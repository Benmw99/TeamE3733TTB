package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AgentLoginController extends PageControllerUI implements ILogin{
    @FXML
    TextField LoginUserUsernameTextField;

    @FXML
    PasswordField LoginUserPasswordTextField;

    Button LoginUserLoginButton;

    LoginHelper loginHelper = new LoginHelper(this);

    @Override
    public void setLoginHelper(LoginHelper loginHelper) {
        this.loginHelper = loginHelper;
    }

    @Override
    public TextField getLoginUserUsernameTextField() {
        return LoginUserUsernameTextField;
    }

    @Override
    public PasswordField getLoginUserPasswordTextField() {
        return LoginUserPasswordTextField;
    }

    @Override
    public Button getLoginUserLoginButton() {
        return LoginUserLoginButton;
    }

    @Override
    protected void onLeave(){}
    @Override
    void onLoad(){
        attributeContainer.currentUser = null;
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        if(loginHelper.authenticate()){
            goToPage("AgentHome.fxml");
        }
        else {
            System.out.println("lol get wrecked scrub");
            //TODO: make popup warning
        }
    }
}
