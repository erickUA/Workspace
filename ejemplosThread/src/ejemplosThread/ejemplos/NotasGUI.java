package ejemplosThread.ejemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasGUI {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nota1 = new JLabel("ingresar nota1");
		nota1.setBounds(39, 34, 102, 16);
		frame.getContentPane().add(nota1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 29, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel nota2 = new JLabel("ingresar nota2");
		nota2.setBounds(39, 76, 102, 16);
		frame.getContentPane().add(nota2);
		
		JLabel nota3 = new JLabel("ingresar nota3");
		nota3.setBounds(39, 114, 102, 16);
		frame.getContentPane().add(nota3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 71, 130, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 109, 130, 26);
		frame.getContentPane().add(textField_3);
		
		JButton btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent e) {
				
				int promedio = (Integer.parseInt(nota1.getText()) + Integer.parseInt(nota2.getText()) + Integer.parseInt(nota3.getText())) / 3;
				System.out.println(promedio);
				txtPromedio.setText(""+ promedio);
				
			}
		});
		btnCalcularPromedio.setBounds(102, 158, 171, 29);
		frame.getContentPane().add(btnCalcularPromedio);
		     
		    
		
		JLabel lblPromedio = new JLabel("promedio");
		lblPromedio.setBounds(50, 220, 61, 16);
		frame.getContentPane().add(lblPromedio);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(143, 215, 130, 26);
		frame.getContentPane().add(txtPromedio);
		txtPromedio.setColumns(10);
	}
}
