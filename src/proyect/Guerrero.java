package proyect;

public class Guerrero extends Pirata{
	
	int poderDePelea;
	int vitalidad;
	
	Guerrero(int _pPelea, int _vitalidad, int _energia){
		super(_energia);
		poderDePelea = _pPelea;
		vitalidad = _vitalidad;
	}
	
	public int poderDeMando() {
		return poderDePelea * vitalidad;
	}
}