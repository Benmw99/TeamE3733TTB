package UI;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ManLoginController extends PageControllerUI implements ILogin{

    TextField LoginUserUsernameTextField;

    TextField LoginUserPasswordTextField;

    Button LoginUserLoginButton;

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
