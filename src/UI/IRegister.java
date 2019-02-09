package UI;

import javafx.scene.control.Button;

public interface IRegister {

    javafx.scene.control.TextField getRegisterUserFirstNameTextField();

    javafx.scene.control.TextField getRegisterUserLastNameTextField();

    javafx.scene.control.TextField getRegisterUserUsernameTextField();

    javafx.scene.control.TextField getRegisterUserEmailTextField();

    javafx.scene.control.TextField getRegisterUserPasswordTextField();

    javafx.scene.control.TextField getRegisterUserPasswordCheckTextField();

    Button getSubmitRegistrationButton();

}
