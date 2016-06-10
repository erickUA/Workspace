package cl.curso.java.guia9.ejercicio1;

public class Persona {

	private String nombre;
	private String apellido;
	private int telefono;
	
	
	
	/**
	 * 
	 */
	public Persona() {
		this.nombre = " ";
		this.apellido = " ";
		this.telefono = 0;
	}
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		if(telefono>99999999 && telefono<1000000000)
		{
			this.telefono = telefono;
		}
		else
		{
			this.telefono = 0;
			System.out.println("Telefono mal ingresado.");
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public void Imprimir()
	{
		System.out.println("Persona");
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellido: "+this.getApellido());
		System.out.println("Telefono: "+this.getTelefono());
	}
	
	
	
}
