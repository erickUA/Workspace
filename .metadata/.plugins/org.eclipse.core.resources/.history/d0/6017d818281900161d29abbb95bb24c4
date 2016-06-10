package cl.curso.java.banco;

import cl.curso.java.tarjetaBip.Pagable;

public abstract class CuentaBancaria implements Pagable{

	private int saldo;
	private int numeroCuenta;
	
	
	public CuentaBancaria()
	{
		
	}
	
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * 
	 * @param monto dinero totalo a girar
	 */
	public abstract void girar(int monto);
		
	/**
	 * 
	 * @param monto dinero que se abonara al saldo
	 */
	public void depositar(int monto)
	{
		System.out.println("se depositara: $"+monto);
		 this.setSaldo(this.getSaldo()+monto);
	}
	
	/**
	 * Metodo que permite imprimir los atributos de 
	 * la clase.
	 */
	public void imprimir()
	{
		System.out.println("Datos de la cuenta");
		System.out.println("N° de cuenta: "+this.getNumeroCuenta());
		System.out.println("Saldo: $"+this.getSaldo());
	}
}
