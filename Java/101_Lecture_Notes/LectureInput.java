/*
    Lecture note example - Input!!
*/
import java.util.Scanner; 

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Alex's Hot Dog Stand");
        System.out.println("Here's our menu:");
        double hotdog=(6.50);
        System.out.println("1. Hot Dog - $"+hotdog);
        double fries=(3.99);
        System.out.println("2. French Fries - $"+fries);
        Double drink=(1.99);
        System.out.println("3. Drink - $"+drink);

        System.out.println("How many Hot Dogs would you like?");
        Scanner sc=new Scanner(System.in);
        int item1Quant=sc.nextInt;
        System.out.println("Item 1 Total is: "+(hotdog*item1Quant));
	}
}
