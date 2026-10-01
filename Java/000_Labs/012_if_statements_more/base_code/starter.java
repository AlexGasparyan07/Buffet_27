/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int numone=sc.nextInt();
		System.out.println(" ");
		System.out.print("Please input your first number: ");
		int numtwo=sc.nextInt();
		boolean fact=numone==numtwo;
		if(fact==true){

			System.out.println("Your numbers are the same!");
		}
		if(fact==false){
			System.out.println("Your numbers are different!");
		}
		}
}

