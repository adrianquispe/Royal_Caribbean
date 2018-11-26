package proyect;

import java.util.ArrayList;
import java.util.Arrays;

public class Sparrow extends Pirata{
	int poderDePelea;
	int inteligencia;
	ArrayList<String> ingredientes;
	
	Sparrow(int _energia, int _podPelea, int _intelig, String[] _ingred){
		super(_energia);
		poderDePelea = _podPelea;
		inteligencia = _intelig;
		ingredientes = new ArrayList<String>(Arrays.asList(_ingred));
	}
	public int poderDeMando() {
		return energia * poderDePelea * inteligencia;
	}
	public void tomarRonCon(Pirata unPirata) {
		this.aumentarEnergiaEn(100);
		unPirata.tomarRonCon(this);
		this.robarIngredienteA(unPirata);
	}
	public void robarIngredienteA(Pirata unPirata) {
		String itemRobado = unPirata.perderItem();
		this.agregarItem(itemRobado);
	}
	public void agregarItem(String item) {
		ingredientes.add(item);
	}
}