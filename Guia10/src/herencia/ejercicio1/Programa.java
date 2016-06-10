package herencia.ejercicio1;


public class Programa {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		Triangulo t1  =new Triangulo(2, 2);
		Cuadrado cu1 = new Cuadrado(2);
		
		System.out.println(c1.calcularArea());
		System.out.println(t1.calcularArea());
		System.out.println(cu1.calcularArea());
		
		

	}

}
