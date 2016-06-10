package cl.curso.java.guia5;

public class Persona {
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	
	public Persona(){
		this.nombre = "erick";
		this.apellidoMaterno= "aguilera";
		this.apellidoPaterno = "urbina";
		this.edad = 20;
		
	}

	public Persona(String nombrex, String apellidoPaternox,
			String apellidoMaternox, int edadx) {

		this.nombre = nombrex;
		this.apellidoPaterno = apellidoPaternox;
		this.apellidoMaterno = apellidoMaternox;
		this.edad = edadx;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void imprimir(){
		System.out.println(this.nombre);
		System.out.println(this.apellidoMaterno);
		System.out.println(this.apellidoPaterno);
		System.out.println(this.edad);
		
	}
	
	

}
