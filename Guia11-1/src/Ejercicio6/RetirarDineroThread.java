/**
 * 
 */
package Ejercicio6;

/**
 * @author gonza
 *
 */
public class RetirarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private int retiraDinero;

	public RetirarDineroThread() {
	}

	/**
	 * @param cuentaBancaria
	 * @param retiraDinero
	 */
	public RetirarDineroThread(CuentaBancaria cuentaBancaria, int retiraDinero) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.retiraDinero = retiraDinero;
	}

	/**
	 * @return the cuentaBancaria1
	 */
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	/**
	 * @param cuentaBancaria1
	 *            the cuentaBancaria1 to set
	 */
	public void setCuentaBancaria1(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	/**
	 * @return the retiraDinero
	 */
	public int getRetiraDinero() {
		return retiraDinero;
	}

	public void setRetiraDinero(int retiraDinero) {
		this.retiraDinero = retiraDinero;
		System.out.println();
	}

	@Override
	public void run() {
		cuentaBancaria.retirarDinero(retiraDinero);
	}

}
