package cl.curso.java.guia9.ejercicio2;

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
