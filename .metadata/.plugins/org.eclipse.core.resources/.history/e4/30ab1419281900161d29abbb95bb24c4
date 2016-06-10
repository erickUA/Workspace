package cl.curso.java.banco;

/**
 * @author kevins
 */
public class CuentaCorriente extends CuentaBancaria {

	private int lineaCredito;
	
	public void girar(int monto)
	{
		if(monto <= (this.getSaldo()+ this.getLineaCredito()))
		{
			if(monto <= this.getSaldo())
			{
				this.setSaldo(this.getSaldo() - monto);
			}
			else
			{
				int resto = monto - this.getSaldo();
				this.setLineaCredito(this.getLineaCredito()-resto);
				this.setSaldo(0);
			}
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void imprimir()
	{
		super.imprimir();
		System.out.println("Linea de credito: $"+this.getLineaCredito());
	}

	/**
	 * @return the lineaCredito
	 */
	public int getLineaCredito() {
		return lineaCredito;
	}

	/**
	 * @param lineaCredito the lineaCredito to set
	 */
	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagar de cuenta corriente.");
	}

	@Override
	public void pagarNeto(int monto) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
