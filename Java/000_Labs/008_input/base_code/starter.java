/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name?"); 
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("What is your age?");
		int age=sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int birthmonth=sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int birthday=sc.nextInt();
		System.out.println("What year were you born?");
		int birthyear=sc.nextInt();
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money=sc.nextDouble();
		System.out.println("Your name is "+name+" and you were born on "+birthmonth+"/"+birthday+"/"+birthyear+".");
		System.out.println("You are "+age+" years old!!!");
		System.out.println("You have $"+money+" in your wallet.");


	}
}
