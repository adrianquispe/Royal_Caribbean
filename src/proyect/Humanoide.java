package proyect;

public class Humanoide extends Pirata{
	int poderDePelea;
	
	Humanoide(int _poderDePelea, int _energia){
		super(_energia);
		poderDePelea = _poderDePelea;
	}
	
	public int poderDeMando() {
		return poderDePelea;
	}
	
	@Override
	public void vencido() {
		poderDePelea = poderDePelea /2;
	}
}
