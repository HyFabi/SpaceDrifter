package model;

import java.awt.MouseInfo;

import application.Main;
import javafx.scene.layout.Pane;

public class Player extends GameObject{
	float shield;
	public int x,y;
	public static boolean wP,dP,sP,shP,spP,aP;
	
	public Player() {
		super(0, 0, 100, 0);
	}
	
	public Pane getPane() {
		for(Object o : Main.root.getChildren()) {
//			System.out.println(o);
			if(o instanceof Pane) {
				Pane p = (Pane) o;
				Main.root.getChildren().remove(p);
				return p;
			}
		}
		System.out.println("Missing Pane!");
		return null;
	}
	
	public void addPane(Pane p) {
		Main.root.getChildren().add(p);
	}
	
	public void doPaint(Pane p){
		p.setLayoutX(1 + p.getLayoutX());
		Main.root.getChildren().add(p);
		p = null;
	}
	
	public void followMouse() {
		if(Main.cg.Player == null) {
			return;
		}
		Main.cg.Player.setLayoutX(MouseInfo.getPointerInfo().getLocation().getX());
		Main.cg.Player.setLayoutY(MouseInfo.getPointerInfo().getLocation().getY());
		System.out.println("X: " + Main.cg.Player.getLayoutX() + " Y: " + Main.cg.Player.getLayoutY());
	}
}
