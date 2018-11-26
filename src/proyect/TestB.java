package proyect;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestB {
	Guerrero unGuerrero = new Guerrero(20,10,20);
	Guerrero otroGuerrero = new Guerrero(20,11,20);
	Cocinero unCocinero = new Cocinero(20,new String[] {"sal","azucar","oregano"},20);
	Cocinero otroCocinero = new Cocinero(10,new String[] {"sal"},10);
	Navegador unNavegador = new Navegador(10,20);
	Sparrow jack = new Sparrow(500, 200, 300, new String[] {"botellaDeRon"});
	ArmadaDelHolandes holandes = new ArmadaDelHolandes();
	ArmadaInglesa ingleses = new ArmadaInglesa();
	UnionPirata piratas = new UnionPirata();
	Barco perlaNegra = new Barco(100,100,10,new Pirata[] {unGuerrero,unCocinero,unNavegador});
	Barco unBarco = new Barco(100,20,20,new Pirata[] {otroGuerrero,otroCocinero});
	
	@Test
	public void testFuerzaDelBarco() {
		assertEquals(360,perlaNegra.fuerzaBarco());
	}
	
	@Test
	public void testQuienEsCapitan() {
		assertEquals(unGuerrero, perlaNegra.capitanDelBarco());
	}
	

	
	@Test
	public void testReclutarTripulacion() {
		perlaNegra.enfrentarseA(unBarco);
		System.out.println(perlaNegra.tripulantes);
		assertEquals(4,perlaNegra.tripulantes.size());
	}
	
	@Test
	public void testTripulacionHerida() {
		perlaNegra.enfrentarseA(unBarco);
		assertEquals(5,otroCocinero.moral);
	}

	@Test
	public void testBarcoDesolado() {
		perlaNegra.enfrentarseA(unBarco);
		assertEquals(0,unBarco.resistencia);
	}
	
	@Test public void testSinTripulacion() {
		perlaNegra.enfrentarseA(unBarco);
		assertEquals(0, unBarco.tripulantes.size());
	}
	
	@Test public void testRecibirDisparoYEliminarTripulante() {
		unBarco.recibirCañonazo(1);
		assertEquals(1, unBarco.tripulantes.size());
	}
	
	@Test 
	public void testBarcoRecibeCañonazo() {
		unBarco.recibirCañonazo(2);
		assertEquals(0,unBarco.resistencia);
	}
	
	@Test
	public void testBarcoRestaMunicion() {
		perlaNegra.dispararA(unBarco, 2);
		assertEquals(8,perlaNegra.municiones);
	}
	
	@Test
	public void testAplicarBonusArmadaInglesa() {
		ingleses.aplicarBonus(perlaNegra);
		assertEquals(13,perlaNegra.municiones);
	}
	
	@Test
	public void testAplicarBonusUnionPirata() {
		piratas.aplicarBonus(perlaNegra);
		assertEquals(160, perlaNegra.poderDeFuego);
	}
	
	@Test
	public void testAplicarBonusHolandes() {
		holandes.aplicarBonus(perlaNegra);
		assertEquals(6, perlaNegra.tripulantes.size());
	}
	
}
