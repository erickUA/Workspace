package herencia.persona;


public class ProgramaPersona {

	public static void main(String[] args) {
		String[] cursos = {"java","JEE"};
		
		Profesor profe = new Profesor("11-1", "erick", "urbina", "aguilera", cursos);
		
		int[]notas ={70,40};
		Alumno  alum= new Alumno("juanito", "22-2", "", "", notas);
		
		
		
		System.out.println(profe.getNombre());

	}

}
