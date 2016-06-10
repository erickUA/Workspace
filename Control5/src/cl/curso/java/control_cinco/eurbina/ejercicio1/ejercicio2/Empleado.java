/**
 * 
 */
package cl.curso.java.control_cinco.eurbina.ejercicio1.ejercicio2;

import java.util.Comparator;


/**
 * @author erick
 * @param <Departamento>
 *
 */
public class Empleado extends Personas {
    
   private String departamento;
   private int salario;



/**
 * @param rut
 * @param nombre
 * @param apellido
 * @param edad
 * @param departamento
 * @param salario
 */
public Empleado(String rut, String nombre, String apellido, int edad,
		String departamento, int salario) {
	super(rut, nombre, apellido, edad);
	this.departamento = departamento;
	this.salario = salario;
}



/**
 * @return the departamento
 */
public String getDepartamento() {
	return departamento;
}



/**
 * @param departamento the departamento to set
 */
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}



/**
 * @return the salario
 */
public int getSalario() {
	return salario;
}



/**
 * @param salario the salario to set
 */
public void setSalario(int salario) {
	this.salario = salario;
}



@Override
	public boolean equals(Object obj) {
		  if(obj instanceof Empleado){
			 return this.getDepartamento() == ((Empleado) obj).getDepartamento();
					  
		  }
			return false;
		}
  
@Override
public String toString() {
	return "Empleado [departamento=" + departamento +", salario=" + salario + "]";
}



 

}

	
