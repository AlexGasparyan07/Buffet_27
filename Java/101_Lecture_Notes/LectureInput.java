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
        int item1Quant=sc.nextInt();
        double onetotal=hotdog*item1Quant;
        System.out.println("Item 1 Total is: "+(onetotal));
        
         System.out.println("How many French Fries would you like?");
        int item2Quant=sc.nextInt();
        double twototal=fries*item2Quant;
        System.out.println("Item 2 Total is: "+(twototal));

         System.out.println("How many Drinks would you like?");
        int item3Quant=sc.nextInt();
        double threetotal=drink*item3Quant;
        System.out.println("Item 3 Total is: "+(threetotal));

        double grandtotal=(onetotal+twototal+threetotal);
        System.out.println("How much would you like to tip?");
        double tip= sc.nextDouble();
        double newtotal=tip/100+grandtotal;
        System.out.println("Your total is : "+newtotal);


        

	}
}
