package UI;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.PageController;
import Entities.*;

import java.io.IOException;

public class ManufacturerSubmissionController extends PageControllerUI implements iSubmit {

    @FXML
    TextField RepIDField;

    @FXML
    TextField ProducerNumField;

    @FXML
    ComboBox<String> SourceComboBox;

    @FXML
    TextField SerialYearField;

    @FXML
    TextField SerialDigitsField;

    @FXML
    ComboBox<String> TypeComboBox;

    @FXML
    TextField VintageYearField;

    @FXML
    TextField PhField;

    @FXML
    TextField AlcoholContentTextField;

    @FXML
    TextField BrandNameTextField;

    @FXML
    TextField BrandField;

    @FXML
    TextField FancifulField;

    @FXML
    TextField Name8Field;

    @FXML
    ComboBox<String> State8ComboBox;

    @FXML
    TextField Address8Field;

    @FXML
    TextField City8Field;

    @FXML
    TextField Zip8Field;

    @FXML
    RadioButton SameAddressRadioButton;

    @FXML
    TextField Name9Field;

    @FXML
    ComboBox<String> State9ComboBox;

    @FXML
    TextField Address9Field;

    @FXML
    TextField City9Field;

    @FXML
    TextField Zip9Field;

    @FXML
    TextField FormulaField;

    @FXML
    TextField GrapeVarField;

    @FXML
    TextField WineAppField;

    @FXML
    TextField PhoneNumField;

    @FXML
    TextField EmailField;

    @FXML
    CheckBox CertCheckbox;

    @FXML
    TextField State15Field;

    @FXML
    CheckBox LiquorCheckbox;

    @FXML
    TextField AmountField;

    @FXML
    CheckBox ResubmitCheckbox;

    @FXML
    TextField TTBIDField;

    @FXML
    TextField AdditionalInfoField;

    @FXML
    TextField TranslationField;

    @FXML
    DatePicker AppDate;

    @FXML
    TextField SignatureField;

    @FXML
    Button SubmitButton;

    @Override
    public TextField getRepIDField() {
        return RepIDField;
    }

    public void setRepIDField(TextField repIDField) {
        RepIDField = repIDField;
    }

    @Override
    public TextField getProducerNumField() {
        return ProducerNumField;
    }

    public void setProducerNumField(TextField producerNumField) {
        ProducerNumField = producerNumField;
    }

    @Override
    public ComboBox<String> getSourceComboBox() {
        return SourceComboBox;
    }

    public void setSourceComboBox(ComboBox<String> sourceComboBox) {
        SourceComboBox = sourceComboBox;
    }

    @Override
    public TextField getSerialYearField() {
        return SerialYearField;
    }

    public void setSerialYearField(TextField serialYearField) {
        SerialYearField = serialYearField;
    }

    @Override
    public TextField getSerialDigitsField() {
        return SerialDigitsField;
    }

    public void setSerialDigitsField(TextField serialDigitsField) {
        SerialDigitsField = serialDigitsField;
    }

    @Override
    public ComboBox<String> getTypeComboBox() {
        return TypeComboBox;
    }

    public void setTypeComboBox(ComboBox<String> typeComboBox) {
        TypeComboBox = typeComboBox;
    }

    @Override
    public TextField getVintageYearField() {
        return VintageYearField;
    }

    public void setVintageYearField(TextField vintageYearField) {
        VintageYearField = vintageYearField;
    }

    @Override
    public TextField getPhField() {
        return PhField;
    }

    public void setPhField(TextField phField) {
        PhField = phField;
    }

    @Override
    public TextField getAlcoholContentTextField() {
        return AlcoholContentTextField;
    }

    public void setAlcoholContentTextField(TextField alcoholContentTextField) {
        AlcoholContentTextField = alcoholContentTextField;
    }

    @Override
    public TextField getBrandNameTextField() {
        return BrandNameTextField;
    }

    public void setBrandNameTextField(TextField brandNameTextField) {
        BrandNameTextField = brandNameTextField;
    }

    @Override
    public TextField getBrandField() {
        return BrandField;
    }

    public void setBrandField(TextField brandField) {
        BrandField = brandField;
    }

    @Override
    public TextField getFancifulField() {
        return FancifulField;
    }

    public void setFancifulField(TextField fancifulField) {
        FancifulField = fancifulField;
    }

    @Override
    public TextField getName8Field() {
        return Name8Field;
    }

    public void setName8Field(TextField name8Field) {
        Name8Field = name8Field;
    }

    @Override
    public ComboBox<String> getState8ComboBox() {
        return State8ComboBox;
    }

    public void setState8ComboBox(ComboBox<String> state8ComboBox) {
        State8ComboBox = state8ComboBox;
    }

    @Override
    public TextField getAddress8Field() {
        return Address8Field;
    }

    public void setAddress8Field(TextField address8Field) {
        Address8Field = address8Field;
    }

    @Override
    public TextField getCity8Field() {
        return City8Field;
    }

    public void setCity8Field(TextField city8Field) {
        City8Field = city8Field;
    }

    @Override
    public TextField getZip8Field() {
        return Zip8Field;
    }

    public void setZip8Field(TextField zip8Field) {
        Zip8Field = zip8Field;
    }

    @Override
    public RadioButton getSameAddressRadioButton() {
        return SameAddressRadioButton;
    }

    public void setSameAddressRadioButton(RadioButton sameAddressRadioButton) {
        SameAddressRadioButton = sameAddressRadioButton;
    }

    @Override
    public TextField getName9Field() {
        return Name9Field;
    }

    public void setName9Field(TextField name9Field) {
        Name9Field = name9Field;
    }

