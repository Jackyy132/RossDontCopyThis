package Monsters;

public abstract class Monster {
	String name;
	int level;
	int health;
	int strength;
	public abstract void Attack();
	
	
	public Monster(String name, int level, int health, int strength) {
		this.name = name;
		this.level = level;
		this.health = health;
		this.strength = strength;
	}
}
