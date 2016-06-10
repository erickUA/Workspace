package clase8;

public class Nota {
	private String nombre;
	private double porcentaje;
	private double nota;
	
	public Nota(){}
	

	public Nota(String nombre, double porcentaje, double nota) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.nota = nota;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
