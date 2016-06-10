package cl.curso.java.control_cuatro.eurbina.ejercicio1;

public class DevolverLibroThread extends Thread {
	
	private Libro libro;

	public DevolverLibroThread(Libro libro) {
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
		libro.devolverLibro();
		super.run();
	}
	
	

}
