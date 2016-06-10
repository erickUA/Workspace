package CuentaCorriente;

public class CuentaBancaria {
    private int saldo;
    private int numeroCuenta;
    
    public CuentaBancaria(){
    	
    	
    }

	public CuentaBancaria(int saldo, int numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
    
	public void girar(int monto){
		System.out.println("girar [cuenta bancaria]");
	}
	public void depositar(int monto){
		
		System.out.println("se depositara $:" + monto);
		this.setSaldo(this.getSaldo() + monto);
	}
	public void imprimir(){
		System.out.println("datos de la cuenta");
		System.out.println("Nº cuenta:" + this.getNumeroCuenta());
		System.out.println("saldo: $" + this.getSaldo());
	}
}
