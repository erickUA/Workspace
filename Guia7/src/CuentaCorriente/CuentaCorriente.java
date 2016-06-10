package CuentaCorriente;


public class CuentaCorriente extends CuentaBancaria {
	private int lineaDeCredito;
	
	public CuentaCorriente(){
		
	}

	public int getLineaDeCredito() {
		return lineaDeCredito;
	}

	public void setLineaDeCredito(int lineaDeCredito) {
		this.lineaDeCredito = lineaDeCredito;
	}
	
	public void girar(int monto){
		if(monto <= (this.getSaldo() + this.getLineaDeCredito())){
			if(monto <= this.getSaldo()){
				this.setSaldo(this.getSaldo() - monto);
			}
			else{
				int resto = monto - this.getSaldo();
				this.setLineaDeCredito(this.getLineaDeCredito()- resto);
				this.setSaldo(0);
			}
		}
		else{
			System.out.println("saldo insufucuente");
			
		}
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println("linea de credito : "+ this.getLineaDeCredito());

	}

}