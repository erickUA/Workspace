package herencia.jugada;

public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraTijera();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println( "gana tijera" );
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println( "pierde tijera" );
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println( "empata" );
		
	}

}