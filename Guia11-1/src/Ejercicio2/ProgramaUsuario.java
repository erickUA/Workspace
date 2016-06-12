package Ejercicio2;

import javax.swing.JOptionPane;

/**
 * @author gonza
 *
 */
public class ProgramaUsuario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("felipe", "1234", 2);
		try {
			usuario1.login("felipe", "1334");
		} catch (CuantaBloqueadaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} catch (AutenticacionException e) {
			System.out.println( e.getMessage());
			// indica la ecepcion el mesage y recorrido
			e.printStackTrace();
			{

			}
		}

	}

}
