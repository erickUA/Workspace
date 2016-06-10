package cl.curso.java.control_cuatro.eurbina.ejercicio1.ejercicio2;

public class Programa {

	public static void main(String[] args) throws Exception {
		Auto a1 = new Auto("toyota", "ll-1", 2016, 1);
		
		try {
			a1.venderAuto();
		} catch (Exception e) {
		    SinStockException s1 = new SinStockException(null);
		    a1.setStock(0);
			e.printStackTrace();
		}

	}

}
