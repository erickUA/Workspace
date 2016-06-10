package herencia.persona;


public class Alumno extends Persona {
	
  private int[] notas;
  

  public Alumno(){
		super();
	}
public Alumno(String nombre, String rut, String apellidoPaterno,
		String apellidoMaterno, int[] notas) {
	super(nombre, rut, apellidoPaterno, apellidoMaterno);
	this.notas = notas;
	// TODO Auto-generated constructor stub
}
public void irAClases(){
	System.out.println("ir a clases");
}

public int[] getNotas() {
	return notas;
}

public void setNotas(int[] notas) {
	this.notas = notas;
}


  

}
