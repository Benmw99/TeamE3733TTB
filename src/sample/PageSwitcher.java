package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public  class PageSwitcher {
    public void pageSwitch(ActionEvent event, String filename, Stage stage, AttributeContainer attributeContainer) throws IOException {

        //////////////////////////////////////////////////////
        //  PAGE SWITCHING
        //////////////////////////////////////////////////////
        Parent root;
//        Stage stage;
//        stage=(Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(filename));
        root = loader.load();
        Scene scene = new Scene(root, 1360, 760);
        stage.setScene(scene);
        stage.show();
        //////////////////////////////////////////////////////
        //  DATA SHARING & CONTROLLER INITIALIZATION
        //////////////////////////////////////////////////////
        PageController controller = loader.getController();
        controller.setStage_DontTouch(stage);
        controller.onLoad(attributeContainer);


    }
}
