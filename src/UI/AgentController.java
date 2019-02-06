package UI;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sun.management.resources.agent;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.io.IOException;
import java.util.List;

import Entities.*;

import DB.*;

public class AgentController {
    //AgentSearch
    @FXML
    Button menuASButton;

    @FXML
    Button searchButton;

    @FXML
    TextField searchASField;

    @FXML
    TextField alcoholContentTextField;

    @FXML
    TextField brandNameTextField;

    @FXML
    TextField manField;

    @FXML
    TextField stateField;

    @FXML
    TextField dateField;

    @FXML
    TextField idField;

    //AgentSendToAgent
    @FXML
    Button menuASTAButton;

    @FXML
    Checkbox commentASTACheckbox;

    @FXML
    Button section1ASTAButton;

    @FXML
    Button section2ASTAButton;

    @FXML
    Button section3ASTAButton;

    @FXML
    Button section4ASTAButton;

    @FXML
    Button approveASTAButton;

    @FXML
    Button rejectASTAButton;

    @FXML
    Button sendToAgentASTAButton;

    @FXML
    Button feedbackASTAButton;

    @FXML
    Button printASTAButton;

    @FXML
    TextField agentField;

    @FXML
    TextField messageASTAField;

    @FXML
    Button sendASTAButton;

    //AgentFeedback
    @FXML
    Button menuAFButton;

    @FXML
    Checkbox commentAFCheckbox;

    @FXML
    Button section1AFButton;

    @FXML
    Button section2AFButton;

    @FXML
    Button section3AFButton;

    @FXML
    Button approveAFButton;

    @FXML
    Button rejectAFButton;

    @FXML
    Button sendToAgentAFButton;

    @FXML
    Button feedbackAFButton;

    @FXML
    Button printAFButton;

    @FXML
    TextField messageAFField;

    @FXML
    Button sendAFButton;

    //AgentApp1
    @FXML
    MenuButton menuAA1MenuButton;

    @FXML
    Button section1AA1Button;

    @FXML
    Button section2AA1Button;

    @FXML
    Button section3AA1Button;

    @FXML
    Button section4AA1Button;

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
    TextField brandField;

    @FXML
    Button prevSectionAA1Button;

    @FXML
    Button nextSectionAA1Button;

    //AgentApp2
    @FXML
    MenuButton menuAA2MenuButton;

    @FXML
    Button section1AA2Button;

    @FXML
    Button section2AA2Button;

    @FXML
    Button section3AA2Button;

    @FXML
    Button section4AA2Button;

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
    RadioButton difAddressRadiobutton;

    @FXML
    TextField formulaField;

    @FXML
    TextField grapeVarField;

    @FXML
    TextField wineAppField;

    @FXML
    Button prevSectionAA2Button;

    @FXML
    Button nextSectionAA2Button;

    //AgentApp3
    @FXML
    MenuButton menuAA3MenuButton;

    @FXML
    Button section1AA3Button;

    @FXML
    Button section2AA3Button;

    @FXML
    Button section3AA3Button;

    @FXML
    Button section4AA3Button;

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
    Button prevSectionAA3Button;

    @FXML
    Button nextSectionAA3Button;

    //AgentApp4
    @FXML
    MenuButton menuAA4MenuButton;

    @FXML
    Button section1AA4Button;

    @FXML
    Button section2AA4Button;

    @FXML
    Button section3AA4Button;

    @FXML
    Button section4AA4Button;

    @FXML
    TextField signatureField;

    @FXML
    Button uploadLabelButton;

    @FXML
    Button prevSectionButton;

    @FXML
    Button submitButton;

    //AgentLogin
    @FXML
    Button agentRegisterButton;

    @FXML
    Button backButton;

    @FXML
    TextField nameField;

    @FXML
    TextField passField;

    @FXML
    TextField regNumField;

    @FXML
    Button loginButton;

    //AgentHome
    @FXML
    SplitMenuButton menuSplitButton;

    @FXML
    SplitMenuButton alcoholTypeSplitMenu;

    @FXML
    Button getnewQueueButton;

    @FXML
    TextField searchAHField;

    @FXML
    Button addAppButton;

    @FXML
    ToggleButton commentAHToggle;

    @FXML
    ToggleButton section1AHButton;

    @FXML
    ToggleButton section2AHButton;

    @FXML
    ToggleButton section3AHButton;

    @FXML
    Button approveAHButton;

    @FXML
    Button rejectAHButton;

    @FXML
    Button sendToAgentAHButton;

    @FXML
    Button feedbackAHButton;

