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
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a width: ");
		int width=sc.nextInt(); 
		System.out.print("Please enter a height: ");
		int height=sc.nextInt();
		int x=0;
		int y=0;
		while(y<height){		
				if(y>height){
					break;
				}
				System.out.println(" ");
				y++;
				x=0;
				while(x<width){
				if(x>width){
				System.out.println(" ");
				System.out.println(" ");
					break;
			}
			System.out.print("*");
			x++;
		}
		}
	System.out.println(" ");
	System.out.println("---------------------------------");
	System.out.println(" ");
	System.out.print("Please enter an interger: ");
	int next=sc.nextInt();
	int z=0;
	String star=("*");
	while(z<next){
		if(z>next){
			break;
		}
		System.out.println(star);
		star=star+("*");
		z++;
	}
System.out.println(" ");
System.out.println("---------------------------------");
System.out.println(" ");
System.out.println("Reversed Star:");
System.out.print("Please enter an interger: ");
int reverse=sc.nextInt();
String r=("*");
int w=0;
String space=(" ");
while(w<reverse){
	System.out.println(space+r);
	r=r+("*");
	space=space+(" ");
	w++;
}
	}
}
