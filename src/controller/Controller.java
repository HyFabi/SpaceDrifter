package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller extends Pane{

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    void initialize() {
    	
    }
    
    @FXML
    private Pane player;
    
    @FXML
    void btn1(MouseEvent event) throws IOException {
    	Main.startGame();
    }
    
    @FXML
    void test(MouseEvent event) {
    	switch(event.getButton()) {
    	case PRIMARY: break;
    	case SECONDARY: break;
    	case MIDDLE: break;
		default: break;
    	}
    }
}
