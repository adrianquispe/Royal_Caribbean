package proyect;

public class UnionPirata extends Bando{
	@Override
	public void aplicarBonus(Barco unBarco) {
		unBarco.aumentarPoderDeFuego(60);
	}
}
