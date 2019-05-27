package view;

import javafx.animation.AnimationTimer;
import model.Colision;

public class Thread extends AnimationTimer{

	@Override
	public void handle(long now) {
		try {
//			Main.m.move();
//			Main.p.paint();
		Main.p.followMouse();
		Colision.checkCollision();
		}catch (Exception e) {
			e.printStackTrace();
			stop();
		}
		try {
			Colision.checkCollision();
		} catch (Exception e) {
			stop();
			e.printStackTrace();
		}
	}
	
	@Override
	public void start() {
		super.start();
	}
}