    @FXML
    Button commentsAHButton;

    @FXML
    Button checkFormAHButton;

    @FXML
    Button printAHButton;

    //AgentViewForm

    @FXML
    Button reviewToolButton;

    @FXML
    ComboBox sectionMarkComboBox;

    @FXML
    MenuButton menuAVFMenuButton;

    @FXML
    CheckBox commentAVFCheckBox;

    @FXML
    Button section1AVFButton;

    @FXML
    Button agentBackToHomeButton;

    @FXML
    Button section2AVFButton;

    @FXML
    Button section3AVFButton;

    @FXML
    Button approveAVFButton;

    @FXML
    Button rejectAVFButton;

    @FXML
    Button sendToAgentAVFButton;

    @FXML
    Button feedbackAVFButton;

    @FXML
    Button printAVFButton;

    //AgentViewLabel
    @FXML
    MenuButton menuAVLMenuButton;

    @FXML
    Checkbox commentAVLCheckbox;

    @FXML
    Button section1AVLButton;

    @FXML
    Button section2AVLButton;

    @FXML
    Button section3AVLButton;

    @FXML
    Button approveAVLButton;

    @FXML
    Button rejectAVLButton;

    @FXML
    Button sendToAgentAVLButton;

    @FXML
    Button feedbackAVLButton;

    @FXML
    Button printAVLButton;

    @FXML
    Label appNum1;

    @FXML
    Label  appStat1;

    @FXML
    Label expirDate1;

    @FXML
    Label appDate1;

    @FXML
    Label appNum2;

    @FXML
    Label appStat2;

    @FXML
    Label expirDate2;

    @FXML
    Label appDate2;

    @FXML
    Label appNum3;

    @FXML
    Label appStat3;

    @FXML
    Label expirDate3;

    @FXML
    Label appDate3;

    //Form Labels
    @FXML
    Label Agent1Label;
    @FXML
    Label Agent2Label;
    @FXML
    Label Agent3Label;
    @FXML
    Label AgentReview4Label1;
    @FXML
    Label Agent4Label2;
    @FXML
    Label Agent5Label1;
    @FXML
    Label Agent5Label2;
    @FXML
    Label Agent5Label3;
    @FXML
    Label Agent6Label;
    @FXML
    Label Agent7Label;
    @FXML
    Label Agent8Label;
    @FXML
    Label Agent9Label;
    @FXML
    Label Agent10Label;
    @FXML
    Label Agent11Label;
    @FXML
    Label Agent12Label;
    @FXML
    Label Agent13Label;
    @FXML
    Label Agent14Label;
    @FXML
    Label Agent15Label1;
    @FXML
    Label Agent15Label2;
    @FXML
    Label Agent15Label3;
    @FXML
    Label Agent16Label1;
    @FXML
    Label Agent16Label2;
    @FXML
    Label Agent17Label;
    @FXML
    Label Agent18Label;
    @FXML
    Label Agent20Label;

    @FXML
    TableView<Form> formTable;
    @FXML
    TableColumn<Form, Integer> tTBIDColumn;
    @FXML
    TableColumn<Form, Timestamp> dateSubmittedColumn;
    @FXML
    TableColumn<Form, String> brandNameColumn;



    static private Form currentForm;
    private static Agent currentAgent;
    static private List<Form> queue;

    @FXML
    protected void initialize(){
        if(currentForm != null) {
            displayForm(currentForm);
        }
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        currentAgent = new Agent(nameField.getText(),passField.getText());
        if(currentAgent.authenticate()) {
            currentAgent.loadUser();
            pageSwitch(event, "AgentHome.fxml", loginButton);

            queue = currentAgent.getThreeForms();

            System.out.println(queue.size());
         //   currentForm = queue.get(0);

        }
        else {
            Alert loginFailure = new Alert(Alert.AlertType.WARNING);
            loginFailure.setContentText("Invalid Password or Username");
            loginFailure.showAndWait();
        }
    }

