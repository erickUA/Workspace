package cl.curso.java.banco;

import cl.curso.java.tarjetaBip.TarjetaBipClasica;

public class ProgramaBanco {

	public static void main(String[] args)
	{
		
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.setLineaCredito(2000);
		cta1.setNumeroCuenta(123456789);
		cta1.setSaldo(1000);
		
		System.out.println("---------------");
		
		CuentaVista cuentaVista = new CuentaVista ();
		cuentaVista.setNumeroCuenta(191883748);
		cuentaVista.setSaldo(2000);
		
		CajeroAutomatico automatico = new CajeroAutomatico();
		automatico.retirarDinero(cuentaVista, 2000);
		automatico.retirarDinero(cta1, 1000);		
		
		TarjetaBipClasica tb = new TarjetaBipClasica();
		automatico.pagar(tb);
	}
}