package Main;
import java.util.Random;
import Human.Fighter;
import Monsters.Wolf;
import Scanner.GlobalScanner;


public class Magic_Logic {
	
	public static void mainMenu() {
		String userChoice;
		
		do{
			System.out.println("__________________________________________________");
			System.out.println("A) Create new human");
			System.out.println("B) Fight Wolf");
			System.out.println("C) Exit");
			System.out.println("__________________________________________________");
			userChoice = GlobalScanner.godScanner.nextLine().toUpperCase();
			
			
			if (userChoice.equals("A")) {
				createHuman();
				
			}
			else if (userChoice.equals("B")) {
				fightWolf();
			}
			
		}while(!userChoice.equals(""));
		
	}
	

	public static void createHuman() {
		String name;
		int strength;
		int critChance;
		System.out.println("Please enter a name: ");
		name = GlobalScanner.godScanner.nextLine();
		strength = GeneratorStats("strength");
		critChance = GeneratorStats("critChance");
		
		
		
		Fighter f = new Fighter(name, strength, critChance);
		System.out.println(f);
	}
	
	public static void fightWolf() {
		Wolf f = new Wolf(1);
		System.out.println(f);
	}
	
	public static void fightEvent() {
		String userChoice;
		System.out.println("What do you want to do?");
		System.out.println("__________________________________________________");
		System.out.println("A) Attack");
		System.out.println("B) Run away");
		System.out.println("__________________________________________________");

		
	}
	
	
	
	
	
	public static int GeneratorStats(String random) {
		//How to define maximum minimum EXAMPLE: Minimum = 10... Maximum = 20... 
		//r.nextInt(Maximum - Minimum) +1 ) + min;
		// Therefore: nextInt (20-10)+1) + 10
		// nextInt(11) + 10 - Will give a range between 10-20...
		
		
		Random r = new Random();
		if (random.equals("strength")) {
			return(r.nextInt(11)+20);	
		}
		
		else if (random.equals("critChance")) {
			return(r.nextInt(5)+1);
		}
		
		return 0;
	}
	
	
	
	
	
	
}
