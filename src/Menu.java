package mode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		System.out.println("Bienvenue au nombre myst�re ! ");
		int choice;
		System.out.println("1 for game, 2 for help, 3 for quit");
		Scanner sc = new Scanner(System.in);
		
		// boucle try
		/*
		 * 
		 *
		boolean testTry = false;
		while (!testTry)
		{
		*
		*/
			try {
				choice = sc.nextInt(); 
				switch (choice) {
				case 1:
					System.out.println("choix num�ro " + choice);
					//Lancer le jeu
					game g = new game();
					break;
				case 2:
					System.out.println("choix num�ro " + choice);
					//More info
					break;
				case 3:
					System.out.println("choix num�ro " + choice);
					System.exit(0);
					break; 
				default :
					System.out.println("Merci de saisir une valeur demand�.");
					break;
				}
				//testTry = true;
			}
				catch (InputMismatchException test)
				{
					System.out.println("Error");
				}
		//}
	}

}
