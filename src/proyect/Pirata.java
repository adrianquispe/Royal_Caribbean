package proyect;

class Pirata {

	int energia;
	
	Pirata(int _energia) {
		energia = _energia;
	};
	
	public void bajarEnergiaEn(int value) {
		energia = Math.max(0, energia - value);
	}
	public void aumentarEnergiaEn(int value) {
		energia += value;
	}
	public String perderItem() {
		throw new IllegalStateException("No es un cocinero");
	}
}




