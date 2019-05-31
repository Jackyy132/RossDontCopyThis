package Human;

public abstract class Human {
	String name;
	int health;
	int strength;
	int critChance;
	int level;
	int exp;
	
	public Human(String name, int strength, int critChance) {
		this.name = name;
		this.health = 100;
		this.strength = strength;
		this.critChance = critChance;
		this.level = 1;
		this.exp = 0;
	}
	

	public int levelUp() {
		return this.level++;
		
	}
	
	
}
