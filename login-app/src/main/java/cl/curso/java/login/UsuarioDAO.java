package cl.curso.java.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class UsuarioDAO {
	
	public static boolean validar(Usuario usuario)throws SQLException {
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection().prepareStatement("select *from usuario where"+
	            "nombre_usuario =? AND"+
	             "password = ?;");
		
		st.setString(1, usuario.getUsuario() );
		st.setString(2, usuario.getPassword() );
		ResultSet rs = st.executeQuery();
		return rs.next();
	}

}
