package cl.curso.java.guia5;

public class Calculadora {
	private int numero1;
	private int numero2;
	
	public Calculadora(int numero1, int numero2){
		this.numero1 = 10;
		this.numero2 = 20;
		
	} 
	
	
	public int getNumero1() {
		return numero1;
	}


	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}


	public int getNumero2() {
		return numero2;
	}


	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}


	public int sumar(){
		int sumar = this.numero1 + this.numero2;
		return sumar;
	}
	public int restar(){
		int restar = this.numero1 - this.numero2;
		return restar;
	}
	public int multiplicar(){
		int multiplicar = this.numero1 * this.numero2;
		return multiplicar;
	}
	public int dividir(){
		int dividir = this.numero1 / this.numero2;
		return dividir;
	}

	
	public void imprimir(){
		/*
		System.out.println(this.sumar());
		System.out.println(this.restar());
		System.out.println(this.multiplicar());
		System.out.println(this.dividir());
		*/
	}
	

}
