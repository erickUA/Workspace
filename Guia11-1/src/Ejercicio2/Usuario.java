package Ejercicio2;

/**
 * @author gonza
 *
 */
public class Usuario {

	private String nombreUsuario;
	private String contraseña;
	private int intentosFallidos;

	public Usuario() {

		this.nombreUsuario = "felipe";
		this.contraseña = "";
		this.intentosFallidos = 0;
	}

	/**
	 * @param nombreUsuario
	 * @param contraseña
	 * @param intentosFallidos
	 */
	public Usuario(String nombreUsuario, String contraseña, int intentosFallidos) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.intentosFallidos = intentosFallidos;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	public void login(String usuario, String contraseña) throws CuantaBloqueadaException, AutenticacionException {

		if (this.getIntentosFallidos() >= 3) {
			throw new CuantaBloqueadaException("cuanta bloqueada");
		}

		if ((this.getNombreUsuario().equals(usuario)) && (this.getContraseña().equals(contraseña))) {
			System.out.println("usuario y contraseña correcta");
		} else {
			this.setIntentosFallidos(this.getIntentosFallidos() + 1);
			throw new AutenticacionException("usuario o contraseña incorrectos");

		}

	}

}
