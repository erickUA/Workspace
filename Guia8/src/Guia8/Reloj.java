package Guia8;

public class Reloj {
	
	int segundo = 0;
	int minuto = 0;
	int hora = 0;
	
	public Reloj()
	{
		segundo = 0;
		minuto = 0;
		hora = 0;
	}
	
	public Reloj(int segundo, int minuto, int hora)
	{
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
	}
	
	public int Segundo(int segundo, int minuto, int hora)
	{
		while(segundo <= 60)
		{
			segundo++;
			System.out.println(segundo + " segundo");
			if(segundo == 60){
				segundo = 0;
				minuto++;
				if(minuto == 60)
				{
					minuto = 0;
					hora++;
				}
				System.out.println(minuto + " minuto");
			}
		}
		return segundo;
	}
	
	public int avanzarSegundo(int Segundo)
	{
		segundo = segundo + 1;
		return segundo;
	}
	
	public int retrocederSegundo(int Segundo)
	{
		segundo = segundo - 1;
		return segundo;
	}
	
	public void imprimir()
	{
		System.out.println(segundo + " Segundo");
		System.out.println(minuto + " Minuto");
		System.out.println(hora + " Hora");
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
}
