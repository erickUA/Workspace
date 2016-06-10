package cafetera;

public class Programa {

	public static void main(String[] args) {
	        Cafetera cafetera = new Cafetera();
	        cafetera.imprimir();
	        
	        cafetera = new Cafetera(2500);
	        cafetera.imprimir();

	        cafetera = new Cafetera(2500, 2000);
	        cafetera.imprimir();
	        
	        cafetera = new Cafetera(2500, 3000);
	        cafetera.imprimir();
	        
	        cafetera.vaciarCafetera();
	        cafetera.imprimir();
	        
	        cafetera.agregarCafe(95);
	        cafetera.imprimir();
	        
	        cafetera.servirTaza(100);
	        cafetera.imprimir();
	        
	        cafetera.agregarCafe(3500);
	        cafetera.imprimir();
	        
	        cafetera.servirTaza(100);
	        cafetera.imprimir();
	        
	        cafetera.llenarCafetera();
	        cafetera.imprimir();
	        
	}
}