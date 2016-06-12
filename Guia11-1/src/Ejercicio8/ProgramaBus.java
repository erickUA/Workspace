

/**
 * 
 */
package Ejercicio8;

/**
 * @author gonza
 *
 */
public class ProgramaBus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Asiento[] asientosEnBus = new Asiento[20];
		Bus bus1 = new Bus("pullman", asientosEnBus);
		bus1.crearAsientos();
		
		ReservaThread thread1 = new ReservaThread(bus1, 1);
		thread1.start();
		bus1.mostrar();
		bus1.reservarAsiento(1);
		//bus1.reservarAsiento(2);
		//bus1.reservarAsiento(2);	
	}
}
