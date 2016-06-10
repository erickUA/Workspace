package ejemplosThread.ejemplos;

public class Programa {

	public static void main(String[] args) {
		
		AumentaThread a1 = new AumentaThread(3);
		Contador c1 = new Contador(3);
		
	
		c1.imprimir();
	}

}
