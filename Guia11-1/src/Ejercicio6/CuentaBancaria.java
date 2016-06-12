/**
 * 
 */
package Ejercicio6;

/**
 * @author gonza
 *
 */
public class CuentaBancaria {

	private int saldo;
	private String numCuenta;

	public CuentaBancaria() {
	}

	/**
	 * @param saldo
	 * @param numCuenta
	 */
	public CuentaBancaria(int saldo, String numCuenta) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public void depositarDinero(int deposito) {
		this.setSaldo(this.getSaldo()+deposito);
		System.out.println("monto depositado "+deposito);
		
		
	}

	public void retirarDinero(int retirar) {
		
		this.setSaldo((this.getSaldo() - retirar)); 
		System.out.println("monto retirado " + retirar);
	}

}
