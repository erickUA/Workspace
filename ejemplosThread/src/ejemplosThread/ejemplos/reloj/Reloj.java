package ejemplosThread.ejemplos.reloj;

public class Reloj {
	
	private int sg;
	private int min;
	private int hora;
	
	private boolean estaEncendido;
	
	public Reloj(int sg, int min, int hora) {
		super();
		this.sg = sg;
		this.min = min;
		this.hora = hora;
	}

	public boolean isEstaEncendido() {
		return estaEncendido;
	}
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	public int getSg() {
		return sg;
	}
	public void setSg(int sg) {
		this.sg = sg;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void avanzarUnSegundo(){
		this.sg ++;
		if(this.sg == 60)
		{
			this.sg = 0;
			this.avanzarUnMinuto();
		}
	}
	
	public void avanzarUnMinuto(){
		this.min ++;
		if(this.min == 60)
		{
			this.min = 0;
			this.avanzarUnHora();
		}
	}
	public void avanzarUnHora(){
		this.hora ++;
		if(this.hora == 24)
		{
			this.hora = 0;
		}
	}
	
	
	public void imprimir(){
		System.out.println(this.hora+":"+this.min+":"+this.sg);
	}

}