    @Override
    public ComboBox<String> getState9ComboBox() {
        return State9ComboBox;
    }

    public void setState9ComboBox(ComboBox<String> state9ComboBox) {
        State9ComboBox = state9ComboBox;
    }

    @Override
    public TextField getAddress9Field() {
        return Address9Field;
    }

    public void setAddress9Field(TextField address9Field) {
        Address9Field = address9Field;
    }

    @Override
    public TextField getCity9Field() {
        return City9Field;
    }

    public void setCity9Field(TextField city9Field) {
        City9Field = city9Field;
    }

    @Override
    public TextField getZip9Field() {
        return Zip9Field;
    }

    public void setZip9Field(TextField zip9Field) {
        Zip9Field = zip9Field;
    }

    @Override
    public TextField getFormulaField() {
        return FormulaField;
    }

    public void setFormulaField(TextField formulaField) {
        FormulaField = formulaField;
    }

    @Override
    public TextField getGrapeVarField() {
        return GrapeVarField;
    }

    public void setGrapeVarField(TextField grapeVarField) {
        GrapeVarField = grapeVarField;
    }

    @Override
    public TextField getWineAppField() {
        return WineAppField;
    }

    public void setWineAppField(TextField wineAppField) {
        WineAppField = wineAppField;
    }

    @Override
    public TextField getPhoneNumField() {
        return PhoneNumField;
    }

    public void setPhoneNumField(TextField phoneNumField) {
        PhoneNumField = phoneNumField;
    }

    @Override
    public TextField getEmailField() {
        return EmailField;
    }

    public void setEmailField(TextField emailField) {
        EmailField = emailField;
    }

    @Override
    public CheckBox getCertCheckbox() {
        return CertCheckbox;
    }

    public void setCertCheckbox(CheckBox certCheckbox) {
        CertCheckbox = certCheckbox;
    }

    @Override
    public TextField getState15Field() {
        return State15Field;
    }

    public void setState15Field(TextField state15Field) {
        State15Field = state15Field;
    }

    @Override
    public CheckBox getLiquorCheckbox() {
        return LiquorCheckbox;
    }

    public void setLiquorCheckbox(CheckBox liquorCheckbox) {
        LiquorCheckbox = liquorCheckbox;
    }

    @Override
    public TextField getAmountField() {
        return AmountField;
    }

    public void setAmountField(TextField amountField) {
        AmountField = amountField;
    }

    @Override
    public CheckBox getResubmitCheckbox() {
        return ResubmitCheckbox;
    }

    public void setResubmitCheckbox(CheckBox resubmitCheckbox) {
        ResubmitCheckbox = resubmitCheckbox;
    }

    @Override
    public TextField getTTBIDField() {
        return TTBIDField;
    }

    public void setTTBIDField(TextField TTBIDField) {
        this.TTBIDField = TTBIDField;
    }

    @Override
    public TextField getAdditionalInfoField() {
        return AdditionalInfoField;
    }

    public void setAdditionalInfoField(TextField additionalInfoField) {
        AdditionalInfoField = additionalInfoField;
    }

    @Override
    public TextField getTranslationField() {
        return TranslationField;
    }

    public void setTranslationField(TextField translationField) {
        TranslationField = translationField;
    }

    @Override
    public DatePicker getAppDate() {
        return AppDate;
    }

    public void setAppDate(DatePicker appDate) {
        AppDate = appDate;
    }

    @Override
    public TextField getSignatureField() {
        return SignatureField;
    }

    public void setSignatureField(TextField signatureField) {
        SignatureField = signatureField;
    }

    @Override
    public Button getSubmitButton() {
        return SubmitButton;
    }

    public void setSubmitButton(Button submitButton) {
        SubmitButton = submitButton;
    }

    @Override
    protected void onLeave(){}

    @Override
    protected void onLoad(){}


    /**
     * Checks if the combobox is on wine and displays the appropriate text fields
     *
     * @throws IOException
     */
    @FXML
    public void checkWine() throws IOException{
        if (getTypeComboBox().getValue().equals("Wine")){
            getVintageYearField().disableProperty().setValue(false);
            getPhField().disableProperty().setValue(false);

        }
        else{
            getVintageYearField().disableProperty().setValue(true);
            getVintageYearField().setText("");
            getPhField().disableProperty().setValue(true);
            getPhField().setText("");
        }
    }

    /**
     * Will disable and reset fields is they select the button "same as question 8"
     *
     * @throws IOException someone help me here, it throws errors, but works anyways
     */
    @FXML
    public void checkMail() throws IOException{
        if (getSameAddressRadioButton().isSelected()){
            getName9Field().setEditable(false);
            getName9Field().setDisable(true);
            getName9Field().setText("");
            getState9ComboBox().setDisable(true);
            getState9ComboBox().setPromptText("State");
            getAddress9Field().setEditable(false);
            getAddress9Field().setText("");
            getAddress9Field().setDisable(true);
            getCity9Field().setEditable(false);
            getCity9Field().setText("");
            getCity9Field().setDisable(true);
            getZip9Field().setEditable(false);
            getZip9Field().setText("");
            getZip9Field().setDisable(true);
        }

        else{
            getName9Field().setEditable(true);
            getName9Field().setDisable(false);
            getState9ComboBox().setDisable(false);
            getState9ComboBox().setPromptText("State");
            getAddress9Field().setEditable(true);
            getAddress9Field().setDisable(false);
            getCity9Field().setEditable(true);
            getCity9Field().setDisable(false);
            getZip9Field().setEditable(true);
            getZip9Field().setDisable(false);
        }
    }


}
