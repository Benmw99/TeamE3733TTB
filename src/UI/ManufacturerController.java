package UI;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import org.apache.commons.lang3.*;


import java.io.IOException;

import Entities.*;
import org.apache.derby.iapi.util.StringUtil;

import static javafx.collections.FXCollections.observableArrayList;


public class ManufacturerController {
    Entities.Form currentForm;
    private int currentFormPage;




    Manufacturer manufacturer;
    Entities.Form form;


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
    Button manRegisterButton;

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
    ComboBox<String> sourceComboBox;

    @FXML
    TextField serialYearField;

    @FXML
    TextField serialDigitsField;

    @FXML
    ComboBox<String> typeComboBox;

    @FXML
    TextField vintageYearField;

    @FXML
    TextField phField;

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
    ComboBox<String> state8ComboBox;

    @FXML
    TextField address8Field;

    @FXML
    TextField city8Field;

    @FXML
    TextField zip8Field;

    @FXML
    RadioButton sameAddressRadioButton;

    @FXML
    TextField name9Field;

    @FXML
    ComboBox<String> state9ComboBox;

    @FXML
    TextField address9Field;

    @FXML
    TextField city9Field;

    @FXML
    TextField zip9Field;

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
    CheckBox certCheckbox;

    @FXML
    TextField state15Field;

    @FXML
    CheckBox liquorCheckbox;

    @FXML
    TextField amountField;

    @FXML
    CheckBox resubmitCheckbox;

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


    //new application
    @FXML
    public void manApp1(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp1.fxml", addAppButton);
    }

