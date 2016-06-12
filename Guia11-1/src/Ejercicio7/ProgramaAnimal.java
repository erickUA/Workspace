/**
 * 
 */
package Ejercicio7;

/**
 * @author Felipe Paillal
 *
 */
public class ProgramaAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        new Thread(new Animal("leopardo", 12, 5, 0)).start();
        new Thread(new Animal("leon", 10, 3, 0)).start();
        new Thread(new Animal("koala", 11, 4, 0)).start();
    }
}
