package CuentaCorriente;

import CuentaCorriente.CuentaVista;

public class ProgramaCuenta {

	public static void main(String[] args) {
		CuentaCorriente cta1 = new CuentaCorriente();
        cta1.setLineaDeCredito(2000);
        cta1.setNumeroCuenta(123456);
        cta1.setSaldo(1000);
        
        cta1.imprimir();
        
        System.out.println("------------------------------");
        
        CuentaVista cuentaVista = new CuentaVista();
        cuentaVista.setNumeroCuenta(11234556);
        cuentaVista.setSaldo(2000);
        cuentaVista.imprimir();

	}

}
