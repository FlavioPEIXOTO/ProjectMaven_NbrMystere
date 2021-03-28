package mode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solo_ModeTest {

	@Test
	public void TestVerifNumberChoice() {
		//Arange
		Solo_Mode s = new Solo_Mode();
		s.nbrjoueur_inString = "0029";
		
		//Act
		s.VerifNumberChoice();
		int res = s.nbrjoueur_inString.length();
		
		//Assert
		assertEquals(4, res);
	}
}
