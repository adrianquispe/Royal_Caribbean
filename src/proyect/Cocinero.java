package proyect;

import java.util.ArrayList;
import java.util.Arrays;

class Cocinero extends Pirata{
	
	int moral;
	ArrayList<String> ingredientes;
	
	Cocinero(int _moral, String[] _ingredientes, int _energia){
		super(_energia);
		moral = _moral;
		ingredientes = new ArrayList<String>(Arrays.asList(_ingredientes));
	}
	
	public int poderDeMando() {
		return moral * ingredientes.size();
	}
	public String perderItem() {
		if (ingredientes.isEmpty()) {
			throw new IllegalStateException("El cocinero no tiene items");
		}
		else {
			String perdido = ingredientes.get(0);
			ingredientes.remove(0);
			return perdido;
			
		}
	}
	public void agregarItem(String item) {
		ingredientes.add(item);
	}
	
	@Override
	public void vencido() {
		moral = moral/2;
	}
}