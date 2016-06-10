package cl.curso.java.control_cuatro.eurbina.ejercicio1;

import javax.xml.stream.events.StartElement;


public class Programa {

	public static void main(String[] args){
		
		Libro l1 = new Libro("las aventuras de juanito perez", "xxx", 1, 0);
		
		DevolverLibroThread d1 = new DevolverLibroThread(l1);
		DevolverLibroThread d2 = new DevolverLibroThread(l1);
		DevolverLibroThread d3 = new DevolverLibroThread(l1);
		
		
		ReservaLibroThread r1 = new ReservaLibroThread(l1);
		ReservaLibroThread r2 = new ReservaLibroThread(l1);
		ReservaLibroThread r3 = new ReservaLibroThread(l1);
		
		d1.start();
		d2.start();
		d3.start();
		
		r1.start();
		r2.start();
		r3.start();

	}

}
