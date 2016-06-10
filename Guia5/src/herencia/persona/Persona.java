


package herencia.persona;

public class Persona {
	
	private String nombre;
	private String rut;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public Persona(){}
	
	
	public Persona(String nombre, String rut, String apellidoPaterno,
			String apellidoMaterno) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}


	public void irAclases(){
		System.out.println("ir a clases");
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
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
	
	

}
