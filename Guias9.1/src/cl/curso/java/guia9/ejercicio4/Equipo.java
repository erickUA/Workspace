package cl.curso.java.guia9.ejercicio4;

public class Equipo {

	private String nombre;
	private int cantidadPartidosGanados;
	private int cantidadPartidosPerdidos;
	private int cantidadPartidosEmpatados;
	private int partidosJugados;
	private int puntosTotales;
	
	/**
	 * 
	 */
	public Equipo() {
	}
	/**
	 * @param nombre
	 * @param cantidadPartidosGanados
	 * @param cantidadPartidosPerdidos
	 * @param cantidadPartidosEmpatados
	 * @param partidosJugados
	 * @param puntosTotales
	 */
	public Equipo(String nombre, int cantidadPartidosGanados, int cantidadPartidosPerdidos,
			int cantidadPartidosEmpatados, int partidosJugados, int puntosTotales) {
		this.nombre = nombre;
		this.cantidadPartidosGanados = cantidadPartidosGanados;
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
		this.partidosJugados = partidosJugados;
		this.puntosTotales = puntosTotales;
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
	 * @return the cantidadPartidosGanados
	 */
	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}
	/**
	 * @param cantidadPartidosGanados the cantidadPartidosGanados to set
	 */
	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}
	/**
	 * @return the cantidadPartidosPerdidos
	 */
	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}
	/**
	 * @param cantidadPartidosPerdidos the cantidadPartidosPerdidos to set
	 */
	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}
	/**
	 * @return the cantidadPartidosEmpatados
	 */
	public int getCantidadPartidosEmpatados() {
		return cantidadPartidosEmpatados;
	}
	/**
	 * @param cantidadPartidosEmpatados the cantidadPartidosEmpatados to set
	 */
	public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
	}
	/**
	 * @return the partidosJugados
	 */
	public int getPartidosJugados() {
		return partidosJugados;
	}
	/**
	 * @param partidosJugados the partidosJugados to set
	 */
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}
	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	public void ganar()
	{
		this.setCantidadPartidosGanados(this.getCantidadPartidosGanados()+1);
		this.setPartidosJugados(this.getPartidosJugados()+1);
		this.setPuntosTotales(this.getPuntosTotales()+3);
		
	}
	
	public void perder()
	{
		this.setCantidadPartidosPerdidos(this.getCantidadPartidosPerdidos()+1);
		this.setPartidosJugados(this.getPartidosJugados()+1);
		
	}
	
	public void empatar()
	{
		this.setCantidadPartidosEmpatados(this.getCantidadPartidosEmpatados()+1);
		this.setPartidosJugados(this.getPartidosJugados()+1);
		this.setPuntosTotales(this.getPuntosTotales()+1);
				
	}
	
	public void imprimir()
	{
		System.out.println("Vendedor");
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Partidos jugados: "+this.getPartidosJugados());
		System.out.println("Partidos ganados: "+this.getCantidadPartidosGanados());
		System.out.println("Partidos empatados: "+this.getCantidadPartidosEmpatados());
		System.out.println("Partidos perdidos: "+this.getCantidadPartidosPerdidos());
		System.out.println("Cantidad de puntos: "+this.getPuntosTotales());
	}
}
