package cl.curso.java.prueba_dos.Eurbina.ejercicio3;

public class Tren {
	
	private int numero;
	private String linea;
	
	public Tren(){}
	

	public Tren(int numero, String linea) {
		super();
		this.numero = numero;
		this.linea = linea;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	public boolean seDetiene(){
		return true;
	}
	
	public void imprimir(){
		
	}
	
}
