/**
 * 
 */
package cl.curso.java.prueba_dos.Eurbina;

/**
 * @author erick
 *
 */
public class ProgramaPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personas p1 = new Personas("erick", "11-1", 10, 60, 180);
		
		p1.imprimir();
		p1.calcularIMC();
		p1.mayorEdad();
	}

}
