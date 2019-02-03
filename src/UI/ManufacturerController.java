package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

import Entities.*;


public class ManufacturerController {

    Manufacturer manufacturer;


    //ManHome
    @FXML
    SplitMenuButton menuSplitButton;

    @FXML
    SplitMenuButton alcoholTypeSplitMenu;

    @FXML
    TextField searchMHField;

    @FXML
    Button addAppButton;

    @FXML
    ToggleButton editToggle;

    @FXML
    Button downloadButton;

    @FXML
    Button commentsButton;

    @FXML
    Button printButton;

    //ManLogin
    @FXML
    Button backButton;

    @FXML
    TextField nameField;

    @FXML
    TextField passField;

    @FXML
    TextField idLoginField;

    @FXML
    Button loginButton;

    @FXML
    Button faqButton;

    @FXML
    Button search1Button;

    //ManProfile
    @FXML
    Button menuMPButton;

    //ManSearch
    @FXML
    Button menuMSButton;

    @FXML
    TextField searchMSField;


    @FXML
    TextField manField;

    @FXML
    TextField stateField;

    @FXML
    TextField cityField;

    @FXML
    TextField dateField;

    @FXML
    TextField idField;

    //ManFAQ
    @FXML
    Button menuFAQButton;

    @FXML
    MenuButton catMenuButton;

    @FXML
    TextField searchFAQField;

    //ManApp1
    @FXML
    MenuButton menuMA1MenuButton;

    @FXML
    Button section1MA1Button;

    @FXML
    Button section2MA1Button;

    @FXML
    Button section3MA1Button;

    @FXML
    Button section4MA1Button;

    @FXML
    TextField repIDField;

    @FXML
    TextField producerNumField;

    @FXML
    TextField sourceField;

    @FXML
    TextField serialYearField;

    @FXML
    TextField serialDigitsField;

    @FXML
    TextField typeField;

    @FXML
    TextField alcoholContentTextField;

    @FXML
    TextField brandNameTextField;

    @FXML
    TextField brandField;

    @FXML
    Button prevSectionMA1Button;

    @FXML
    Button nextSectionMA1Button;

    //ManApp2
    @FXML
    MenuButton menuMA2MenuButton;

    @FXML
    Button section1MA2Button;

    @FXML
    Button section2MA2Button;

    @FXML
    Button section3MA2Button;

    @FXML
    Button section4MA2Button;

    @FXML
    TextField fancifulField;

    @FXML
    TextField name8Field;

    @FXML
    ChoiceBox state8ChoiceBox;

    @FXML
    TextField address8Field;

    @FXML
    TextField city8Field;

    @FXML
    TextField zip8Field;

    @FXML
    RadioButton sameAddressRadioButton;

    @FXML
    RadioButton difAddressRadioButton;

    @FXML
    TextField formulaField;

    @FXML
    TextField grapeVarField;

    @FXML
    TextField wineAppField;

    @FXML
    Button prevSectionMA2Button;

    @FXML
    Button nextSectionMA2Button;

    //ManApp3
    @FXML
    MenuButton menuMA3MenuButton;

    @FXML
    Button section1MA3Button;

    @FXML
    Button section2MA3Button;

    @FXML
    Button section3MA3Button;

    @FXML
    Button section4MA3Button;

    @FXML
    TextField phoneNumField;

    @FXML
    TextField emailField;

    @FXML
    Checkbox certCheckbox;

    @FXML
    TextField state15Field;

    @FXML
    Checkbox liquorCheckbox;

    @FXML
    TextField amountField;

    @FXML
    Checkbox resubmitCheckbox;

    @FXML
    TextField TTBIDField;

    @FXML
    TextField additionalInfoField;

    @FXML
    TextField translationField;

    @FXML
    DatePicker appDate;

    @FXML
    Button prevSectionMA3Button;

    @FXML
    Button nextSectionMA3Button;

    //ManApp4
    @FXML
    MenuButton menuMA4MenuButton;

    @FXML
    Button section1MA4Button;

    @FXML
    Button section2MA4Button;

    @FXML
    Button section3MA4Button;

    @FXML
    Button section4MA4Button;

    @FXML
    TextField signatureField;

    @FXML
    Button uploadLabelButton;

    @FXML
    Button prevSectionMA4Button;

    @FXML
    Button submitButton;

    @FXML
    Button manRegisterButton;


    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", backButton);
    }


    public void pageSwitch(ActionEvent event, String filename, Button b) throws IOException{
        Parent root;
        Stage stage;
        stage=(Stage) b.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource(filename));
        Scene scene = new Scene(root, 1360, 760);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void correctLogin(ActionEvent event) throws IOException{
        this.manufacturer = new Manufacturer(nameField.getText(), passField.getText());
        if(this.manufacturer.authenticate()){
            pageSwitch(event, "ManHome.fxml", loginButton);
        }
        else{
            Alert incorrectLogin = new Alert(Alert.AlertType.WARNING);
            incorrectLogin.setTitle("Incorrect Login");
            incorrectLogin.setContentText("You have entered the incorrect login information. Please try again.");
            incorrectLogin.show();
        }


    }


}
