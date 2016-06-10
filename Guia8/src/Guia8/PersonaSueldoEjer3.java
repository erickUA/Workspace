package Guia8;

public class PersonaSueldoEjer3 {
	private String Nombre;
	private int Rut;
	private int SueldoBruto;
	private int PagoHorasExtras;
	private int HorasExtrasRealizadas;
	
	public PersonaSueldoEjer3 (){
		
		this.Nombre="Gregorio perez";
		this.Rut=180779930;
		this.SueldoBruto=1000000;
		this.PagoHorasExtras=5000;
		this.HorasExtrasRealizadas=10;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		this.Rut = Rut;
	}

	public int getSueldoBruto() {
		return SueldoBruto;
	}

	public void setSueldoBruto(int sueldoBruto) {
		this.SueldoBruto = sueldoBruto;
	}

	public int getPagohorasExtras() {
		return PagoHorasExtras;
	}

	public void setPagohorasExtras(int PagohorasExtras) {
		this.PagoHorasExtras = PagoHorasExtras;
	}

	public int getHorasExtrasRealizadas() {
		return HorasExtrasRealizadas;
	}

	public void setHorasExtrasRealizadas(int HorasExtrasRealizadas) {
		this.HorasExtrasRealizadas = HorasExtrasRealizadas;
	}
	
		
	
	public int PagoTotalMasHorasExtras(){
		return (PagoHorasExtras * HorasExtrasRealizadas);
		
	}
		
	public int  TotalSueldoMasHorasExtras(){
		return (SueldoBruto + PagoTotalMasHorasExtras() );
	}
	public int SueldoBrutoMenosIsapre(){
		return (TotalSueldoMasHorasExtras() * 7)/100;
	}
	public int SueldoBrutoMenosAfp(){
		return (TotalSueldoMasHorasExtras() * 10)/100;
	}
	public int SueldoTotalLiquido(){
		return (SueldoBruto - SueldoBrutoMenosAfp() - SueldoBrutoMenosIsapre());
	}
	
	public void imprimir(){
	System.out.println("Nombre: " + Nombre);
	System.out.println("RUt: " + Rut);
	System.out.println("sueldo Bruto: " + SueldoBruto);
	System.out.println("Total Horas Extras: " + PagoTotalMasHorasExtras());
	System.out.println("Total sueldo mas horas extras: " + TotalSueldoMasHorasExtras());
	System.out.println("Descuento 7% Isapre: " + SueldoBrutoMenosIsapre());
	System.out.println("Descuento 10% Afp : " +  SueldoBrutoMenosAfp());
	System.out.println("Sueldo liquido a pagar: " + SueldoTotalLiquido());
	
	
	}{
		
	}

}
