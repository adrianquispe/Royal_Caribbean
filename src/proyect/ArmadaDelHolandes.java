package proyect;

public class ArmadaDelHolandes extends Bando{
	@Override
	public void aplicarBonus(Barco unBarco) {
		unBarco.duplicarTripulacion();
	}
}
