package mode;

import java.util.Random;
import java.util.Scanner;

public class game {
    int choice;
    
    Scanner sc = new Scanner(System.in);
    
    int start = 1;
    int result = 9999;
    int nbressais = 0;
    int essais = 10;
    int mystere;
    
    int mode = 0;
    
    public void my_menu() {
         System.out.println("[1] Mode Solo -- [2] Mode IA -- [3] Retour au menu principal");

         try 
         {
	         choice = sc.nextInt();
	         switch (choice) {
	         case 1:
	        	 System.out.println("Vous avez choisi le mode Solo");
	        	 Solo_Mode s = new Solo_Mode();
	             s.mode1();
	             break;
	         case 2:
	        	 System.out.println("Vous avez choisi le mode IA");
	             IA_Mode i = new IA_Mode();
	             i.PlayerChoice();
	             break;
	         case 3:
	             menu m = new menu();
	             m.main(null);
	             break;
	         default :
	             System.out.println("Merci de saisir une valeur demandé.");
	             break;
	         }
         } catch(Exception e) {
         	System.out.println("Vous n'avez pas rentré un des choix proposé, réessayez !");
         	System.out.println("	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	");
            my_menu();
         }
    }
    
    /*
     * Permet au joueur en fin de partie 
     * de rejouer, de revenir au menu ou de quitter
     */
    public void Rejouer() {
    	System.out.println("[1] Rejouer -- [2] Retour au menu -- [3] Quitter le jeu");
        choice = sc.nextInt();
        
        switch (choice) 
        {
            case 1:
                if(mode == 1) {
                	System.out.println("Rejouer au mode solo");
                	Solo_Mode s = new Solo_Mode();
                	s.mode1();
                }
                else if (mode == 2) {
                	System.out.println("Rejouer au mode IA");
                	IA_Mode i = new IA_Mode();
                	i.mode2();
                }
                break;
            case 2:
                my_menu();
                break;
            case 3:
                System.exit(0);
                break;
            default :
                System.out.println("Merci de saisir une valeur demandé.");
                break;
        }
        
     // end of rejouer()
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Affichage du help \n \n");
    	
    	//Explication mode solo
    	sb.append("Mode solo : \n Une IA vous choisira un nombre mystere au hasard entre ").append(start).append(" et ").append(result).append("\n Vous aurez ").append(nbressais +10).append(" essais pour trouver ce nombre mystere et à chaque tour vous entrerez les valeurs comme les exemples suivants : \n");
    	sb.append("0002 / 0049 / 0490 / 7483 --> Tout vos nombre doivent avoir 4 chiffres \n ~~~~~~~~~~ \n");
    	
    	//Explication mode IA
    	sb.append("Mode IA : \n Vous devrez dans un premier temps choisir un nombre mystere entre ").append(start).append(" et ").append(result).append(" , l'IA par la suite essaiera de le trouver en ").append(nbressais).append(" essais \n \n");
    	
    	return sb.toString();
    }

    //end of class game
}