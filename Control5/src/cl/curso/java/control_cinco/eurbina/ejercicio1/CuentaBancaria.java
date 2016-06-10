package cl.curso.java.control_cinco.eurbina.ejercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class CuentaBancaria {
	
	private int  numero;
	private List<Transaccion> transacciones ;
	
	

	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public List<Transaccion> getTransacciones() {
		return transacciones;
	}



	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
   
	
	public void agregarTransacciones(Transaccion transacciones){
		   
	}


	public abstract void ordenarTransaccionesPorFecha();
	{
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				// TODO Auto-generated method stub
				return o1.getTipo().compareTo(o2.getTipo());
			}
			
			
		});
	}
	
	public abstract void ordenarTransacciones();{
		
	}
   
	public void imprimir(){
		   for (int i = 0; i < this.getTransacciones().size(); i++) {
			System.out.println(this.getTransacciones().get(i));
	}
	   
	   
	}

}
