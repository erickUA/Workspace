package herencia.persona;



public class Profesor extends Persona {
	
	private String[] cursos;
	
	public Profesor(String[] cursos){
		super();
		this.cursos = cursos;
	}

	public Profesor(String rut,String nombre,String apellidoPaterno,String apellidoMaterno, String[] cursos) {
		super(rut, nombre,apellidoMaterno, apellidoPaterno);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	

}
