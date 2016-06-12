/**
 * 
 */
package Ejercicio5;

import javax.swing.JOptionPane;

/**
 * @author Felipe Paillal
 *
 */
public class ProgramaNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero numero1 = new Numero(12345);
		boolean b = true;
		while (b) {
			try {
				if (numero1.validarNumSolicitado(Integer.parseInt(JOptionPane.showInputDialog("ingrese numero")))) {
					JOptionPane.showMessageDialog(null, "Numero ingresado correcto");
					b = false;
				}
			} catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null,"debe ingresar un numero");
			}
		}
	}

}
