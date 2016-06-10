package cl.curso.java.guia9.ejercicio5;


public class Programa {

	public static void main(String[] args) {
		
		String[] cancionesRoxette = new String[]{"Listen to your Heart", "Spending my time"};
		String[] cancionesLuis = new String[]{"Sol, arena y mar", "Tu solo tu", "Amarte es un placer"};
		
		Disco disc = new Disco("I'm roxette", "Roxette", "Pop", cancionesRoxette);
		Disco disc2 = new Disco("Amarte es un placer", "Luis Miguel", "Boleros", cancionesLuis);
		
		System.out.println(disc.toString());
		System.out.println(disc2.toString());
	}

}
