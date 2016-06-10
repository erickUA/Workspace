package herencia.ejercicio1;

public abstract class FiguraGeometrica {
	
	private String color;
	private int cantLados;
	
	public  FiguraGeometrica(){
		
	}
	
	
	public FiguraGeometrica(String color, int cantLados) {
		super();
		this.color = color;
		this.cantLados = cantLados;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCantLados() {
		return cantLados;
	}


	public void setCantLados(int cantLados) {
		this.cantLados = cantLados;
	}


	public abstract void dibujar();
	
	public abstract double calcularArea();
	
	

}
