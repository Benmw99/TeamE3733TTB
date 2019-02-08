package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller1 extends PageController implements iSubmit {
    Form currentForm;
    User currentUser;
    /*
    @FXML
    Button buttonAdd;
    @FXML
    Button buttonLeave;
    */
    @FXML
    Label label1;

    public Label label1(){
        return label1;
    }
    //label1.

    @Override
    public AttributeContainer onLeave() {
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
    @Override
    public void setStage_DontTouch(Stage stage) {
        this.stage_DontTouch = stage;
    }

    @FXML
    public void addValue() {
        this.currentForm.setField2(this.currentForm.getField2()+1);
        this.label1.setText(Integer.toString(currentForm.getField2()));

    }
    @FXML
    public void goBack() {
        this.goToPage("Page2.fxml");
        System.out.println("Label memory address: " + this.label1);
    }



}
