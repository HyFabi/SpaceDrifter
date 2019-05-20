package application;

import javafx.animation.AnimationTimer;

public class Thread extends AnimationTimer{

	@Override
	public void handle(long now) {
		try {
//			Main.m.move();
//			Main.p.paint();
		Main.p.followMouse();
		}catch (Exception e) {
			e.printStackTrace();
			stop();
		}
		
	}
	
	@Override
	public void start() {
		super.start();
	}
}
