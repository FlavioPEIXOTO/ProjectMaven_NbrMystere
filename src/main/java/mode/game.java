package mode;

import java.util.Random;
import java.util.Scanner;

public class game {
    int choice;
    Scanner sc = new Scanner(System.in);
    
    int start = 1;
    int result = 9999;
    int nbressais = 0;
    int mystere;
    
    int mode = 0;
    
    
 /*   public game()
    {
       
    }*/
    
    public void my_menu() {
         System.out.println("1 for Player, 2 for IA, 3 for Menu");

         choice = sc.nextInt();
         switch (choice) {
         case 1:
             mode1();
             break;
         case 2:
         	System.out.println("case 2 : IA");
             IA_Mode i = new IA_Mode();
             i.PlayerChoice();
             System.out.println("fin case 2 : IA");
             break;
         case 3:
             menu m = new menu();
             break;
         default :
             System.out.println("Merci de saisir une valeur demandé.");
             break;
         }
    }
    
    public void Rejouer() {
        choice = sc.nextInt();
        
        switch (choice) 
        {
            case 1:
                if(mode == 1) {
                	System.out.println("Rejouer au mode solo");
                	mode1();
                }
                else if (mode == 2) {
                	System.out.println("Rejouer au mode IA");
                	//mode2();
                }
                break;
            case 2:
                menu m = new menu();
                break;
            case 3:
                System.exit(0);
                break;
            default :
                System.out.println("Merci de saisir une valeur demandé.");
                break;
        }
    }
    
//Premier mode de jeu
    public void mode1(){
    	
    	start = 1;
    	result = 1000;
    	nbressais = 0;
    	mode = 1;
    	
	    System.out.println("Hello player");
		Random rnd = new Random();
		mystere = rnd.nextInt(result);
		int nbrjoueur = -1;
		while (nbrjoueur != mystere && nbressais < 10)
		{
		  System.out.println("Votre nombres de [" + start + " à " + result + "] ? ");
		  nbrjoueur = sc.nextInt();
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
		    Rejouer();
		    break;
		  }
		  ++nbressais;
		} //end of while
	//end of mode 1 
	}

    //end of class game
}