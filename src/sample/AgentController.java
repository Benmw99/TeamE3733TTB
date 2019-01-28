package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class AgentController {

    ManufactureController agentControl;

    @FXML
    Button agentProfileButt;

    @FXML
    Button agentButt;

    @FXML
    public void agentProfile(ActionEvent event) throws IOException{
        agentControl.pageSwitch(event, "AgentProfile", agentProfileButt);
    }
    /*
    @FXML
   public void samplesceneswitch(ActionEvent event) throws IOException {
        pageSwitch(event, "filename", buttonName);
    }

    */
}
