package Ejercicio2;

/**
 * @author gonza
 *
 */
public class Usuario {

	private String nombreUsuario;
	private String contrase�a;
	private int intentosFallidos;

	public Usuario() {

		this.nombreUsuario = "felipe";
		this.contrase�a = "";
		this.intentosFallidos = 0;
	}

	/**
	 * @param nombreUsuario
	 * @param contrase�a
	 * @param intentosFallidos
	 */
	public Usuario(String nombreUsuario, String contrase�a, int intentosFallidos) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.intentosFallidos = intentosFallidos;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public void login(String usuario, String contrase�a) throws CuantaBloqueadaException, AutenticacionException {

		if (this.getIntentosFallidos() >= 3) {
			throw new CuantaBloqueadaException("cuanta bloqueada");
		}

		if ((this.getNombreUsuario().equals(usuario)) && (this.getContrase�a().equals(contrase�a))) {
			System.out.println("usuario y contrase�a correcta");
		} else {
			this.setIntentosFallidos(this.getIntentosFallidos() + 1);
			throw new AutenticacionException("usuario o contrase�a incorrectos");

		}

	}

}
