/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Welcome to the guessing game!");
		System.out.print("Please guess a number: ");
		Scanner sc=new Scanner(System.in);
		int guess=sc.nextInt();
		int answer=((int)(Math.random()*1000+1));
		while(guess!=answer){
			if(guess<answer){
				System.out.println("The number is higher.");
				System.out.println("Please guess a number: ");
				guess=sc.nextInt();
			}
			if(guess>answer){
				System.out.println("The number is lower.");
				System.out.println("Please guess a number: ");
				guess=sc.nextInt();
			}
			if(guess==answer){
				System.out.println("You got the number!");
				break;
			}
		}
	}
}
