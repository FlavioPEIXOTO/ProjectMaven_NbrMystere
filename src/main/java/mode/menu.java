package mode;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        System.out.println("		<Bienvenue au nombre mystère !>		  ");
        int choice;
        System.out.println("[1] for game	/	[2] for help	/	[3] for quit");
        System.out.println("Que souhaitez-vous faire : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        
        switch (choice) {
        case 1:
            System.out.println("choix numéro " + choice);
            //Lancer le jeu
            game g = new game();
            g.my_menu();
            break;
        case 2:
            System.out.println("choix numéro " + choice);
            //More info
            break;
        case 3:
            System.out.println("choix numéro " + choice);
            System.exit(choice);
            break;
        case 4:
            System.out.println("choix numéro " + choice);
            //A supp
            menu m = new menu();
            break;
        default :
            System.out.println("Merci de saisir une valeur demandé.");
            break;
        }
    }

}