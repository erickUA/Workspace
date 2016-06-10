package cl.curso.java.login;

public class Programa {
	
	public static void main(String[] args) {
		
		try {
			Conexion con = Conexion.getInstancia();
			Conexion con2 = Conexion.getInstancia();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
