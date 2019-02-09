package UI;

import com.sun.org.apache.bcel.internal.generic.LADD;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.OptionalInt;


public interface iSubmit {

        TextField getRepIDField();

        TextField getProducerNumField();

        ComboBox<String> getSourceComboBox();

        TextField getSerialYearField();

        TextField getSerialDigitsField();

        ComboBox<String> getTypeComboBox();

        TextField getVintageYearField();

        TextField getPhField();

        TextField getAlcoholContentTextField();

        TextField getBrandNameTextField();

        TextField getBrandField();

        TextField getFancifulField();

        TextField getName8Field();

        ComboBox<String> getState8ComboBox();

        TextField getAddress8Field();

        TextField getCity8Field();

        TextField getZip8Field();

        RadioButton getSameAddressRadioButton();

        TextField getName9Field();

        ComboBox<String> getState9ComboBox();

        TextField getAddress9Field();

        TextField getCity9Field();

        TextField getZip9Field();

        TextField getFormulaField();

        TextField getGrapeVarField();

        TextField getWineAppField();

        TextField getPhoneNumField();

        TextField getEmailField();

        CheckBox getCertCheckbox();

        TextField getState15Field();

        CheckBox getLiquorCheckbox();

        TextField getAmountField();

        CheckBox getResubmitCheckbox();

        TextField getTTBIDField();

        TextField getAdditionalInfoField();

        TextField getTranslationField();

        DatePicker getAppDate();

        TextField getSignatureField();

        Button getSubmitButton();

}