package br.sapiens;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    public HelloController(){
        /*System.out.println(welcomeText);
        welcomeText.setText("Buceta");*/
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}