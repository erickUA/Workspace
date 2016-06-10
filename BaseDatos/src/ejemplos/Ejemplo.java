package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Ejemplo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso","alumno","java123");

	PreparedStatement pstatementInsert = (PreparedStatement) conexion.prepareStatement(
			"INSERT INTO alumnos (idalumno,nombre,apellido,apellidoMaterno)"+ "VALUES(?,?,?,?)");
	
	pstatementInsert.setInt(1,2);
	pstatementInsert.setString(2,"james");
	pstatementInsert.setString(3,"goslin");
	pstatementInsert.setString(4,"lion");
	int resultpInsert = pstatementInsert.executeUpdate();
	System.out.println(resultpInsert);
	
	String nombreUsuario =JOptionPane.showInputDialog("ingrese usuario");
	String password = JOptionPane.showInputDialog("ingrese pasword");
	PreparedStatement st = (PreparedStatement) conexion.prepareStatement("select *from usuario where"+
            "nombre_usuario =? AND"+
             "password = ?;");
    st.setString(1, nombreUsuario); 
    st.setString(2, password);
    ResultSet rs = st.executeQuery( );
    if( rs.next() ){
    JOptionPane.showMessageDialog(null, "acceso correcto");
}
    else{
    JOptionPane.showMessageDialog(null, "acceso denegado");
}

}
}