/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Ascii Mueseum!");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1. Peanuts");
		System.out.println("2. Baseball");
		System.out.println("3. Billiards");
		Scanner sc=new Scanner(System.in);
		String exhibit=sc.nextLine();
		if(exhibit.equals("Peanuts") || exhibit.equals("peanuts")){
			System.out.println("--- Peanuts --- ");
			System.out.println("1. Snoopy");
			System.out.println("2. Woodstock");
			String first=sc.nextLine();
			if(first.equals("Snoopy") || first.equals("snoopy")){
				System.out.println("            ,-.");
				System.out.println("          .:\\ '`-.");
				System.out.println("          |:|  __ b");
				System.out.println("           `;-(");
				System.out.println("          ,'  |");
				System.out.println("         ( \\|||_");
				System.out.println(",-----(.-''--``-------.");
				System.out.println("/_______`'______________\\");
				System.out.println("/                      	  \\");
				System.out.println("Snoopy on a Doghouse");
			};
			if(first.equals("Woodstock") || first.equals("woodstock")){
				System.out.println("        _)/_");
				System.out.println("        _)/_");
				System.out.println("         )(_");
				System.out.println("   ,--.''-`'.");
				System.out.println("  :.'  :  =- :");
				System.out.println("  |:   | ._|]|");
				System.out.println("  |____|_____|");
				System.out.println(" /.:. /-_-_/");
				System.out.println("(.:: / |=|");
				System.out.println(" `--'  |=|");
				System.out.println("       |=| ");
				System.out.println("Woodstock on a Mailbox");
			};
			if(first!=("Snoopy") || first!=("snoopy") || first!=("Woodstock") || first!=("woodstock")){
				System.out.println("That is not a piece in this exhibit. Please restart and try again. Goodbye.");
			}
		}
		else if(exhibit.equals("Baseball") || exhibit.equals("baseball")){
			System.out.println("--- Baseball --- ");
			System.out.println("1. Baseball");
			System.out.println("2. Batter");
			String second=sc.nextLine();
			if(second.equals("Baseball") || second.equals("baseball")){
				System.out.println("        ____");
				System.out.println("      .'    '.");
				System.out.println("     /'-....-'\\");
				System.out.println("     |        |");
				System.out.println("     \\.-''''-./");
				System.out.println("      '.____.'");
				System.out.println("A baseball");
			}
				if(second.equals("Batter") || second.equals("batter")){
					System.out.println("                                            _--_     dMb");
					System.out.println("                                         __(._  )   d0P");
					System.out.println("                                           <  (D)  .MP");
					System.out.println("                                         .~ \\ /~```M-. ");
					System.out.println("                                       .~    V    Mo_ \\    ");
					System.out.println("-------============((((}{)             (   (___. {:)-./ ");
					System.out.println("                                        ~._____.(:}   ");
					System.out.println("                                         /     .M\\  ");
					System.out.println("                                        /      '' \\");
					System.out.println("                                       |    /\\   |");
					System.out.println("                                        /   /  \\   \\");
					System.out.println("                                       /   /    \\   \\");
					System.out.println("                                       \\__/      \\__/");
					System.out.println("                                       / /        | |");
					System.out.println("                                      .^V^.      .^V^.");
					System.out.println("                                       +-+        +-+");
					System.out.println("Hitting in Progress");
				}
					else if(second!=("Batter") || second!=("batter") || second!=("Baseball") || second!=("baseball")){
						System.out.println("That is not a piece in this exhibit. Please restart and try again. Goodbye.");
					}
		}
					else if(exhibit.equals("Billiards") || exhibit.equals("billiards")){
					System.out.println("--- Billiards --- ");
					System.out.println("1. 8 Ball");
					System.out.println("2. Table");
					String third=sc.nextLine();
					if(third.equals("8 Ball") || third.equals("8 ball")){
						System.out.println(" .-'''-.");
						System.out.println("/   _   \\");
						System.out.println("|  (8)  |");
						System.out.println("\\   ^   /");
						System.out.println(" '-...-'");
						System.out.println("8 Ball");
					}
					if(third.equals("table") || third.equals("table")){
						System.out.println("              __________");
						System.out.println("            ./)      o  (\\.");
						System.out.println("          ./     o         \\.");
						System.out.println("        ./             o     \\.");
						System.out.println("      ./)   o                 (\\.");
						System.out.println("    ./                           \\.");
						System.out.println("  ./             O           o     \\.");
						System.out.println("./)_________________________________(\\.   ");
						System.out.println("(_____________________________________)");
						System.out.println("|XX|===============================|XX|");
						System.out.println(" \\/                                 \\/");
						System.out.println("Billiards Table");
					}
					if(third!=("table") || third!=("Table") || third!=("8 Ball") || third!=("8 ball")){
						System.out.println("That is not a piece in this exhibit. Please restart and try again. Goodbye.");
					}
				}
					if(exhibit!=("Peanuts") || exhibit!=("peanuts") || exhibit!=("baseball") || exhibit!=("Baseball") || exhibit!=("Billiards") || exhibit!=("billiards")){
						System.out.println("You didn't choose an exhibit in the Museum. Goodbye");
					}

	}
}