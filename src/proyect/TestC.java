package proyect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestC {
	Sparrow jack = new Sparrow(500, 200, 300, new String[] {"botellaDeRon"});
	Humanoide unHumanoide = new Humanoide(20,70);
	@Test
	void testPoderMandoHumanoide() {
		assertEquals(20,unHumanoide.poderDeMando());
	}
	@Test
	void testJackTomaConHumanoide() {
		jack.tomarRonCon(unHumanoide);
		assertEquals(20, unHumanoide.energia);
	}
}
