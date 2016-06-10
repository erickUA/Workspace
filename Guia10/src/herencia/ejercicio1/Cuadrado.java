package herencia.ejercicio1;




public class Cuadrado extends FiguraGeometrica {
	
	private int lado;


	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	


	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}
