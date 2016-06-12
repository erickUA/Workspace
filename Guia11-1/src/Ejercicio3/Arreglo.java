/**
 * 
 */
package Ejercicio3;

/**
 * @author Felipe Paillal
 *
 */
public class Arreglo {
	
	private String[] arreglo;

	public Arreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}

	public String[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}

	public void mostrarArreglo(int i) {
		System.out.println("Dato pedido en la posicion es \"" + this.arreglo[i - 1] + "\"");
	}

}
