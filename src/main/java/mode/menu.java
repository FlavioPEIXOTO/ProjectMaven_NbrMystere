package mode;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        System.out.println("		<Bienvenue au nombre myst�re !>		  ");
        int choice;
        
        System.out.println("[1] Jouer -- [2] Help -- [3] Quitter le jeu");
        System.out.println("Que souhaitez-vous faire : ");
        Scanner sc = new Scanner(System.in);
        
		/*
		 * Test dans le cas o� le joueur rentre un caract�res
		 * autre qu'un nombre entier
		 */
        try {
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Choix : " + choice);
                //Lancer le jeu
                game g = new game();
                g.my_menu();
                break;
            case 2:
                System.out.println("Choix : " + choice);
                game g_help = new game();
                System.out.println(g_help.toString());
            	menu m = new menu();
                m.main(args);
                break;
            case 3:
                System.out.println("Choix : " + choice);
                System.out.println("Fermeture du jeu");
                System.exit(0);
                break;
            default :
                System.out.println("Merci de saisir une valeur demand�.");
                break;
            }
        }catch(Exception e) { 
        	System.out.println("Vous n'avez pas rentr� un des choix propos�, r�essayez !");
        	System.out.println("	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	");
            menu m = new menu();
            m.main(args);
        }

    }

}