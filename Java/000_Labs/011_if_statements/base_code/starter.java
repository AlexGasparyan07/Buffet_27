/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x=7;
		System.out.println("The first variable is: "+ x);
		int y=4;
		System.out.println("The second variable is: "+y); 
		boolean question=x==y;
		if(question==false){
			System.out.println("The variables are different");
		}
		if(question==true){
			System.out.println("The variables are the same");
		}
	}
}
