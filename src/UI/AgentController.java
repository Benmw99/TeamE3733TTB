package UI;


import com.sun.jndi.toolkit.url.Uri;
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
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import sun.management.resources.agent;

import java.io.File;
import java.net.URI;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.io.IOException;
import java.util.List;

import Entities.*;

import DB.*;

import javax.print.attribute.standard.Media;

public class AgentController implements IFormDisplay {
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
    Label Display1Label;
    @FXML
    Label Display2Label;
    @FXML
    Label Display3Label;
    @FXML
    Label DisplayReview4Label1;
    @FXML
    Label Display4Label2;
    @FXML
    Label Display5Label1;
    @FXML
    Label Display5Label2;
    @FXML
    Label Display5Label3;
    @FXML
    Label Display6Label;
    @FXML
    Label Display7Label;
    @FXML
    Label Display8Label;
    @FXML
    Label Display9Label;
    @FXML
    Label Display10Label;
    @FXML
    Label Display11Label;
    @FXML
    Label Display12Label;
    @FXML
    Label Display13Label;
    @FXML
    Label Display14Label;
    @FXML
    Label Display15Label1;
    @FXML
    Label Display15Label2;
    @FXML
    Label Display15Label3;
    @FXML
    Label Display16Label1;
    @FXML
    Label Display16Label2;

    @Override
    public Label getDisplay1Label() {
        return Display1Label;
    }

    @Override
    public Label getDisplay2Label() {
        return Display2Label;
    }

    @Override
    public Label getDisplay3Label() {
        return Display3Label;
    }

    @Override
    public Label getDisplayReview4Label1() {
        return DisplayReview4Label1;
    }

    @Override
    public Label getDisplay4Label2() {
        return Display4Label2;
    }

    @Override
    public Label getDisplay5Label1() {
        return Display5Label1;
    }

    @Override
    public Label getDisplay5Label2() {
        return Display5Label2;
    }

    @Override
    public Label getDisplay5Label3() {
        return Display5Label3;
    }

    @Override
    public Label getDisplay6Label() {
        return Display6Label;
    }

    @Override
    public Label getDisplay7Label() {
        return Display7Label;
    }

    @Override
    public Label getDisplay8Label() {
        return Display8Label;
    }

    @Override
    public Label getDisplay9Label() {
        return Display9Label;
    }

    @Override
    public Label getDisplay10Label() {
        return Display10Label;
    }

    @Override
    public Label getDisplay11Label() {
        return Display11Label;
    }

    @Override
    public Label getDisplay12Label() {
        return Display12Label;
    }

    @Override
    public Label getDisplay13Label() {
        return Display13Label;
    }

    @Override
    public Label getDisplay14Label() {
        return Display14Label;
    }

    @Override
    public Label getDisplay15Label1() {
        return Display15Label1;
    }

    @Override
    public Label getDisplay15Label2() {
        return Display15Label2;
    }

    @Override
    public Label getDisplay15Label3() {
        return Display15Label3;
    }

    @Override
    public Label getDisplay16Label1() {
        return Display16Label1;
    }

    @Override
    public Label getDisplay16Label2() {
        return Display16Label2;
    }

    @Override
    public Label getDisplay17Label() {
        return Display17Label;
    }

    @Override
    public Label getDisplay18Label() {
        return Display18Label;
    }

    @Override
    public Label getDisplay20Label() {
        return Display20Label;
    }

    @FXML
    Label Display17Label;
    @FXML
    Label Display18Label;
    @FXML
    Label Display20Label;

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
    static AudioClip reject;
    static AudioClip accept;

    @FXML
    protected void initialize(){
        if(currentForm != null) {
            displayForm(currentForm);
        }
        File rej = new File("assets/reject.mp3");
        reject = new AudioClip(rej.toURI().toString());
        File acc = new File("assets/accept.mp3");
        accept = new AudioClip(acc.toURI().toString());
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

        reject.play();
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
        accept.play();
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
