package cl.curso.java.prueba_dos.Eurbina;

public abstract class Alumno {
	
	private String nombre;
	private double primedio;
	
	public Alumno(){}

	public Alumno(String nombre, double primedio) {
		super();
		this.nombre = nombre;
		this.primedio = primedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrimedio() {
		return primedio;
	}

	public void setPrimedio(double primedio) {
		this.primedio = primedio;
	}
	
	public void imprimir(){
		System.out.println("nombre alumno:"+ this.nombre);
		System.out.println("su promedio es:" + this.primedio);
	}
	
	public abstract double calcularPromedio();

}
