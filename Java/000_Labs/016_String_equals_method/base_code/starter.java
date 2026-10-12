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
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		Scanner sc=new Scanner(System.in);
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
	}
}
