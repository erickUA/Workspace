package cl.curso.java.guia5;

public class Alumno {
	String nombre;
	int N1;
	int N2;
	int N3;
	
	public Alumno(){
		this.nombre = "Erick";
		this.N1 = 40;
		this.N2 = 40;
		this.N3 = 40;
	}

	public Alumno(String nombre, int n1, int n2, int n3) {
		super();
		this.nombre = nombre;
		N1 = n1;
		N2 = n2;
		N3 = n3;
	} 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getN1() {
		return N1;
	}

	public void setN1(int n1) {
		N1 = n1;
	}

	public int getN2() {
		return N2;
	}

	public void setN2(int n2) {
		N2 = n2;
	}

	public int getN3() {
		return N3;
	}

	public void setN3(int n3) {
		N3 = n3;
	}

	public void imprimi(){
		System.out.println(this.nombre);
		System.out.println(this.N1+N2+N3/3);
		
		
	}

	

}
