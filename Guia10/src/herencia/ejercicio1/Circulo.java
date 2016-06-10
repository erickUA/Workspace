package herencia.ejercicio1;






public class Circulo extends FiguraGeometrica {
	
	private double radio;
	
	

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	

	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	@Override
	public void dibujar() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.radio *2) * Math.PI; 
	}

}
