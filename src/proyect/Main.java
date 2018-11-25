package proyect;

public class Main {

	public static void main(String[] args) { 
		Sparrow jack = new Sparrow(500, 200, 300, new String[] {"botellaDeRon"});
		System.out.println(jack.ingredientes);
		Cocinero elChef = new Cocinero(50, new String[] {"sal","pimienta"}, 100);
		System.out.println(elChef.ingredientes);
		jack.robarIngredienteA(elChef); //si el chef no tiene items, tira una excepcion
		System.out.println(jack.ingredientes);
		System.out.println(elChef.ingredientes);
	}
}