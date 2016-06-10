package Ejercicio2;

import cl.curso.java.guia9.Vehiculo;

public class Auto extends Vehiculo{

	public int vender(int cantidadVender)
	{
		if(this.getCantidadAutosVender() != 0)
		{
			this.setCantidadAutosVender(this.getCantidadAutosVender()-cantidadVender);
		}
		else
		{
			this.setCantidadAutosVender(0);
		}
		
		return this.getCantidadAutosVender();
	}
}
