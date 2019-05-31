package Monsters;

public class Wolf extends Monster{
	public Wolf(int level) {
		super("Wolf", level,20,3);

	}
	
	public void Attack() {
		System.out.println("Attacks Player for '" + this.strength + "' damage...");
	}
	
	
	public String toString() {
		return "You have encountered a: " + "\nName: " + this.name + "\nLevel: " + this.level;
	}
}