    //back buttons
    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", backButton);
    }
    @FXML
    public void manLogin(ActionEvent event) throws IOException {
        pageSwitch(event, "ManLogin.fxml", backButton);
    }
    @FXML
    public void manHome(ActionEvent event) throws IOException {
        pageSwitch(event, "ManHome.fxml", backButton);
    }

    // move up sections from ManApp1
    @FXML
    public void manApp2a(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp2.fxml", section2MA1Button);
    }
    @FXML
    public void manApp2b(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp3.fxml", section3MA1Button);
    }
    @FXML
    public void manApp2c(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp4.fxml", section4MA1Button);
    }

    //move up pages by arrows from ManApp1
    @FXML
    public void manApp2d(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp2.fxml", nextSectionMA1Button);
    }

    // move up sections from ManApp2
    @FXML
    public void manApp3a(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp3.fxml", section3MA2Button);
    }
    @FXML
    public void manApp3b(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp4.fxml", section4MA2Button);
    }

    // move down sections from ManApp2
    @FXML
    public void manApp3c(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp1.fxml", section1MA2Button);
    }

    //move up pages by arrows from ManApp2
    @FXML
    public void manApp3d(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp3.fxml", nextSectionMA2Button);
    }
    //move down pages by arrows from ManApp2
    @FXML
    public void manApp3e(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp1.fxml", prevSectionMA2Button);
    }

    // move up sections from ManApp3
    public void manApp4a(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp4.fxml", section4MA3Button);
    }

    // move down sections from ManApp3
    public void manApp4b(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp2.fxml", section2MA3Button);
    }
    public void manApp4c(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp1.fxml", section1MA3Button);
    }

    //move up pages by arrows from ManApp3
    @FXML
    public void manApp4d(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp4.fxml", nextSectionMA3Button);
    }
    //move down pages by arrows from ManApp3
    @FXML
    public void manApp4e(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp2.fxml", prevSectionMA3Button);
    }

    // move down sections from ManApp4
    public void manApp5a(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp3.fxml", section3MA4Button);
    }
    public void manApp5b(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp2.fxml", section2MA4Button);
    }
    public void manApp5c(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp1.fxml", section1MA4Button);
    }

    //move down pages by arrows from ManApp3
    @FXML
    public void manApp5d(ActionEvent event) throws IOException {
        pageSwitch(event, "ManApp3.fxml", prevSectionMA4Button);
    }

    //manHome
    public void goHome(ActionEvent event) throws IOException {
        menuSwitch(event, "ManHome.fxml", menuMA1MenuButton);
    }

    ///manApp
    @FXML
    public void newApp(ActionEvent event) throws IOException {
        this.currentForm = new Entities.Form();
        pageSwitch(event, "ManApp1.fxml", backButton);
    }

    @FXML
    public void appNext(ActionEvent event) throws IOException {

        if(this.currentFormPage<4) this.currentFormPage++;
        String page = "ManApp"+Integer.toString(this.currentFormPage)+".fxml";
        pageSwitch(event, page, backButton);
    }
    @FXML
    public void appBack(ActionEvent event) throws IOException {
        if(this.currentFormPage>1) this.currentFormPage--;
        String page = "ManApp"+Integer.toString(this.currentFormPage)+".fxml";
        pageSwitch(event, page, backButton);
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

    public void menuSwitch(ActionEvent event, String filename, MenuButton b) throws IOException{
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
            //pageSwitch(event, "ManHome.fxml", loginButton);
            Alert incorrectLogin = new Alert(Alert.AlertType.WARNING);
            incorrectLogin.setTitle("Incorrect Login");
            incorrectLogin.setContentText("You have entered the incorrect login information. Please try again.");
            incorrectLogin.show();
        }
    }


    // Checks through the first page of the full TTB application to see if any of the text fields are blank.
    // If they are all filled, then the user can move on to the second page
    @FXML
    public void checkBlanksPage1(ActionEvent event) throws IOException{
        this.form = new Form();
        this.form.setRepID(repIDField.getText());
        this.form.setSerialNumber(serialDigitsField.getText());
        this.form.setBrandName(brandField.getText());

        if(StringUtils.isBlank(this.form.getRepID())|| StringUtils.isBlank(this.form.getSerialNumber())|| StringUtils.isBlank(this.form.getBrandName())){
            System.out.println("I'm stuck thinking things aren't filled in");
            Alert missingTextFieldPage1 = new Alert(Alert.AlertType.WARNING);
            missingTextFieldPage1.setTitle("Missing Text Field");
            missingTextFieldPage1.setContentText("You have forgotten to fill out a text field. Please do so before moving on.");
            missingTextFieldPage1.show();
        }
        else{
            System.out.println("I need to go to the second page");
            pageSwitch(event, "ManApp2.fxml", nextSectionMA1Button);
        }
    }

    // Checks through the second page of the full TTB application to see if any of the text fields are blank.
    // If they are all filled, then the user can move on to the third page
    @FXML
    public void checkBlanksPage2(ActionEvent event) throws IOException{
        this.form = new Form();
        this.form.setFancifulName(fancifulField.getText());
        this.form.setFormula(formulaField.getText());

        if(StringUtils.isBlank(this.form.getFancifulName()) || StringUtils.isBlank(this.form.getFormula())){
            Alert missingTextFieldPage2 = new Alert(Alert.AlertType.WARNING);
            missingTextFieldPage2.setTitle("Missing Text Field");
            missingTextFieldPage2.setContentText("You have forgotten to fill out a text field. Please do so before moving on.");
            missingTextFieldPage2.show();
        }
        else{
            pageSwitch(event, "ManApp3.fxml", nextSectionMA2Button);
        }
    }

    // Checks through the third page of the full TTB application to see if any of the text fields are blank.
    // If they are all filled, then the user can move on to the fourth page
    @FXML
    public void checkBlanksPage3(ActionEvent event) throws IOException{
        this.form = new Form();
        this.form.setPhoneNumber(phoneNumField.getText());
        this.form.setEmail(emailField.getText());
        if(StringUtils.isBlank(this.form.getPhoneNumber()) || StringUtils.isBlank(this.form.getEmail())){
            Alert missingTextFieldPage1 = new Alert(Alert.AlertType.WARNING);
            missingTextFieldPage1.setTitle("Missing Text Field");
            missingTextFieldPage1.setContentText("You have forgotten to fill out a text field. Please do so before moving on.");
            missingTextFieldPage1.show();
        }
        else{
            pageSwitch(event, "ManApp4.fxml", nextSectionMA3Button);
        }
    }

    @FXML
    public void checkWine(ActionEvent event) throws IOException{
        if (typeComboBox.getValue().equals("Wine")){
            vintageYearField.disableProperty().setValue(false);
            phField.disableProperty().setValue(false);

            //System.out.println("GotHERE");
        }
        else{
            vintageYearField.disableProperty().setValue(true);
            phField.disableProperty().setValue(true);
        }
    }

    @FXML
    public void checkMail(ActionEvent event) throws IOException{
        if (sameAddressRadioButton.selectedProperty().equals(true)){
            name9Field.disableProperty().setValue(true);
            state9ComboBox.disableProperty().setValue(true);
            address9Field.disableProperty().setValue(true);
            city9Field.disableProperty().setValue(true);
            zip9Field.disableProperty().setValue(true);
        }
        else{
            name9Field.disableProperty().setValue(false);
            state9ComboBox.disableProperty().setValue(false);
            address9Field.disableProperty().setValue(false);
            city9Field.disableProperty().setValue(false);
            zip9Field.disableProperty().setValue(false);
        }
    }



}
