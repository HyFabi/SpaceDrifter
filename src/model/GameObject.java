package model;

public abstract class GameObject extends Vektor{
	int maxHealth;
	float friction;
	
	public GameObject(float dX, float dY, int maxHealth, float friction) {
		super(dX, dY);
		this.maxHealth = maxHealth;
		this.friction = friction;
	}
}
