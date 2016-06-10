package cl.curso.java.guia9;

public class Vehiculo {

	private int codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilomeraje;
	private double precioVenta;
	private int cantidadAutosVender;
	
	
	
	/**
	 * 
	 */
	public Vehiculo() {
	}
	
	/**
	 * @param codigo
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param patente
	 * @param kilomeraje
	 * @param precioVenta
	 * @param cantidadAutosVender
	 */
	public Vehiculo(int codigo, String marca, String tipo, int modelo, String patente, int kilomeraje,
			double precioVenta, int cantidadAutosVender) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilomeraje = kilomeraje;
		this.precioVenta = precioVenta;
		this.cantidadAutosVender = cantidadAutosVender;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}
	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	/**
	 * @return the kilomeraje
	 */
	public int getKilomeraje() {
		return kilomeraje;
	}
	/**
	 * @param kilomeraje the kilomeraje to set
	 */
	public void setKilomeraje(int kilomeraje) {
		this.kilomeraje = kilomeraje;
	}
	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * @return the cantidadAutosVender
	 */
	public int getCantidadAutosVender() {
		return cantidadAutosVender;
	}
	/**
	 * @param cantidadAutosVender the cantidadAutosVender to set
	 */
	public void setCantidadAutosVender(int cantidadAutosVender) {
		this.cantidadAutosVender = cantidadAutosVender;
	}
	
	
}
