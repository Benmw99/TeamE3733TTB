package UI;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sun.management.resources.agent;

import java.sql.Timestamp;
import java.util.List;

import java.awt.*;
import java.io.IOException;
import java.util.List;

import Entities.*;

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
    MenuButton menuAVFMenuButton;

    @FXML
    CheckBox commentAVFCheckBox;

    @FXML
    Button section1AVFButton;

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

    private Form currentForm;
    private Agent currentAgent;
    private List<Form> queue;


    @FXML
    public void login(ActionEvent event) throws IOException {
        this.currentAgent = new Agent(nameField.getText(),passField.getText());
        pageSwitch(event, "AgentHome.fxml", loginButton);

      /*  if(this.currentAgent.authenticate()) {
            pageSwitch(event, "AgentHome.fxml", loginButton);
        }
        else {
            Alert ohNo = new Alert(Alert.AlertType.WARNING);
            ohNo.setContentText("Invalid Password or Username my dude");
            ohNo.showAndWait();
        } */
    }

    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", backButton);
    }
    @FXML
    public void agentViewForm(ActionEvent event) throws IOException {
        //TODO:have to load selected form somehow
        pageSwitch(event, "AgentViewForm.fxml", backButton);
    }
    @FXML
    public void rejectForm(ActionEvent event) throws IOException {
//        this.currentForm.reject(this.currentAgent.getName());
        pageSwitch(event, "AgentHome.fxml", backButton);
    }
    @FXML
    public void approveForm(ActionEvent event) throws IOException {
//        this.currentForm.approve(this.currentAgent.getName());
        pageSwitch(event, "AgentHome.fxml", backButton);
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
        // Also need to figure out to clean this up in order to only
        // call one set of "set labels" each
        queue = this.currentAgent.getThreeForms();
        for(int i = 0; i < queue.size(); i++){

            int tTBID = queue.get(i).getTtbID();
            Timestamp approvalDate = queue.get(i).getDateSubmitted();
            ApprovalStatus approvalStatus = queue.get(i).getApprovalStatus();
            int twoYears = ((24*60)*(365*2));
            Timestamp expirationDate = new Timestamp(approvalDate.getTime() + twoYears);

            if(i == 0) {
                appNum1.setText(Integer.toString(tTBID));       // Allows for us to print out the TTB ID number,
                appStat1.setText(approvalDate.toString());      // the approval status, the date on which the
                appDate1.setText(approvalStatus.toString());    // form was approved, and the expiration date
                expirDate1.setText(expirationDate.toString());  // which we have decided is two years from the
            }                                                   // approval date
            if(i == 1){
                appNum2.setText(Integer.toString(tTBID));
                appStat2.setText(approvalDate.toString());
                appDate2.setText(approvalStatus.toString());
                expirDate2.setText(expirationDate.toString());
            }
            if(i == 2){
                appNum3.setText(Integer.toString(tTBID));
                appStat3.setText(approvalDate.toString());
                appDate3.setText(approvalStatus.toString());
                expirDate3.setText(expirationDate.toString());
            }

        }
        //pageSwitch(event, "AgentHome.fxml:, getNewQueueButton)
    }

}
