package cl.curso.java.banco;

public class CuentaVista extends CuentaBancaria {

	/**
	 * @author kevins
	 * Solo puede girar su el monto es menor o igual a
	 * saldo de la cuenta
	 * por cada giro se cobra 300 pesos
	 */
	
	@Override
	public void girar(int monto)
	{
		if(this.getSaldo() <= (monto+300))
		{
			this.setSaldo(this.getSaldo() - (monto+300));
			
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void imprrmirFormate()
	{
		System.out.println("cta vista");
	}
	

	@Override
	public void pagar(int monto) {
		System.out.println("Pagar de cuenta vista.");
	}

	@Override
	public void pagarNeto(int monto) {
		// TODO Auto-generated method stub
		
	}
}