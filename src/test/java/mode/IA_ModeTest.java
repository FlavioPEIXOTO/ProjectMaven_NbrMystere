package mode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IA_ModeTest {
	
	@Test
	public void TestVerif() {
		//Arange
		IA_Mode i = new IA_Mode();
		i.nbr_IA = 50; i.mystere = 5000;
		
		//Act
		i.verif();
		int res = i.result_ecart;
		
		//Assert
		assertEquals(12, res);
	}
	
	
	//Test fonctionnel / scanner inutilisable en Test
	/*@Test
	public void mode2() {
		//Arange
		IA_Mode i = new IA_Mode();
		i.mystere = 5000; i.essais = 200;
		
		//Act
		i.mode2();
		int res = i.nbr_IA;
		
		//Assert
		assertEquals(5000, res);
	}*/
}
