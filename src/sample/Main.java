package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        PageSwitcher switcher = new PageSwitcher();
        Form form = new Form("",1);
        User u = new User();
        AttributeContainer a = new AttributeContainer(form,null,u);
        switcher.pageSwitch(null, "Page1.fxml", primaryStage, a);
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
