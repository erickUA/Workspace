package ejemplosThread.ejemplos.reloj;

public class Programa {

	public static void main(String[] args) {
		
		Reloj r1 = new Reloj(0,0,0);
		r1.setEstaEncendido(true);
		
		Timer t1 = new Timer(r1);
		t1.start();
		
		ApagarReloj apagar = new ApagarReloj(r1, 10000);
		apagar.start();

	}

}
