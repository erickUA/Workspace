package cl.curso.java.control_cinco.eurbina.ejercicio1.ejercicio2;

import java.util.Collections;
import java.util.List;

public class Empresa{
	
	private String nombre;
    private List<Empleado> empleado;
	/**
	 * @param nombre
	 * @param empleado
	 */
	public Empresa(String nombre, List<Empleado> empleado) {
		super();
		this.nombre = nombre;
		this.empleado = empleado;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the empleado
	 */
	public List<Empleado> getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
    public void ordenarEmpleadosPorNombre(){
    	Collections.sort(this.getEmpleado());
    }
    
    
    public void ordenarEmpleadosPorDepartamento(){
    	Collections.sort(this.getEmpleado());
    	
    }
    
    public String buscarEmpleado(String rut){
    	
    	return rut;
    }
    
    public void imprimir(){
 	   for (int i = 0; i < this.getEmpleado().size(); i++) {
 		System.out.println(this.getEmpleado().get(i));
 	}
    }
	  
	

}
