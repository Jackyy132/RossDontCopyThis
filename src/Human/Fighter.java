package Human;
public class Fighter extends Human{
	
	public Fighter(String name, int strength, int critChance) {
		super(name, strength, critChance);
		this.name = name;
		this.strength = strength;
		this.critChance = critChance;
	}
	
	
	
	public String toString() {
		return "Name: " + this.name + "\nHealth: " + this.health + "\nStrength: " + this.strength + "\nCrit chance: " + this.critChance + "%" + "\nLevel: " + this.level + "\nExp: " + this.exp;
	}




}
