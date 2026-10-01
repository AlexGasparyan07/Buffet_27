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
		int first=((int)(Math.random()*10));
		System.out.println("A number between 0 - 9: "+first);
		int second= ((int)(Math.random()*10+1));
		System.out.println("A number between 1 - 10: "+second);
		double third=((Math.random()+2.5));
		System.out.println("A double between 2.5 and 3.5: "+third);
		double last=((Math.random()*575+14));
		System.out.println("A double between 14 and 589: "+last);
	}
}
