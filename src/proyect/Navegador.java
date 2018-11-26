package proyect;

public class Navegador extends Pirata{
	
	int inteligencia;
	
	Navegador(int _inteligencia, int _energia){
		super(_energia);
		inteligencia = _inteligencia;
	}
	
	public int poderDeMando() {
		return inteligencia * inteligencia;
	}
	
	@Override
	public void vencido() {
		inteligencia = inteligencia /2;
	}
}
