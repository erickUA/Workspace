package cl.curso.java.control;

public class Articulo {
	private String nombre;
	private int costoBase;
	private int precioDetalle;
	private int precioMayor;
	
	public Articulo(){
	 this.nombre = "papas";	
     this.costoBase = 1000;
     this.precioDetalle  = 500;
	}

	public Articulo(String nombre, int costoBase, int precioDetalle,
			int precioMayor) {
		super();
		this.nombre = nombre;
		this.costoBase = costoBase;
		this.precioDetalle = precioDetalle;
		this.precioMayor = precioMayor;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}

	public int getPrecioMayor() {
		return precioMayor;
	}

	public void setPrecioMayor(int precioMayor) {
		this.precioMayor = precioMayor;
	}

	public int getPrecioDetalle() {
		return precioDetalle;
	}

	public void setPrecioDetalle(int precioDetalle) {
		this.precioDetalle = precioDetalle;
	}
	public int precioAlDetalle(){
		int precioAlDetalle = precioDetalle * 0.30;
		return precioAlDetalle;
	}
	public int precioAlMayor(){
		int precioAlMayor = precioMayor * 0.15;
	}

}
