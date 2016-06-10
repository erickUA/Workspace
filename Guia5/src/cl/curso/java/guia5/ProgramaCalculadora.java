package cl.curso.java.guia5;

import javax.swing.JOptionPane;

public class ProgramaCalculadora {

	public static void main(String[] args) {

		String numero1 = JOptionPane.showInputDialog("ingrese numero 1:");
		int n1 = Integer.parseInt(numero1);
		String numero2 = JOptionPane.showInputDialog("ingrese numero 2:");
		int n2 = Integer.parseInt(numero2);
		Calculadora c1 = new Calculadora(n1 , n2);
		
	    c1.setNumero1(100);
	    c1.setNumero2(200);
		
		int suma = c1.sumar();
		System.out.println(suma);
		int resta = c1.restar();
		System.out.println(resta);
		int multiplica = c1.multiplicar();	
		System.out.println(multiplica);
		int dividi = c1.dividir();
		System.out.println(dividi);
		
        boolean opcionSalir = false;
        do{
        	String opcion =JOptionPane.showInputDialog("opcion 1: sumar")
        	switch (opcion) {
			case value:
				
				break;

			default:
				break;
			}
        	
        }
		
		


		
		
	}

}