    @FXML
    public void selectForm(ActionEvent event) throws IOException {
        pageSwitch(event, "AgentHome.fxml", backButton);
    }

    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", backButton);

    }

    @FXML
    public void goBackToAgentHome(ActionEvent event) throws IOException {
        pageSwitch(event, "AgentHome.fxml", agentBackToHomeButton);
    }


    @FXML
    public void reviewTool(ActionEvent event) throws IOException {
        pageSwitch(event, "AgentViewForm.fxml", reviewToolButton);
    }

    @FXML
    public void agentViewForm(ActionEvent event) throws IOException {
        //TODO:have to load selected form somehow
        pageSwitch(event, "AgentViewForm.fxml", backButton);
    }
    @FXML
    public void rejectForm(ActionEvent event) throws IOException {
        currentAgent.rejectForm(currentForm);
        queue.remove(currentForm);
  //      pageSwitch(event, "AgentHome.fxml", backButton);
        tTBIDColumn.setCellValueFactory(new PropertyValueFactory<>("ttbID"));
        dateSubmittedColumn.setCellValueFactory(new PropertyValueFactory<>("dateSubmitted"));
        brandNameColumn.setCellValueFactory(new PropertyValueFactory<>("brandName"));

        tableView();

        ObservableList<Form> tableValues = FXCollections.observableArrayList();
        for (int i = 0; i < queue.size(); i++) {
            tableValues.add(queue.get(i));
        }
        formTable.setItems(tableValues);
        printAHButton.setDisable(false);
        Mailer mail = new Mailer();
        mail.sendMail(currentForm);
    }
    @FXML
    public void approveForm(ActionEvent event) throws IOException {

        currentAgent.approveForm(currentForm, " ");
        queue.remove(currentForm);
    //    pageSwitch(event, "AgentHome.fxml", backButton);
        tTBIDColumn.setCellValueFactory(new PropertyValueFactory<>("ttbID"));
        dateSubmittedColumn.setCellValueFactory(new PropertyValueFactory<>("dateSubmitted"));
        brandNameColumn.setCellValueFactory(new PropertyValueFactory<>("brandName"));

        tableView();

        ObservableList<Form> tableValues = FXCollections.observableArrayList();
        tableValues.remove(currentForm);
        for (int i = 0; i < queue.size(); i++) {
            tableValues.add(queue.get(i));
        }
        formTable.setItems(tableValues);
        printAHButton.setDisable(false);
        Mailer mail = new Mailer();
        mail.sendMail(currentForm);
    }

    public void tableView()  {
        formTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            /**
             * Makes it so that, if you click on a row of the Table, a form is loaded based on that TTB_ID
             */
            public void handle(MouseEvent click) {
                if (click.getClickCount() == 2) {
                    @SuppressWarnings("rawtypes")
                    TablePosition pos = formTable.getSelectionModel().getSelectedCells().get(0);
                    int row = pos.getRow();
                    int col = pos.getColumn();
                    int ID = tTBIDColumn.getCellData(row);
                    System.out.println(ID);
                    currentForm = Database.getInstance().dbSelect.getFormByTTB_ID(ID);
                    displayForm(currentForm);

                }
            }
        });
    //    ObservableList<Form> tableValues = FXCollections.observableArrayList();

    }

    protected void displayForm(Form form){
        Agent1Label.setText("N/A");
        Agent2Label.setText("N/A");
        Agent3Label.setText("N/A");
        AgentReview4Label1.setText("N/A");
        Agent4Label2.setText("N/A");
        Agent5Label1.setText("N/A");
        Agent5Label2.setText("N/A");
        Agent5Label3.setText("N/A");
        Agent6Label.setText("N/A");
        Agent7Label.setText("N/A");
        Agent8Label.setText("N/A");
        Agent9Label.setText("N/A");
        Agent10Label.setText("N/A");
        Agent11Label.setText("N/A");
        Agent12Label.setText("N/A");
        Agent13Label.setText("N/A");
        Agent14Label.setText("N/A");
        Agent15Label1.setText("N/A");
        Agent15Label2.setText("N/A");
        Agent16Label1.setText("N/A");
        Agent16Label2.setText("N/A");
        Agent17Label.setText("N/A");
        Agent20Label.setText("N/A");
        Agent1Label.setText(form.getRepID());
        System.out.println(form.getBrandName());
        System.out.println(form.getEmail());
        if(!form.getBrewersPermit().isEmpty()){
            Agent2Label.setText(form.getBrewersPermit().get(0));
        }
        String dom;
        if(form.getSource()){
            dom = "IMPORTED";
        } else {
            dom = "DOMESTIC";
        }
        Agent3Label.setText(dom);
        if(form.getSerialNumber() != null) {
            AgentReview4Label1.setText(form.getSerialNumber().substring(0, 2)); //First 2
            Agent4Label2.setText(form.getSerialNumber().substring(2)); //Rest
        }
        if(form.getAlcoholType() != null) {
            Agent5Label1.setText(form.getAlcoholType().toString()); //Type of Product
        }
        if(form.getWineFormItems() != null) {
            Agent5Label2.setText("" + form.getWineFormItems().getVintageYear()); //Vintage year
            Agent5Label3.setText(String.valueOf(form.getWineFormItems().getpH()));
            if(form.getWineFormItems().getGrapeVarietal() != null){
                Agent11Label.setText(form.getWineFormItems().getGrapeVarietal());
            }
            if(form.getWineFormItems().getAppellation() != null){
                Agent12Label.setText(form.getWineFormItems().getAppellation());
            }
        }
        if(form.getBrandName() != null) {
            Agent6Label.setText(form.getBrandName());
        } else {
            Agent6Label.setText("N/A");
        }
        if(form.getFancifulName() != null) {
            Agent7Label.setText(form.getFancifulName());
        }
        if(form.getMailingAddress() != null) {
            Agent8Label.setText(form.getMailingAddress().getName());
            Address add = form.getMailingAddress();
            String addy = add.getName() + "\n" + add.getStreet() + "\n" + add.getCity() +
                    "\n" + add.getState() + "\n" + add.getZip();
            Agent9Label.setText(addy);
        }
        if(form.getFormula() != null) {
            Agent10Label.setText(form.getFormula());
        }

        if(form.getPhoneNumber() != null) {
            Agent13Label.setText(form.getPhoneNumber());
        }
        if(form.getEmail() != null) {
            Agent14Label.setText(form.getEmail());
        }
//        Man15Label1.setText(); //TODO TYPE OF APPLICATION
//        Man15Label2.setText();
//        Man15Label3.setText(); //END TODO
        if(form.getBlownBrandedEmbossedInfo() != null) {
            Agent16Label1.setText(form.getBlownBrandedEmbossedInfo());
        }
//        Man16Label2.setText(); //TODO TRANSLATION
        if(form.getDateSubmitted() != null) {
            Agent17Label.setText(form.getDateSubmitted().toString());
        }
        Agent20Label.setText(String.valueOf(form.getAlcoholContent()));
    }


    /* not needed for it. 1
    @FXML
    public void approveFormConditions(ActionEvent event) throws IOException {
        this.currentForm.approve(this.currentAgent, StringConditions);
        pageSwitch(event, "AgentHome.fxml", backButton);
    }
    @FXML
    public void rejectFormFeedback(ActionEvent event) throws IOException {
        this.currentForm.approve(this.currentAgent, String feedback);
        pageSwitch(event, "AgentHome.fxml", backButton);
    }
    */

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
    public void getNewQueue(ActionEvent event) throws IOException{
        DB.Database db = DB.Database.getInstance();

        queue = currentAgent.getThreeForms();
        tTBIDColumn.setCellValueFactory(new PropertyValueFactory<>("ttbID"));
        dateSubmittedColumn.setCellValueFactory(new PropertyValueFactory<>("dateSubmitted"));
        brandNameColumn.setCellValueFactory(new PropertyValueFactory<>("brandName"));

        tableView();

        ObservableList<Form> tableValues = FXCollections.observableArrayList();
        for (int i = 0; i < queue.size(); i++) {
            tableValues.add(queue.get(i));
        }
        formTable.setItems(tableValues);
        printAHButton.setDisable(false);
    }







    @FXML
    public void setPage1(){
/*
        Agent1Label.setText(currentForm.getRepID());
        ArrayList<String> arr = currentForm.getBrewersPermit();
        arr.add(producerNumField.getText());
        Agent2Label.setText(arr.toString());
        Agent3Label.setText("Is Domestic? " + currentForm.getSource());
        AgentReview4Label1.setText(currentForm.getSerialNumber());
        Agent5Label1.setText(currentForm.getAlcoholType().toString());
        Agent6Label.setText(currentForm.getBrandName());
   */ }

    public void setPage2(){
/*        Agent7Label.setText(currentForm.getFancifulName());
        Agent8Label.setText(currentForm.getAddress().toString());
        Agent9Label.setText(currentForm.getMailingAddress().toString());
        Agent10Label.setText(currentForm.getFormula());
        Agent11Label.setText(currentForm.getWineFormItems().getGrapeVarietal());
        Agent12Label.setText(currentForm.getWineFormItems().getAppellation());
  */  }

    public void setPage3(){
    /*    Agent13Label.setText(currentForm.getPhoneNumber());
        Agent14Label.setText(currentForm.getEmail());
        Agent16Label1.setText(currentForm.getBlownBrandedEmbossedInfo());
        Agent16Label2.setText(currentForm.getDateSubmitted().toString());
*/    }

    public void setPage4(){
  //      Agent18Label.setText("" + currentForm.getAlcoholContent());
    }

}
