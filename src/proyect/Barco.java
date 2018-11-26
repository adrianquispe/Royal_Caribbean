package proyect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Barco {
	int resistencia;
	int poderDeFuego;
	int municiones;
	int fuerza;
	ArrayList<Pirata> tripulantes;
	
	Barco(int _resistencia, int _poderDeFuego, int _municiones, Pirata[] _tripulantes){
		resistencia = _resistencia;
		poderDeFuego = _poderDeFuego;
		municiones = _municiones;
		tripulantes = new ArrayList<Pirata>(Arrays.asList(_tripulantes));
	}
	
	public Pirata capitanDelBarco() {
		Pirata capitan = tripulantes.stream().max(Comparator.comparing(lista -> lista.poderDeMando())).get();
		return capitan;
	}
	
	public int fuerzaBarco() {
		fuerza = tripulantes.stream()
				.mapToInt(lista -> lista.poderDeMando())
				.sum();
		return fuerza;
	}
	
	public void enfrentarseA(Barco unBarco) {
		if(this.fuerzaBarco()>unBarco.fuerzaBarco()) {
			this.victoriaFrentaA(unBarco);
			unBarco.vencido();
		}else {
			unBarco.victoriaFrentaA(this);
			this.vencido();
		}
	}
	
	public void victoriaFrentaA(Barco unBarco) {
		unBarco.tripulacionHerida();
		unBarco.tripulantes.stream().filter(o -> o.poderDeMando()>100).forEach(f -> tripulantes.add(f));
	}
	
	
	public void tripulacionHerida() {
		tripulantes.stream().forEach(lista -> lista.vencido());
	}
	
	public void vencido() {
		desolarBarco();
		tripulantes.clear();
	}
	
	public void desolarBarco() {
		resistencia = 0;
		poderDeFuego= 0;
		municiones = 0;
	}
	
	public void dispararA(Barco unBarco, int cantidadDisparos) {
		if(municiones < cantidadDisparos) {
			throw new IllegalStateException("No hay municion disponible");
		}else {
			unBarco.recibirCañonazo(cantidadDisparos);
			municiones -= cantidadDisparos;
		}
	}
	
	
	public void recibirCañonazo(int cantidad) {
		resistencia -= 50*cantidad;
		tripulantes.removeIf(listaNueva -> listaNueva.energia < 20);
	}
	
	public void aumentarMunicion(int cantidad) {
		municiones += cantidad;
	}
	
	public void aumentarPoderDeFuego(int cantidad) {
		poderDeFuego += 60;
	}
	
	public void duplicarTripulacion() {
		tripulantes.addAll(tripulantes);
	}
}
