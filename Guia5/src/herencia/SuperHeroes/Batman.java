package herencia.SuperHeroes;

public class Batman extends SuperHeroes {

	@Override
	public void recibirAtaque(Arma arma) {
		if(arma instanceof Granada){
			System.out.println("muere");
		}
		if(arma instanceof Criptonita){
			System.out.println("vive");
		}
		
	}


}
