package cl.curso.java.control;

public class Biblioteca {
	private String nombre;
	private String autor;
	private int numeroEjemplares;
    private int numeroEjemplaresEmprestados;
    boolean emprestar = false;
    
    
    public Biblioteca(){
    	this.autor = "pedrito";
    	this.nombre = "kkk";
    	this.numeroEjemplares = 2;
    	this.numeroEjemplaresEmprestados = 1;
    }
    

	public Biblioteca(String nombre, String autor, int numeroEjemplares,
			int numeroEjemplaresEmprestados) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
		this.numeroEjemplaresEmprestados = numeroEjemplaresEmprestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	public int getNumeroEjemplaresEmprestados() {
		return numeroEjemplaresEmprestados;
	}

	public void setNumeroEjemplaresEmprestados(int numeroEjemplaresEmprestados) {
		this.numeroEjemplaresEmprestados = numeroEjemplaresEmprestados;
	}
    
	public int prestarLibro(){
		if(!emprestar){
			System.out.println("ingrese el nombre de libro");
		}
		else{
			System.out.println("el libro ya se empresto");
		}
		int prestarLibro = numeroEjemplares -1;
		return prestarLibro;

	}
	public int devolverLibro(){
		if(emprestar){
			System.out.println("nombre del libro que va adevolver");
		}
		int devolverLibro = numeroEjemplares +1;
		return devolverLibro;
		
	}
	public void imprimir(){
		System.out.println(this.autor);
		System.out.println(this.nombre);
		System.out.println(this.numeroEjemplares);
		System.out.println(this.numeroEjemplaresEmprestados);
		
	}
}