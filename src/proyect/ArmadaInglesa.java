package proyect;

public class ArmadaInglesa extends Bando{
	@Override
	public void aplicarBonus(Barco unBarco) {
		unBarco.aumentarMunicion((int) (unBarco.municiones*0.3));
	}
}
