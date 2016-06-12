/**
 * 
 */
package Ejercicio6;

/**
 * @author gonza
 *
 */
public class DepositarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private int depositaDinero;

	public DepositarDineroThread() {

	}

	/**
	 * @param cuentaBancaria
	 * @param depositaDinero
	 */
	public DepositarDineroThread(CuentaBancaria cuentaBancaria, int depositaDinero) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.depositaDinero = depositaDinero;
	}
	

	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	/**
	 * @return the depositaDinero
	 */
	public int getDepositaDinero() {
		return depositaDinero;
	}

	/**
	 * @param depositaDinero the depositaDinero to set
	 */
	public void setDepositaDinero(int depositaDinero) {
		this.depositaDinero = depositaDinero;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		cuentaBancaria.depositarDinero(depositaDinero);

	}

}
