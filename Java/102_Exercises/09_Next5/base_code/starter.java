/*
 *	Author:Alex Gasparyan
 *  Date:09/15/2026
 *	Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.print("Please enter a number: ");
	Scanner sc=new Scanner(System.in);
	int enternumber =sc.nextInt();
	System.out.println("Here are the next 5 numbers!");
	System.out.println(enternumber + ", "+(enternumber+1)+ ", "+(enternumber+2)+ ", "+(enternumber+3)+", "+(enternumber+4)+ ", "+(enternumber+5));
	System.out.println("Here are the next 5 multiples of "+enternumber+"!");
	System.out.println(enternumber + ", "+(enternumber*2)+", "+(enternumber*3)+", "+(enternumber*4)+", "+(enternumber*5)+", "+(enternumber*6));
	System.out.println("Here is "+enternumber+" divided by 100!");
	System.out.println(enternumber/100.0);
	System.out.println("Here is "+enternumber+" divided by 10!");
	System.out.println(enternumber/10.0);
	}
}
