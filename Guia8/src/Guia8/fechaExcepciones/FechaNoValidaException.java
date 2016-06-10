package Guia8.fechaExcepciones;

public class FechaNoValidaException extends Exception {

	public FechaNoValidaException(  )
	{
		super("La fecha Ingresada no es valida");
	}
}

