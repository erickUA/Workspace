package cl.curso.java.guia5;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Ejercicio1 ejercicio = new Ejercicio1();
		int promedio = ejercicio.promedio(10, 30, 70);
		   System.out.println(promedio);

	}
	
	public int promedio(int N1,int N2,int N3){
		int p = (N1+N2+N3)/3;
		return p;
		
	}

}
