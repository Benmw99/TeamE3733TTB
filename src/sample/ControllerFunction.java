package sample;

import java.sql.Connection;

public class ControllerFunction {
    iSubmit controller;

    public ControllerFunction(iSubmit sub){
        this.controller = sub;
    }
   void update(){
       this.controller.label1().setText("BINGGO");
       System.out.println("BING");
   }

}
