package clase8;

import javax.swing.JOptionPane;

public class ProgramaNotas {

	public static void main(String[] args) {
		
		Nota[] notas ={new Nota("ctrl1",50,25),
				new Nota("ctrl 2",70,25),
				new Nota("ctrl 3",30,50)};
		
		Nota[] notax = new Nota[3];
		for(int i =0; i<notax.length; i++){
			String nota = JOptionPane.showInputDialog("ingresar nota"+ i);
			String porcentaje = JOptionPane.showInputDialog("ingresar porcentaje"+ i);
			notax[i] = new Nota("",Integer.parseInt(nota),
			   Integer.parseInt(porcentaje));
		}
		Alumno alumno = new Alumno("erick",notax);
		JOptionPane.showMessageDialog(null, "promedio es:"+ alumno.calcularPromedio());
	}

}

