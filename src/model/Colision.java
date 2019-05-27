package model;

import javafx.scene.Node;
import javafx.scene.shape.Box;
import view.Main;

public class Colision {
	
	public static boolean checkCollision(){
		for(Node n : Main.root.getChildren()) {
//			System.out.println(o);
			if(n instanceof Box) {
				Box b = (Box) n;
				if(collisionDetection(b)) {
					System.out.println("Collision");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean collisionDetection(Box b) {
		if(b == null) {
			return false;
		}
		return b.getLayoutX() + b.getWidth() > Player.getPane().getLayoutX() && Player.getPane().getLayoutX() + Player.getCollisionPane().getPrefWidth() > b.getLayoutX() && b.getLayoutY() + b.getHeight() > Player.getCollisionPane().getLayoutY() && Player.getCollisionPane().getLayoutY() + Player.getCollisionPane().getPrefHeight() > b.getLayoutY();
	}
}
