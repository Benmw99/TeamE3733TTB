package UI;

import DB.Database;
import Entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
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
    Button goButton;

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
    Label civilBrandLabel3;
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

    //Form Labels
    @FXML
    Label Civ1Label;
    @FXML
    Label Civ2Label;
    @FXML
    Label Civ3Label;
    @FXML
    Label CivReview4Label1;
    @FXML
    Label Civ4Label2;
    @FXML
    Label Civ5Label1;
    @FXML
    Label Civ5Label2;
    @FXML
    Label Civ5Label3;
    @FXML
    Label Civ6Label;
    @FXML
    Label Civ7Label;
    @FXML
    Label Civ8Label;
    @FXML
    Label Civ9Label;
    @FXML
    Label Civ10Label;
    @FXML
    Label Civ11Label;
    @FXML
    Label Civ12Label;
    @FXML
    Label Civ13Label;
    @FXML
    Label Civ14Label;
    @FXML
    Label Civ15Label1;
    @FXML
    Label Civ15Label2;
    @FXML
    Label Civ15Label3;
    @FXML
    Label Civ16Label1;
    @FXML
    Label Civ16Label2;
    @FXML
    Label Civ17Label;
    @FXML
    Label Civ18Label;
    @FXML
    Label Civ20Label;

    @FXML
    TableView<Form> resultTable;

    @FXML
    TableColumn<Form, Integer> col1;

    @FXML
    TableColumn<Form, AlcoholType> col2;

    @FXML
    TableColumn<Form, String> col3;

    @FXML
    TableColumn<Form, Integer> col4;


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
        //Actually make sure these are fully empty later

        if(typeComboBox.getValue().equals("Beers")){
            advancedSearch.setAlcoholType(MaltBeverage);
        }else if(typeComboBox.getValue().equals("Wines")){
            advancedSearch.setAlcoholType(Wine);
        }else if(typeComboBox.getValue().equals("Distilled Liquor")){
            advancedSearch.setAlcoholType(DistilledLiquor);
        }
        if (brandNameTextField.getText() != null && !brandNameTextField.getText().trim().equals("")) {
            advancedSearch.setBrandName(brandNameTextField.getText());
        }
        //if (alcoholContentTextField.getText() != "") {
            //Alcohol Content not in search yet
        //}
        //if (manField.getText() != "") {
            //Manufacturer not in search yet
        //}
        //if (stateField.getText() != "") {
            //State not in search yet
        //}
        //if (cityField.getText() != "") {
            //city not in search yet
        //}
        //if (manufactureDate.get) DATE NOT IMPLEMENTED YET
        if (idField.getText() != null && !idField.getText().trim().equals("")) {
            advancedSearch.setTtbID(Integer.parseInt(idField.getText()));
        }

        DB.Database db = DB.Database.getInstance();
        result = db.dbSelect.searchBy(advancedSearch);
        System.out.println("It ran");

        col1.setCellValueFactory(new PropertyValueFactory<>("ttbID"));
        col2.setCellValueFactory(new PropertyValueFactory<>("alcoholType"));
        col3.setCellValueFactory(new PropertyValueFactory<>("brandName"));
        col4.setCellValueFactory(new PropertyValueFactory<>("companyID"));

        ObservableList<Form> tableValues = FXCollections.observableArrayList();
        for (int i = 0; i < result.getResults().size(); i++) {
            tableValues.add(result.getResults().get(i));
        }
        resultTable.setItems(tableValues);
    }

    public void nextPage(ActionEvent event) throws IOException {
        if(searchPage != 3){
            int start, end;
            start = ( searchPage -1) *10;
            end = (searchPage) *10;
            if(result.getResults().size() < end){ end = result.getResults().size(); }
            loadPage(event, result.getResults().subList(start,end));
        }
    }

    public void prevPage(ActionEvent event) throws IOException {
        if(searchPage != 1){

        }
    }


    public void loadPage(ActionEvent event, List<Form> arr) throws IOException {

        List<CheckBox> ttb = new ArrayList<CheckBox>();
        ttb.add(ttbIDSearchcheckBox0);
        ttb.add(ttbIDSearchcheckBox1);
        ttb.add(ttbIDSearchcheckBox2);
        ttb.add(ttbIDSearchcheckBox3);
        ttb.add(ttbIDSearchcheckBox4);
        ttb.add(ttbIDSearchcheckBox5);
        ttb.add(ttbIDSearchcheckBox6);
        ttb.add(ttbIDSearchcheckBox7);
        ttb.add(ttbIDSearchcheckBox8);
        ttb.add(ttbIDSearchcheckBox9);

        List<Label> alc = new ArrayList<Label>();
        alc.add(civilAlcTypeLabel0);
        alc.add(civilAlcTypeLabel1);
        alc.add(civilAlcTypeLabel2);
        alc.add(civilAlcTypeLabel3);
        alc.add(civilAlcTypeLabel4);
        alc.add(civilAlcTypeLabel5);
        alc.add(civilAlcTypeLabel6);
        alc.add(civilAlcTypeLabel7);
        alc.add(civilAlcTypeLabel8);
        alc.add(civilAlcTypeLabel9);

        List<Label> brand = new ArrayList<Label>();
        brand.add(civilBrandLabel0);
        brand.add(civilBrandLabel1);
        brand.add(civilBrandLabel2);
        brand.add(civilBrandLabel3);
        brand.add(civilBrandLabel4);
        brand.add(civilBrandLabel5);
        brand.add(civilBrandLabel6);
        brand.add(civilBrandLabel7);
        brand.add(civilBrandLabel8);
        brand.add(civilBrandLabel9);

        for(int i =0; i < arr.size(); i++){
            ttb.get(i).setText("" + arr.get(i).getTtbID());
            alc.get(i).setText(arr.get(i).getAlcoholType().toString());
            brand.get(i).setText(arr.get(i).getBrandName());
        }
        for(int i = arr.size(); i < 10; i++){
            ttb.get(i).setText("");
            alc.get(i).setText("");
            brand.get(i).setText("");
        }



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
