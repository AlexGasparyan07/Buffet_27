/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int red=((int)(Math.random()*256));
        int green=((int)(Math.random()*256));
        int blue=((int)(Math.random()*256));
        int redtwo=(255-red);
        int greentwo=(255-green);
        int bluetwo=(255-blue);
        System.out.println("Random color: rgb("+red+", "+green+", "+blue+")");
        System.out.println("Complementary Color: rgb("+redtwo+", "+greentwo+", "+bluetwo+")");
        getColor(red, green, blue);
        getColor(redtwo, greentwo, bluetwo);
        System.out.println(" ");
        System.out.println("Triadic Colors");
        getColor(red, green, blue);
        getColor(blue, red, green);
        getColor(green, blue, red);
        System.out.println("Dark Color");
        int darkred=((int)(Math.random()*129));
        int darkgreen=((int)(Math.random()*129));
        int darkblue=((int)(Math.random()*129));
        getColor(darkred, darkgreen, darkblue);
        System.out.println("Light Color");
        int lightred=((int)(Math.random()*128+127));
        int lightgreen=((int)(Math.random()*128+127));
        int lightblue=((int)(Math.random()*128+127));
        getColor(lightred, lightgreen, lightblue);
        System.out.println("Bluer Color");
        int bluerred=((int)(Math.random()*129));
        int bluergreen=((int)(Math.random()*129));
        int bluer=((int)(Math.random()*256+127));
        getColor(bluerred, bluergreen, bluer);
        System.out.println("Different style");
        int stylered=((int)(Math.random()*6+250));
        int stylegreen=((int)(Math.random()*6+250));
        int styleblue=((int)(Math.random()*6+250));
        getColor(stylered, stylegreen, styleblue);





		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
