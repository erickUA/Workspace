/**
 * 
 */
package Ejercicio6;

/**
 * @author gonza
 *
 */
public class ProgramaCuentaBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CuentaBancaria cntBancaria = new CuentaBancaria(50000, "123456789");
		
		RetirarDineroThread thread1 = new RetirarDineroThread(cntBancaria, 10000);
		thread1.start();
		
		

	}
	

}
