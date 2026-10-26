/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Slot Machine Rules");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		System.out.println(" ");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		Scanner sc=sc.nextLine();
		String agree=sc.nextLine();
		int start=100;
		while()
		while(agree.equals("Yes") || agree.equals("yes") || agree.equals("Y") || agree.equals("y")){
			System.out.print("You have $100. How much would you like to wager? ");
			int wager=sc.nextInt();
			if(wager<=start){
				int first=((int)(Math.random()+1*10));
				int second=((int)(Math.random()+1*10));
				int third=((int)(Math.random()+1*10));
				
			}
		}
		if(agree.equals("No") || agree.equals("no") || agree.equals("N") || agree.equals("n")){
			System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!")
		}

	}
}
