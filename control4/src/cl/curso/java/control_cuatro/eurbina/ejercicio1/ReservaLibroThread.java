package cl.curso.java.control_cuatro.eurbina.ejercicio1;

public class ReservaLibroThread extends Thread {

	private Libro libro;

	public ReservaLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	
	@Override
	public void run() {
		libro.reservarlibro();
		super.run();
	}
}
