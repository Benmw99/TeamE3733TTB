package UI;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManAppController extends PageControllerUI implements ISubmit {

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

    @Override
    public TextField getRepIDField() {
        return RepIDField;
    }

    @Override
    public TextField getProducerNumField() {
        return ProducerNumField;
    }

    @Override
    public ComboBox<String> getSourceComboBox() {
        return SourceComboBox;
    }

    @Override
    public TextField getSerialYearField() {
        return SerialYearField;
    }

    @Override
    public TextField getSerialDigitsField() {
        return SerialDigitsField;
    }

    @Override
    public ComboBox<String> getTypeComboBox() {
        return TypeComboBox;
    }

    @Override
    public TextField getVintageYearField() {
        return VintageYearField;
    }

    @Override
    public TextField getPhField() {
        return PhField;
    }

    @Override
    public TextField getAlcoholContentTextField() {
        return AlcoholContentTextField;
    }

    @Override
    public TextField getBrandNameTextField() {
        return BrandNameTextField;
    }

    @Override
    public TextField getBrandField() {
        return BrandField;
    }

    @Override
    public TextField getFancifulField() {
        return FancifulField;
    }

    @Override
    public TextField getName8Field() {
        return Name8Field;
    }

    @Override
    public ComboBox<String> getState8ComboBox() {
        return State8ComboBox;
    }

    @Override
    public TextField getAddress8Field() {
        return Address8Field;
    }

    @Override
    public TextField getCity8Field() {
        return City8Field;
    }

    @Override
    public TextField getZip8Field() {
        return Zip8Field;
    }

    @Override
    public RadioButton getSameAddressRadioButton() {
        return SameAddressRadioButton;
    }

    @Override
    public TextField getName9Field() {
        return Name9Field;
    }

    @Override
    public ComboBox<String> getState9ComboBox() {
        return State9ComboBox;
    }

    @Override
    public TextField getAddress9Field() {
        return Address9Field;
    }

    @Override
    public TextField getCity9Field() {
        return City9Field;
    }

    @Override
    public TextField getZip9Field() {
        return Zip9Field;
    }

    @Override
    public TextField getFormulaField() {
        return FormulaField;
    }

    @Override
    public TextField getGrapeVarField() {
        return GrapeVarField;
    }

    @Override
    public TextField getWineAppField() {
        return WineAppField;
    }

    @Override
    public TextField getPhoneNumField() {
        return PhoneNumField;
    }

    @Override
    public TextField getEmailField() {
        return EmailField;
    }

    @Override
    public CheckBox getCertCheckbox() {
        return CertCheckbox;
    }

    @Override
    public TextField getState15Field() {
        return State15Field;
    }

    @Override
    public CheckBox getLiquorCheckbox() {
        return LiquorCheckbox;
    }

    @Override
    public TextField getAmountField() {
        return AmountField;
    }

    @Override
    public CheckBox getResubmitCheckbox() {
        return ResubmitCheckbox;
    }

    @Override
    public TextField getTTBIDField() {
        return TTBIDField;
    }

    @Override
    public TextField getAdditionalInfoField() {
        return AdditionalInfoField;
    }

    @Override
    public TextField getTranslationField() {
        return TranslationField;
    }

    @Override
    public DatePicker getAppDate() {
        return AppDate;
    }

    @Override
    public TextField getSignatureField() {
        return SignatureField;
    }

    @Override
    public Button getSubmitButton() {
        return SubmitButton;
    }

    void onLoad(){}

    protected void onLeave(){}

//    public void setSubmitHelper(SubmitHelper helper){}

}
