package model;

import application.Main;
import javafx.scene.shape.Box;

public class Colision {
	
	public static boolean checkCollision() throws Exception {
		for(Object o : Main.root.getChildren()) {
//			System.out.println(o);
			if(o instanceof Box) {
				Box b = (Box) o;
				if(collisionDetection(b)) {
					
				}
			}
		}
		throw new Exception("WIXA");
	}
	
	public static boolean collisionDetection(Box b) {
		if(b == null) {
			return false;
		}
		return b.getLayoutX() + b.getWidth() > Player.getPane().getLayoutX() && Player.getPane().getLayoutX() + Player.getCollisionPane().getPrefWidth() > b.getLayoutX() && b.getLayoutY() + b.getHeight() > Player.getCollisionPane().getLayoutY() && Player.getCollisionPane().getLayoutY() + Player.getCollisionPane().getPrefHeight() > b.getLayoutY();
	}
}
