package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class ControllerStartMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public void btn1(MouseEvent event) throws IOException {
    	Main.startGame();
    }

    @FXML
    void initialize() {

    }
}
