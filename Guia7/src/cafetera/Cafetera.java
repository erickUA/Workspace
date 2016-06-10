
package cafetera;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
 
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
 
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }
 
     public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima : cantidadActual;
    }
 
    public void imprimir() {
        System.out.println("Capacidad Maxima: " + this.capacidadMaxima + "\nCapacidad Actual: " + this.cantidadActual);
    }
 
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
 
    public void servirTaza(int capacidadTaza) {
        this.cantidadActual = (this.cantidadActual >= capacidadTaza) ? this.cantidadActual - capacidadTaza : 0;
    }
 
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
 
    public void agregarCafe(int cantidadCafe) {
        this.cantidadActual = (this.cantidadActual + cantidadCafe > capacidadMaxima) ? this.capacidadMaxima : this.cantidadActual + cantidadCafe;
    }
	

}
