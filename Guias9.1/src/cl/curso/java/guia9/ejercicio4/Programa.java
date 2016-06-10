package cl.curso.java.guia9.ejercicio4;

public class Programa {

	public static void main(String[] args) {
		
		Equipo equipo = new Equipo("Los tilos unidos", 0, 0, 0, 0,0);
		
		equipo.imprimir();
		equipo.ganar();
		System.out.println("-----------------");
		equipo.imprimir();
		equipo.empatar();
		System.out.println("-----------------");
		equipo.imprimir();
		equipo.perder();
		System.out.println("-----------------");
		equipo.imprimir();
	}

}
