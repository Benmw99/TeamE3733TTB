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
    Button BacktoWelcome;

    @FXML
    public void welcomePage(ActionEvent event) throws IOException{
        pageSwitch(event, "WelcomePage.fxml", BacktoWelcome);
    }

    @FXML
    public void agentProfile(ActionEvent event) throws IOException{
        pageSwitch(event, "AgentProfile.fxml", agentProfileButt);
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
}
