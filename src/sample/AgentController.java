package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;



public class AgentController {

    ManufactureController agentControl;

    @FXML
    Button agentProfileButt;

    @FXML
    Button agentButt;

    @FXML
    Button agentSearchButton;

    @FXML
    Button agentSendToAgentButton;

    @FXML
    Button agentFeedbackButton;


    @FXML
    public void agentProfile(ActionEvent event) throws IOException{
        agentControl.pageSwitch(event, "AgentProfile", agentProfileButt);
    }

    @FXML
    public void agentSearch(ActionEvent event) throws IOException{
        agentControl.pageSwitch(event, "AgentSearch.fxml", agentSearchButton);
    }

    @FXML
    public void agentSendToAgent(ActionEvent event) throws IOException{
        agentControl.pageSwitch(event, "AgentSendToAgent.fxml", agentSendToAgentButton);
    }

    @FXML
    public void agentFeedback(ActionEvent event) throws IOException{
        agentControl.pageSwitch(event, "AgentFeedback.fxml", agentFeedbackButton);
    }

    /*
    @FXML
   public void samplesceneswitch(ActionEvent event) throws IOException {
        pageSwitch(event, "filename", buttonName);
    }

    */
}
