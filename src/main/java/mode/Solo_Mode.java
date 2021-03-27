package mode;

import java.util.Random;

public class Solo_Mode extends game {

	int nbrjoueur = -1;
	String nbrjoueur_inString = "";
	
	public void VerifNumberChoice() {
    	
    	int length = nbrjoueur_inString.length();
    	while (length != 4) {
    		System.out.println("Veuilliez choisir un nombre de taille : 4 chiffres : ");
    		System.out.print("==> ");
    		nbrjoueur_inString = sc.nextLine();

    		length = nbrjoueur_inString.length();
    	}
    }
	
	//Premier mode de jeu
    public void mode1(){
    	
    	start = 1;
    	result = 9999;
    	nbressais = 0;
    	mode = 1;

		Random rnd = new Random();
		mystere = rnd.nextInt(result);
		
		while (nbrjoueur != mystere && nbressais < essais)
		{
		  System.out.println("Votre nombres de [" + start + " à " + result + "] ? ");
		  nbrjoueur_inString = sc.nextLine();
		  VerifNumberChoice();

		  try {
			  nbrjoueur = Integer.parseInt(nbrjoueur_inString);
		  }catch(Exception e) {
			  System.out.println("Vous n'avez pas rentré un nombre !");
			  nbrjoueur_inString = "";
			  VerifNumberChoice();
		  }
	  
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
		  System.out.println("Nbressais : " + nbressais);
		} //end of while
		System.out.println("Vous êtes à cours d'essais, vous avez PERDU !");
		Rejouer();
	//end of mode 1 
	}
}
