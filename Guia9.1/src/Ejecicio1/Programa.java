package Ejecicio1;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		System.out.println(p1.validarTelefono());
		p1.imprimir();
		
		Persona p2 = new Persona("PEDRITO", "PEREZ", "1234567");
		System.out.println(p2.validarTelefono());
		p2.imprimir();

	}

}
