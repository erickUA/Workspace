package cl.curso.java.guia9.ejercicios3;

public class Programa {

	public static void main(String[] args) {

		Vendedor vende = new Vendedor("Kevin Zambrano", 2, 5, 5000);
		int comision = 0;
		vende.imprimir();
		System.out.println(vende.calcularComision(comision));
	}

}
