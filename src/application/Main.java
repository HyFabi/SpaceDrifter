package application;
	
import java.io.IOException;

import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Player;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	public static Pane root;
	public static Pane gameBackground;
	public static Player p = new Player();
	static Scene scene;
	static Controller c = new Controller();
	static Stage s;
	static Thread t = new Thread();
	static Movement m = new Movement();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			s = new Stage();
			root = (Pane) FXMLLoader.load(Main.class.getResource("../view/start.fxml"));
			scene = new Scene(root,root.getMaxWidth(),root.getMaxHeight());
			scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
			s.setScene(scene);
			s.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void startGame() throws IOException {
		root = (Pane) FXMLLoader.load(Main.class.getResource("../view/game.fxml"));
		scene = new Scene(root);
		s.setScene(scene);
		s.show();
		t.start();
	}
}