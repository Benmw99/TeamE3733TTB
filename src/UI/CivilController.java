package UI;

import DB.Database;
import Entities.AdvancedSearch;
import Entities.AlcoholType;
import Entities.Form;
import Entities.SearchResult;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Entities.AlcoholType.*;

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
    Button newThirtyButton;

    @FXML
    Button prevThirtyButton;

    @FXML
    Label civilTTBLabel;

    @FXML
    Label civilManLabel;

    @FXML
    Button menuASButton;

    @FXML
    Button search1Button;

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
    ComboBox typeComboBox;

    @FXML
    Label civilAlcTypeLabel0;
    @FXML
    Label civilAlcTypeLabel1;
    @FXML
    Label civilAlcTypeLabel2;
    @FXML
    Label civilAlcTypeLabel3;
    @FXML
    Label civilAlcTypeLabel4;
    @FXML
    Label civilAlcTypeLabel5;
    @FXML
    Label civilAlcTypeLabel6;
    @FXML
    Label civilAlcTypeLabel7;
    @FXML
    Label civilAlcTypeLabel8;
    @FXML
    Label civilAlcTypeLabel9;

    @FXML
    Label civilBrandLabel0;
    @FXML
    Label civilBrandLabel1;
    @FXML
    Label civilBrandLabel2;
    @FXML
    Label civilBrandLabe3;
    @FXML
    Label civilBrandLabel4;
    @FXML
    Label civilBrandLabel5;
    @FXML
    Label civilBrandLabel6;
    @FXML
    Label civilBrandLabel7;
    @FXML
    Label civilBrandLabel8;
    @FXML
    Label civilBrandLabel9;

    @FXML
    CheckBox ttbIDSearchcheckBox0;
    @FXML
    CheckBox ttbIDSearchcheckBox1;
    @FXML
    CheckBox ttbIDSearchcheckBox2;
    @FXML
    CheckBox ttbIDSearchcheckBox3;
    @FXML
    CheckBox ttbIDSearchcheckBox4;
    @FXML
    CheckBox ttbIDSearchcheckBox5;
    @FXML
    CheckBox ttbIDSearchcheckBox6;
    @FXML
    CheckBox ttbIDSearchcheckBox7;
    @FXML
    CheckBox ttbIDSearchcheckBox8;
    @FXML
    CheckBox ttbIDSearchcheckBox9;



    //CivilSearchForm
    @FXML
    Button backToAdvSearch;

    @FXML
    Button printSearchResultsCSV;

    SearchResult result;
    int searchPage;


    public void advSearch(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", advSearchButton);
    }

    //#################################################################################################################################
    //                                   advanced search

    public void searchAdvanced(ActionEvent event) throws IOException {
        Entities.AdvancedSearch advancedSearch = new AdvancedSearch();

        if(typeComboBox.getValue().equals("Beers")){
            advancedSearch.setAlcoholType(MaltBeverage);
        }else if(typeComboBox.getValue().equals("Wines")){
            advancedSearch.setAlcoholType(Wine);
        }
        /*else if(typeComboBox.getValue().equals("Wines")){
            advancedSearch.setAlcoholType(DistilledLiquor);
        }*/
        advancedSearch.setBrandName(brandNameTextField.getText());

        DB.Database db = DB.Database.getInstance();
        result = db.dbSelect.searchBy(advancedSearch);
    }

    public void nextPage(ActionEvent event) throws IOException {
        if(searchPage != 3){
            int start, end;
            start = ( searchPage -1) *10;
            end = (searchPage) *10;
            loadPage(event, result.getResults().subList(start,end));
        }
    }

    public void prevPage(ActionEvent event) throws IOException {
        if(searchPage != 1){

        }
    }


    public void loadPage(ActionEvent event, List<Form> arr) throws IOException {


    }

    public void goBackToSearch(ActionEvent event) throws IOException {
        pageSwitch(event,"CivilAdvSearch.fxml", backToAdvSearch);
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
