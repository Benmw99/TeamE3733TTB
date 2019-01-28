package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CivilController {

    ManufactureController civilControl;

    @FXML
    Button civilButt;

    @FXML
    public void civilSearch(ActionEvent event) throws IOException{
        civilControl.pageSwitch(event, "CivilSearch.fmxl", civilButt);
    }


}
