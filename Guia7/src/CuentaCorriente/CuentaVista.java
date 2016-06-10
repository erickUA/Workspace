package CuentaCorriente;



public class CuentaVista extends CuentaBancaria {
	
	public void girar(int monto){
		
		if((monto+300) <= this.getSaldo()){
			
			this.setSaldo(this.getSaldo() -(monto +300));
		}
		else{
			System.out.println("saldo insuficiente");
		}
	}
}

