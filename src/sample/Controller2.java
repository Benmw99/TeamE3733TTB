package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller2 extends PageController{
    Form currentForm;
    User currentUser;
    @FXML
    Button buttonDouble;
    @FXML
    Button buttonLeave;
    @FXML
    Label label1;

    @Override
    AttributeContainer onLeave() {
        AttributeContainer c = new AttributeContainer();
        c.setForm(this.currentForm);
        c.setUser(this.currentUser);
        return c;
    }
    @Override
    void  onLoad(AttributeContainer c) {
        this.currentForm = c.getForm();
        this.currentUser = c.getUser();
        this.label1.setText(Integer.toString(currentForm.getField2()));
    }

    @FXML
    public void doubleValue() {
        this.currentForm.setField2(this.currentForm.getField2()*2);
        this.label1.setText(Integer.toString(currentForm.getField2()));

    }
    @FXML
    public void goBack() {
        this.goToPage("Page1.fxml");
    }


}
