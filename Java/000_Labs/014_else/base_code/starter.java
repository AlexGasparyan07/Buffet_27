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
		System.out.print("Pick a number between 1 - 1000: "); 
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int random=(int)(Math.random()*1002)+1;
		if(a==random){
			System.out.println("Your number was the random number. The number was "+ random+".");
	}
		else if(a!=random){
			System.out.println("Your number wasn't the random number. The number was "+ random+".");
	}
	}
}

