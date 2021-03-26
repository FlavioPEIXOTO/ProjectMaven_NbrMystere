package mode;

import java.io.IOException;
import java.util.Random;

public class IA_Mode extends game {
	
	int nbr_IA = -1;
	int result_ecart;
	
	
	public void PlayerChoice(){
		try {
			System.out.println("Here");
			mystere =  sc.nextInt();
			if (mystere > 0 && mystere < 10000) {
				mode2();
			}else {
				PlayerChoice();
			}
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
	public void verif() {
		int ecart;
		
		if(nbr_IA > mystere) {
			ecart = nbr_IA - mystere;
			if (ecart <= 100) {
				result_ecart = 0;
			}
			else if(ecart > 100 && ecart <= 300){
				result_ecart = 1;
			}
			else if(ecart > 300 && ecart <= 600){
				result_ecart = 3;
			}
			else {
				result_ecart = 6;
			}
		}
		else {
			ecart = mystere - nbr_IA;
			if (ecart <= 100) {
				result_ecart = 0;
			}
			else if(ecart > 100 && ecart <= 300){
				result_ecart = 1;
			}
			else if(ecart > 300 && ecart <= 600){
				result_ecart = 3;
			}
			else {
				result_ecart = 6;
			}
		}
	}
	
	public void mode2() {
		System.out.println("Vous commencez le mode 2");
	
		Random rnd = new Random();
		
		while (nbr_IA != mystere && nbressais < 200) {
			verif();
			if (nbressais > 10) {
				System.out.println("L'IA n'a pas réussi a trouvé le nombre mystere en 10 essais !");
				break;
			}
			nbr_IA = start + rnd.nextInt(result - start);
			if(nbr_IA > mystere) {
				result -= result_ecart * 100;
				System.out.println("Votre nombres de [" + start + " à " + result + "] ? ");
				System.out.println("Choix IA : " + nbr_IA);
				System.out.println("Nbr Essai : " + nbressais);
				System.out.println("Mystere : " + mystere);
				System.out.println("-------------------------------");
				result = nbr_IA - 1;
			}
			else if (nbr_IA < mystere) {
				start += result_ecart * 100;
				System.out.println("Votre nombres de [" + start + " à " + result + "] ? ");
				System.out.println("Choix IA : " + nbr_IA);
				System.out.println("Nbr Essai : " + nbressais);
				System.out.println("Mystere : " + mystere);
				System.out.println("-------------------------------");
				start = nbr_IA + 1;
			}
			else if(nbr_IA == mystere) {
				System.out.println("L'IA a trouvé le nombre mystere en " + nbressais + " essais !");
				break;
			}
			nbressais++;
			
		}
	}
}
