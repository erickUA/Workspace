package herencia.jugada;
public  class Piedra extends Jugada {

	public void jugar(Jugada jugada) {
		jugada.jugarContraPiedra();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println( "gana papel" );
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println( "empate" );
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println( "gana piedra" );
		
	}

	
}
