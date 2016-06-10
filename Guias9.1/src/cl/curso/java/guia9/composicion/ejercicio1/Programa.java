package cl.curso.java.guia9.composicion.ejercicio1;


public class Programa {

	
	public static void main(String[] args)
	{
		Permiso per = new Permiso("Autorizado a matar.", 5413543, "Solo puede matar a larga distancia con rifles.");
		Perfil perf = new Perfil("Kevin Zambrano", "El es muy simpatico.", per);
		
		perf.imprimir();
	}
}
