package cl.curso.java.guia9.ejercicios3;

public class Vendedor {

	private String nombre;
	private int semanasTrabajadas;
	private int cantidadArticulosVendidos;
	private double valorArticulosVendidos;
	
	
	/**
	 * 
	 */
	public Vendedor() {
	
	}
	/**
	 * @param nombre
	 * @param semanasTrabajadas
	 * @param cantidadArticulosVendidos
	 * @param valorArticulosVendidos
	 */
	public Vendedor(String nombre, int semanasTrabajadas, int cantidadArticulosVendidos,
			double valorArticulosVendidos) {
		
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.cantidadArticulosVendidos = cantidadArticulosVendidos;
		this.valorArticulosVendidos = valorArticulosVendidos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the semanasTrabajadas
	 */
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}
	/**
	 * @param semanasTrabajadas the semanasTrabajadas to set
	 */
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}
	/**
	 * @return the cantidadArticulosVendidos
	 */
	public int getCantidadArticulosVendidos() {
		return cantidadArticulosVendidos;
	}
	/**
	 * @param cantidadArticulosVendidos the cantidadArticulosVendidos to set
	 */
	public void setCantidadArticulosVendidos(int cantidadArticulosVendidos) {
		this.cantidadArticulosVendidos = cantidadArticulosVendidos;
	}
	/**
	 * @return the valorArticulosVendidos
	 */
	public double getValorArticulosVendidos() {
		return valorArticulosVendidos;
	}
	/**
	 * @param valorArticulosVendidos the valorArticulosVendidos to set
	 */
	public void setValorArticulosVendidos(double valorArticulosVendidos) {
		this.valorArticulosVendidos = valorArticulosVendidos;
	}
	
	public int calcularComision(int comision)
	{
		comision = (int) ((this.getSemanasTrabajadas()* 200) + (this.getValorArticulosVendidos()*9)/100);
		
		return comision;
	}
	
	public void imprimir()
	{
		System.out.println("Vendedor");
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Semanas trabajadas: "+this.getSemanasTrabajadas());
		System.out.println("Cantidad Articulos vendidos: "+this.getCantidadArticulosVendidos());
		System.out.println("Precio total articulos vendidos: "+this.getValorArticulosVendidos());
	}
	
}
