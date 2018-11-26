package proyect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestA {

	Guerrero unGuerrero = new Guerrero(20,10,20);
	Cocinero unCocinero = new Cocinero(20,new String[] {"sal","azucar","oregano"},20);
	Navegador unNavegador = new Navegador(10,20);
	Sparrow jack = new Sparrow(500, 200, 300, new String[] {"botellaDeRon"});
	@Test
	public void testPoderMandoGuerrero() {
		assertEquals(200, unGuerrero.poderDeMando());
	}
	@Test
	public void testPoderMandoCocinero() {
		assertEquals(60, unCocinero.poderDeMando());
	}
	@Test
	public void testPoderMandoNavegador() {
		assertEquals(100, unNavegador.poderDeMando());
	}
	@Test
	public void testPoderMandoJack() {
		assertEquals(30000000, jack.poderDeMando());
	}
	@Test
	public void testJackTomaConCocinero() {
		jack.tomarRonCon(unCocinero);
		assertEquals(2, jack.ingredientes.size());
	}
	@Test
	public void tomarConOtroPirata() {
		jack.tomarRonCon(unGuerrero);
		assertEquals(0,unGuerrero.energia);
	}
}
