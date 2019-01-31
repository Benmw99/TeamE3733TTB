package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


/*

To add new scene switch:

1. create the fxml
2. add controller to fxml
    fx:controller="UI.ManufactureController"
3. add fx:id to button
    fx:id="BacktoWelcome"
4. add button id to controller
5. copy and paste samplesceneswitch function
    change function name
6. change fxml file  and button
    button is the button from the current open scene
    fxml file is the scene you want to switch to
7. add onbutton clicked event to button, specify function you just created

*/

/*
###########################
List of fxml pages:

ManHome
ManSearch
ManFAQ
ManTTBForm1
ManTTBForm2
ManTTBForm3
ManProfile
ManLabelCompare


 */

public class WelcomeController {

    @FXML
    Button manButton;

    @FXML
    Button civilButton;

    @FXML
    Button agentButton;


    @FXML
    public void agentLogin(ActionEvent event) throws IOException{
        pageSwitch(event, "AgentLogin.fxml", agentButton);
    }


    @FXML
    public void civilSearch(ActionEvent event) throws IOException{
        pageSwitch(event, "CivilSearch.fxml", civilButton);
    }


    @FXML
    public void manufacturerLogin(ActionEvent event) throws IOException {
        pageSwitch(event, "ManLogin.fxml", manButton);
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

    /*
    @FXML
   public void samplesceneswitch(ActionEvent event) throws IOException {
        pageSwitch(event, "filename", buttonName);
    }

    */

}
