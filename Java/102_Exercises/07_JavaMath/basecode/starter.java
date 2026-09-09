/*
 *	Author: Alex Gasparyan
 *  Date: 09/07/2026
*/

class starter {
	public static void main(String args[]) {
        int applesPicked = 12;
        double boxes = 2.5;
        int baskets = 48;
        int cookiesPer = 4;
        double cookiesstudent = 8.5;
        System.out.println("Apples picked: " + applesPicked);
        System.out.println("Box weight: "+ boxes);
        System.out.println("Total baskets: " + baskets);
        int studentsInClass = 5; 
        System.out.println("Cookies per student (int division): " + applesPicked/cookiesPer);
        System.out.println("Cookies per student (double division): " + cookiesstudent/boxes);
        System.out.println("Leftover cookies: " + cookiesPer/2);
        double pricePerApple =0.35;
        System.out.println("Total cost: $" + pricePerApple*12 );		
        System.out.println("Math result: " + 5*5);
    }
}