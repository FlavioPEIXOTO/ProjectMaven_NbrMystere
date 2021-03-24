package mode;

import java.util.Random;
import java.util.Scanner;

public class game {
	int choice;
	Scanner sc = new Scanner(System.in);
	public game()
	{
		System.out.println("Hello World");

		System.out.println("1 for Player, 2 for IA, 3 for Menu");

		try {
		choice = sc.nextInt();
			switch (choice) {
			case 1:
				mode1();
				break;
			case 2:
				//mode2();
				break;
			case 3:
				Menu m = new Menu();
				break;
			default :
				System.out.println("Merci de saisir une valeur demandé.");
				break;
			}
		}
			catch (Exception  test)
			{
				System.out.println("Error");
				
			}
	}
	
	//Premier mode de jeu
	public void mode1(){	  

		  System.out.println("Hello player");
		  
		  Scanner input = new Scanner(System.in);
		  Random rnd = new Random();
		  int start = 1;
		  int result = 1000;
		  int mystere = rnd.nextInt(result);
		  int nbressais = 0;
		  int nbrjoueur = -1;
		  while (nbrjoueur != mystere && nbressais < 10) 
		  {
		    System.out.println("Votre nombres de [" + start + " à " + result + "] ? ");
			nbrjoueur = input.nextInt();
		    if (nbrjoueur < mystere)
		    {
		      System.out.println("Trop petit");
		      start = nbrjoueur + 1;
		    }
		    else if (nbrjoueur > mystere)
		    {
		      System.out.println("Trop grand");
		      result = nbrjoueur - 1;
		    }
		    else  
		    {
		      System.out.println("Félicitations !!! ");
		      System.out.println("Trouve en " + nbressais + " essais");
		      System.out.println("Plusieurs choix s'offre à vous : 1 for play again - 2 for menu - 3 for exit");
		      choice = sc.nextInt();
		      switch (choice) 
		      {
		  		  case 1:
			  		  mode1();
					  break;
				  case 2:
					  menu m = new menu();;
					  break;
				  case 3:
					  System.exit(0);
					  break;
				  default :
					  System.out.println("Merci de saisir une valeur demandé.");
					  break;
			  }
		        break;
		    }
			System.out.println(9 - nbressais + " nombres d'essais restants");
		    ++nbressais;
		    if (nbressais == 10)
		    {
		    	System.out.println("Tu n'as plus de tentative");
		    	//Fonction rejouer ou quitter
		    }
		  } //end of while
		  
	//end of mode 1 
	}	
	
	//end of class game
}
