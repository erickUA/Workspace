package herencia.ejercicio1;





public  class Triangulo extends FiguraGeometrica {
	
	private int altura;
	private int base;
	
	

	public Triangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	

	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.base * this.altura) / 2;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}


}
