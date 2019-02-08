package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.net.URI;
import java.sql.Connection;

public class Controller2 extends PageController implements iSubmit{
    Form currentForm;
    User currentUser;
    ControllerFunction cont;

    @FXML
    Label label1;

    public Label label1(){
        return label1;
    }

    @Override
    public AttributeContainer onLeave() {
        AttributeContainer c = new AttributeContainer();
        c.setForm(this.currentForm);
        c.setUser(this.currentUser);
        return c;
    }

    @Override
    void  onLoad(AttributeContainer c) {
        try {
  //          FXMLLoader fxmlLoader = new FXMLLoader((new File("src/sample/page2.fxml")).toURI().toURL());
    //        fxmlLoader.load();
        } catch (Exception e){
            e.printStackTrace();
        }

        this.currentForm = c.getForm();
        this.currentUser = c.getUser();
      //      this.label1.setText(Integer.toString(currentForm.getField2()));
            this.cont = new ControllerFunction(this);
            cont.update();
    }

    @FXML
    public void doubleValue() {
        this.currentForm.setField2(this.currentForm.getField2()*2);
        this.label1.setText(Integer.toString(currentForm.getField2()));

    }

    @FXML
    public void goBack() {
        this.label1.setText(Integer.toString(currentForm.getField2()));
        this.goToPage("Page1.fxml");
        System.out.println("Label value is: " + this.label1);
    }


}
