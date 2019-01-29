package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class ManufactureController {


    @FXML
    Button goToFAQ;

    @FXML
    Button searchButt;

    @FXML
    Button profileButt;

    @FXML
    Button BacktoWelcome;

    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", BacktoWelcome);
    }

    @FXML
    public void manufactureFAQ(ActionEvent event) throws IOException {
        pageSwitch(event, "ManFAQ.fxml", goToFAQ);
    }

    @FXML
    public void manSearch(ActionEvent event) throws IOException {
        pageSwitch(event, "ManSearch.fxml", searchButt);
    }

    @FXML
    public void manProfile(ActionEvent event) throws IOException {
        pageSwitch(event, "ManProfile.fxml", profileButt);
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
