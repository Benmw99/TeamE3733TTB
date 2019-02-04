package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CivilController {
    private Entities.SearchResult results;

    //not added because no button to go back from civilsearch to welcome screen
    /*
    @FXML
    Button BacktoWelcome;

    @FXML
    public void welcomePage(ActionEvent event) throws IOException {
        pageSwitch(event, "WelcomePage.fxml", BacktoWelcome);
    }
    */

    //CivilSearch
    @FXML
    TextField searchfield;

    @FXML
    Button advSearchButton;

    //CivilAdvSearch
    @FXML
    CheckBox ttbIDSearchcheckBox;
    @FXML
    Label civilRepIDLabel;

    @FXML
    Label civilAlcTypeLabel;

    @FXML
    Label civilManLabel;

    @FXML
    Button menuASButton;

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
    TextField cityField;

    @FXML
    DatePicker manufactureDate;

    @FXML
    TextField idField;

    @FXML
    Button printResults;

    @FXML
    SplitMenuButton alcoholTypeSplitMenu;

    @FXML
    Button goUpPageButton;

    @FXML
    Button goDownPageButton;

    //CivilSearchForm
    @FXML
    Button backToAdvSearch;

    @FXML
    Button printSearchResultsCSV;



    public void advSearch(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", advSearchButton);
    }

    public void goBackToSearch(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", backToAdvSearch);
    }

    public void goToPage2(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch3.fxml", goUpPageButton);
    }

    public void goToPage1(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", goDownPageButton);
    }

    public void goToPage3(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch3.fxml", goUpPageButton);
    }

    public void goDownToPage2(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", goDownPageButton);
    }

    private void pageSwitch(ActionEvent event, String filename, Button b) throws IOException{
        Parent root;
        Stage stage;
        stage=(Stage) b.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource(filename));
        Scene scene = new Scene(root, 1360, 760);
        stage.setScene(scene);
        stage.show();
    }

}
