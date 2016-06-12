/**
 * 
 */
package Ejercicio8;

/**
 * @author gonza
 *
 */
public class ReservaThread extends Thread {

	private Bus bus;
	private int numAsiento;

	/**
	 * @param bus
	 * @param numAsiento
	 */
	public ReservaThread(Bus bus, int numAsiento) {
		super();
		this.bus = bus;
		this.numAsiento = numAsiento;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public void run() {
		System.out.println("thread");
		bus.reservarAsiento(numAsiento);
	}
}
