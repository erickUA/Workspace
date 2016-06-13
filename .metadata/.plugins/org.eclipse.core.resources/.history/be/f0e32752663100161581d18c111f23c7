

/**
 * 
 */
package Ejercicio8;

/**
 * @author gonza
 */
public class Bus {
	private String nombre;
	private Asiento[] asientos;

	/**
	 * @param nombre
	 * @param asientos
	 */
	public Bus(String nombre, Asiento[] asientos) {
		super();
		this.nombre = nombre;
		this.asientos = asientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asiento[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}

	public void reservarAsiento(int numAsiento) {

		if (asientos[numAsiento - 1].isDisponible()) {
			asientos[numAsiento - 1].setDisponible(false);
			System.out.println("El asiento Nro " + numAsiento + "Reservado exitosamente");
		} else {
			System.out.println("No se puede reservar el asiento Nro " + numAsiento + ", ya reservado");
		}
	}

	public void crearAsientos() {
		for (int i = 0; i < this.getAsientos().length; i++) {
			this.asientos[i] = new Asiento();
		}
	}

	public void mostrar() {
		for (int i = 0; i < this.getAsientos().length; i++) {
			if (this.getAsientos()[i].isDisponible()) {
				System.out.println("Asiento Nro: " + (i + 1) + " Disponible");
			} else {
				System.out.println("Asiento Nro: " + (i + 1) + " Reservado");
			}
		}
	}
}
