/**
 * 
 */
package Ejercicio5;

/**
 * @author gonza
 *
 */
public class Numero {

	public int solicitarNumero;

	/**
	 * @param solicitarNumero
	 */
	public Numero(int solicitarNumero) {
		super();
		this.solicitarNumero = solicitarNumero;
	}

	public int getSolicitarNumero() {
		return solicitarNumero;
	}

	public void setSolicitarNumero(int solicitarNumero) {
		this.solicitarNumero = solicitarNumero;
	}

	public boolean validarNumSolicitado(int numero) throws NumberFormatException {
		if (this.getSolicitarNumero() == numero) {
			return true;
		} else {
			throw new NumberFormatException("Numero incorrecto");
		}
	}

}
