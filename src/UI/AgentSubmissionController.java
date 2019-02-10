package UI;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AgentSubmissionController extends PageControllerUI implements ISubmit {


    SubmitHelper submitHelper;

    public void setSubmitHelper(SubmitHelper submitHelper){
        this.submitHelper = submitHelper;
    }
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

    public TextField getRepIDField() {
        return RepIDField;
    }

    public void setRepIDField(TextField repIDField) {
        RepIDField = repIDField;
    }

    public TextField getProducerNumField() {
        return ProducerNumField;
    }

    public void setProducerNumField(TextField producerNumField) {
        ProducerNumField = producerNumField;
    }

    public ComboBox<String> getSourceComboBox() {
        return SourceComboBox;
    }

    public void setSourceComboBox(ComboBox<String> sourceComboBox) {
        SourceComboBox = sourceComboBox;
    }

    public TextField getSerialYearField() {
        return SerialYearField;
    }

    public void setSerialYearField(TextField serialYearField) {
        SerialYearField = serialYearField;
    }

    public TextField getSerialDigitsField() {
        return SerialDigitsField;
    }

    public void setSerialDigitsField(TextField serialDigitsField) {
        SerialDigitsField = serialDigitsField;
    }

    public ComboBox<String> getTypeComboBox() {
        return TypeComboBox;
    }

    public void setTypeComboBox(ComboBox<String> typeComboBox) {
        TypeComboBox = typeComboBox;
    }

    public TextField getVintageYearField() {
        return VintageYearField;
    }

    public void setVintageYearField(TextField vintageYearField) {
        VintageYearField = vintageYearField;
    }

    public TextField getPhField() {
        return PhField;
    }

    public void setPhField(TextField phField) {
        PhField = phField;
    }

    public TextField getAlcoholContentTextField() {
        return AlcoholContentTextField;
    }

    public void setAlcoholContentTextField(TextField alcoholContentTextField) {
        AlcoholContentTextField = alcoholContentTextField;
    }

    public TextField getBrandNameTextField() {
        return BrandNameTextField;
    }

    public void setBrandNameTextField(TextField brandNameTextField) {
        BrandNameTextField = brandNameTextField;
    }

    public TextField getBrandField() {
        return BrandField;
    }

    public void setBrandField(TextField brandField) {
        BrandField = brandField;
    }

    public TextField getFancifulField() {
        return FancifulField;
    }

    public void setFancifulField(TextField fancifulField) {
        FancifulField = fancifulField;
    }

    public TextField getName8Field() {
        return Name8Field;
    }

    public void setName8Field(TextField name8Field) {
        Name8Field = name8Field;
    }

    public ComboBox<String> getState8ComboBox() {
        return State8ComboBox;
    }

    public void setState8ComboBox(ComboBox<String> state8ComboBox) {
        State8ComboBox = state8ComboBox;
    }

    public TextField getAddress8Field() {
        return Address8Field;
    }

    public void setAddress8Field(TextField address8Field) {
        Address8Field = address8Field;
    }

    public TextField getCity8Field() {
        return City8Field;
    }

    public void setCity8Field(TextField city8Field) {
        City8Field = city8Field;
    }

    public TextField getZip8Field() {
        return Zip8Field;
    }

    public void setZip8Field(TextField zip8Field) {
        Zip8Field = zip8Field;
    }

    public RadioButton getSameAddressRadioButton() {
        return SameAddressRadioButton;
    }

    public void setSameAddressRadioButton(RadioButton sameAddressRadioButton) {
        SameAddressRadioButton = sameAddressRadioButton;
    }

    public TextField getName9Field() {
        return Name9Field;
    }

    public void setName9Field(TextField name9Field) {
        Name9Field = name9Field;
    }

    public ComboBox<String> getState9ComboBox() {
        return State9ComboBox;
    }

    public void setState9ComboBox(ComboBox<String> state9ComboBox) {
        State9ComboBox = state9ComboBox;
    }

    public TextField getAddress9Field() {
        return Address9Field;
    }

    public void setAddress9Field(TextField address9Field) {
        Address9Field = address9Field;
    }

    public TextField getCity9Field() {
        return City9Field;
    }

    public void setCity9Field(TextField city9Field) {
        City9Field = city9Field;
    }

    public TextField getZip9Field() {
        return Zip9Field;
    }

    public void setZip9Field(TextField zip9Field) {
        Zip9Field = zip9Field;
    }

    public TextField getFormulaField() {
        return FormulaField;
    }

    public void setFormulaField(TextField formulaField) {
        FormulaField = formulaField;
    }

    public TextField getGrapeVarField() {
        return GrapeVarField;
    }

    public void setGrapeVarField(TextField grapeVarField) {
        GrapeVarField = grapeVarField;
    }

    public TextField getWineAppField() {
        return WineAppField;
    }

    public void setWineAppField(TextField wineAppField) {
        WineAppField = wineAppField;
    }

    public TextField getPhoneNumField() {
        return PhoneNumField;
    }

    public void setPhoneNumField(TextField phoneNumField) {
        PhoneNumField = phoneNumField;
    }

    public TextField getEmailField() {
        return EmailField;
    }

    public void setEmailField(TextField emailField) {
        EmailField = emailField;
    }

    public CheckBox getCertCheckbox() {
        return CertCheckbox;
    }

    public void setCertCheckbox(CheckBox certCheckbox) {
        CertCheckbox = certCheckbox;
    }

    public TextField getState15Field() {
        return State15Field;
    }

    public void setState15Field(TextField state15Field) {
        State15Field = state15Field;
    }

    public CheckBox getLiquorCheckbox() {
        return LiquorCheckbox;
    }

    public void setLiquorCheckbox(CheckBox liquorCheckbox) {
        LiquorCheckbox = liquorCheckbox;
    }

    public TextField getAmountField() {
        return AmountField;
    }

    public void setAmountField(TextField amountField) {
        AmountField = amountField;
    }

    public CheckBox getResubmitCheckbox() {
        return ResubmitCheckbox;
    }

    public void setResubmitCheckbox(CheckBox resubmitCheckbox) {
        ResubmitCheckbox = resubmitCheckbox;
    }

    public TextField getTTBIDField() {
        return TTBIDField;
    }

    public void setTTBIDField(TextField TTBIDField) {
        this.TTBIDField = TTBIDField;
    }

    public TextField getAdditionalInfoField() {
        return AdditionalInfoField;
    }

    public void setAdditionalInfoField(TextField additionalInfoField) {
        AdditionalInfoField = additionalInfoField;
    }

    public TextField getTranslationField() {
        return TranslationField;
    }

    public void setTranslationField(TextField translationField) {
        TranslationField = translationField;
    }

    public DatePicker getAppDate() {
        return AppDate;
    }

    public void setAppDate(DatePicker appDate) {
        AppDate = appDate;
    }

    public TextField getSignatureField() {
        return SignatureField;
    }

    public void setSignatureField(TextField signatureField) {
        SignatureField = signatureField;
    }

    public Button getSubmitButton() {
        return SubmitButton;
    }

    public void setSubmitButton(Button submitButton) {
        SubmitButton = submitButton;
    }

    protected void onLeave(){}

    protected void onLoad(){}


}
