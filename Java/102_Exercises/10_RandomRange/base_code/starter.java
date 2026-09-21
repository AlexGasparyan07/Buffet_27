/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an interger: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("Please enter another interger (bigger than the first): ");
		int twonum=sc.nextInt();
		System.out.println("");
		System.out.println("Your range is "+num+" to "+twonum);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(twonum-num))+num);
		System.out.print(", ");
		System.out.print((int)(Math.random()*(twonum-num))+num);
		System.out.print(", ");
		System.out.print((int)(Math.random()*(twonum-num))+num);
		System.out.print(", ");
		System.out.print((int)(Math.random()*(twonum-num))+num);
		System.out.print(", ");
		System.out.println((int)(Math.random()*(twonum-num))+num);
	}
}
