/**
 * 
 */
package Ejercicio3;

/**
 * @author Felipe Paillal
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arreglo = { "manzana", "pera", "platano", };
		Arreglo array = new Arreglo(arreglo);
		try {
			array.mostrarArreglo(4);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Arreglo fuera de rango");
		}
	}
}
