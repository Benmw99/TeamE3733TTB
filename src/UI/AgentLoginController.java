package UI;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AgentLoginController extends PageControllerUI implements ILogin{

    TextField LoginUserUsernameTextField;

    TextField LoginUserPasswordTextField;

    Button LoginUserLoginButton;

    LoginHelper loginHelper;

    @Override
    public void setLoginHelper(LoginHelper loginHelper) {
        this.loginHelper = loginHelper;
    }

    @Override
    public TextField getLoginUserUsernameTextField() {
        return LoginUserUsernameTextField;
    }

    @Override
    public TextField getLoginUserPasswordTextField() {
        return LoginUserPasswordTextField;
    }

    @Override
    public Button getLoginUserLoginButton() {
        return LoginUserLoginButton;
    }

    protected void onLeave(){}

    void onLoad(){}

}
