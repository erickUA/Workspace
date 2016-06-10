package ejercicio;



import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		int dividendo  = obtenerNumero("dividendo");
		int divisor = obtenerNumero("divisor");
		
		Division dv = new Division(dividendo, divisor);
		try{
	    dv.hacerDivision();
		}catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "Error al realizar la division"+e.getMessage(),"error",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
		
		public static int obtenerNumero(String nomreDelParametro){
		
	    int numero = 0;
		boolean numeroValido = false;
		  do{	
		    try{
			
		String dividen = JOptionPane.showInputDialog("ingrese dividendo"+ nomreDelParametro);
		int dividendo = Integer.parseInt(dividen);
		
		String divis = JOptionPane.showInputDialog("ingrese divisor" + nomreDelParametro);
		int divisor = Integer.parseInt(divis);
		
		numeroValido = !numeroValido;
		}
	
		    catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error", "Los numeros ingresados no son Correctos", 
					JOptionPane.ERROR_MESSAGE);
		}
	 }
		while(!numeroValido);
		return numero;

	}
}




