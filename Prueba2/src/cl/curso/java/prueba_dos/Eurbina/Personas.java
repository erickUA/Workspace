/**
 * 
 */
package cl.curso.java.prueba_dos.Eurbina;

/**
 * @author erick
 *
 */
public class Personas {
	
	private String nombre;
	private String rut;
	private int edad;
	private int peso;
	private int altura;
	
	public Personas(){}

	public Personas(String nombre, String rut, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularIMC(){
		int pesoIdeal = (this.peso/(this.altura * this.altura));
		   
		   return pesoIdeal;
	}
    public void imprimir(){
    	if(calcularIMC() == -1){
    	System.out.println("su peso esta bajo lo ideal" +this.peso);
    	}
    	if(calcularIMC() == 0){
        	System.out.println("su peso es ideal" +this.peso);
        	}
    	if(calcularIMC() == 1){
        	System.out.println("su peso esta sobre lo ideal" +this.peso);
        	}
    }
    
    public void mayorEdad(){
    	if(this.edad <= 18){
    		System.out.println("es menor de edad");
    	}else{
    		System.out.println("es mayor de edad");
    	}
    	}
    }


  
	
	
	


