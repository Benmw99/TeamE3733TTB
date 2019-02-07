package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller_Example_Template extends PageController {
    /////////////////////////////
    // Local Attributes
    /////////////////////////////
    private int value = 1;
    private Form form1;

    /////////////////////////////
    // FXML Attributes
    /////////////////////////////
    @FXML
    Button button;



    /////////////////////////////
    // FXML Button Functions
    /////////////////////////////

    @FXML
    public void doubleValue() {
        value *= 2;
    }

    /////////////////////////////
    // Navigation method(s)
    /////////////////////////////

    @FXML
    public void goPage1() {
        this.goToPage("Page1.fxml"); //
    }


    /////////////////////////////
    // Load and leave methods
    /////////////////////////////

    @Override
    void  onLoad(AttributeContainer c) {
        /*Get what you need from the prior page here*/
        this.form1 = c.getForm();
    }

    @Override
    AttributeContainer onLeave() {
        /*set all the stuff here for what your next page needs*/
        AttributeContainer c = new AttributeContainer();
        c.setForm(this.form1);
        return c;
    }

}
