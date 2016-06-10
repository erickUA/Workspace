package Guia8;

public class ProgramaReloj {

	public static void main(String[] args) {
		
		Reloj RelojComun  = new Reloj(0,0,0);
		
		RelojComun.Segundo(0, 0, 0);
		RelojComun.setSegundo(5);
		RelojComun.imprimir();
	}

}
