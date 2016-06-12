/**
 * 
 */
package Ejercicio7;




/**
 * @author Felipe Paillal
 *
 */
public class Animal implements Runnable {

    private String nombre;
    private int velocidad;
    private long descanso;
    private int posicion;
    private static boolean carreraFinalizada;

    public Animal(String nombre, int velocidad, long descanso, int posicion) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.descanso = descanso;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public long getDescanso() {
        return descanso;
    }

    public void setDescanso(long descanso) {
        this.descanso = descanso;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isCarreraFinalizada() {
        return carreraFinalizada;
    }

    public void setCarreraFinalizada(boolean carreraFinalizada) {
        this.carreraFinalizada = carreraFinalizada;
    }

    /**
     * @method
     */
    @Override
    public void run() {
        while (!carreraFinalizada) {
            if (this.getPosicion() >= 100) {
                Animal.carreraFinalizada = true;
                System.out.println("La carrera finalizo, el ganador es " + this.getNombre());

            } else {

                this.setPosicion(this.getPosicion() + this.getVelocidad());
                try {
                    Thread.sleep((long) (0 + Math.random() * this.getDescanso()));
                } catch (InterruptedException i) {
                    i.getMessage();
                }
                System.out.println(this.getNombre() + " posicion :" + this.getPosicion());
            }
        }
    }
}