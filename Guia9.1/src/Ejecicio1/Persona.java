package Ejecicio1;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Persona(){
		this.nombre = "erick";
		this.apellido = "urbina";
		this.telefono = "958586132";
	}

	public Persona(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean validarTelefono(){
		return (this.telefono.length() == 9);
	}
		
	public void imprimir(){
		System.out.println("su nombre es: \n" +this.nombre+" "+
				            "su apellido es: \n" +this.apellido+ " "+
				             "su numero de telefono es: \n" +this.telefono);
	}
	

}
