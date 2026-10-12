/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name?");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title=sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		String type=sc.nextLine();
		boolean wizard=type.equals("Wizard") || type.equals("wizard");
		boolean warrior=type.equals("Warrior") || type.equals("warrior");
		boolean rogue=type.equals("Rogue") || type.equals("rogue");
		if(wizard==true){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(warrior==true){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(rogue==true){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int points=20;
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int strength=sc.nextInt();
		if(strength>10){
			System.out.println("Make sure you have 10 or less points in this section.");
			System.out.print("Strength (1-10): ");
			strength=sc.nextInt();
		}
		points=points-strength;
		System.out.println("You have "+(points)+" left to spend.");
		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int dexter=sc.nextInt();
		if(dexter>10){
			System.out.println("Make sure you have 10 or less points in this section.");
			System.out.print("Dexterity (1-10): ");
			dexter=sc.nextInt();
		}
		points=(points-dexter);
		System.out.println("You have "+ (points)+" left to spend.");
		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int intel=sc.nextInt();
		points=points-intel;
		if(intel>10){
			System.out.println("Make sure you have 10 or less points in this section.");
			System.out.print("Intelligence (1-10): ");
			intel=sc.nextInt();
		}
		if(points<0){
				System.out.println("You have ran out of points. Please check how many points you have.");
				System.out.print("Intel (0-10): ");
				intel=sc.nextInt();
				points=0;
			}
		System.out.println("You have "+(points)+" left to spend.");
		System.out.println(" ");
		System.out.print("Charisma (1-10): ");
		int charisma=sc.nextInt();
		points=points-charisma;
		if(charisma>10){
			System.out.println("Make sure you have 10 or less points in this section.");
			System.out.print("Charisma (1-10): ");
			charisma=sc.nextInt();
			points=points-charisma;
		}
		if(points<0){
				System.out.println("You have ran out of points. Please check how many points you have left.");
				System.out.print("Charisma (1-10): ");
				charisma=sc.nextInt();
				points=0;
			}
		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS.");
		System.out.println("You're a "+type+" with the following stats!");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+ dexter);
		System.out.println("Intelligence - "+intel);
		System.out.println("Charisma - "+charisma);
		System.out.println(" ");
		System.out.println("Good luck on your quest "+name+"!");
	}
}