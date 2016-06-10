package cl.curso.java.control_cuatro.eurbina.ejercicio1;

public class Libro {
    
	private String nombre;
	private String editorial;
	private int cantLibros;
	private int cantLibrosPrestados;
	
	public Libro(){}

	public Libro(String nombre, String editorial, int cantLibros,
			int cantLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantLibros = cantLibros;
		this.cantLibrosPrestados = cantLibrosPrestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantLibros() {
		return cantLibros;
	}

	public void setCantLibros(int cantLibros) {
		this.cantLibros = cantLibros;
	}

	public int getCantLibrosPrestados() {
		return cantLibrosPrestados;
	}

	public void setCantLibrosPrestados(int cantLibrosPrestados) {
		this.cantLibrosPrestados = cantLibrosPrestados;
	}
	
	public syn void devolverLibro(){
		if(this.cantLibrosPrestados == 0){
			System.out.println("usted a devuelto el libro: "+ this.nombre + this.editorial);
			
		}
		else{
			System.out.println("no se a devuelto el libro: " + this.nombre + this.editorial);
		}
	}
	
	public void reservarlibro(){
		if(this.cantLibros == 0){
			System.out.println("no se puede reservar libro: " + this.nombre + this.editorial);
		}
		else{
			System.out.println("libro reservado: " +  this.nombre + this.editorial );
		}
	}
	
	
}
