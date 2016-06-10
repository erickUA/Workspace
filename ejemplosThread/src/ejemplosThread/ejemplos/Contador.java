package ejemplosThread.ejemplos;

public class Contador {
	
	private int cuenta;
	
	
	
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}



	public int getCuenta() {
		return cuenta;
	}



	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}



	public void aumentaCuenta(){
		synchronized (this) {
		    this.cuenta++;	
		}
		System.out.println(this.cuenta);
	}
	
	public void imprimir(){
		System.out.println(this.getCuenta());
	}
	

}
