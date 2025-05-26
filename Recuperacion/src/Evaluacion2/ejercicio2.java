package Evaluacion2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtsueldo;
	private JTextField txtcomision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(91, 51, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("apellidos");
		lblApellidos.setBounds(91, 97, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblSueldo = new JLabel("sueldo");
		lblSueldo.setBounds(91, 144, 46, 14);
		contentPane.add(lblSueldo);
		
		JLabel lblComision = new JLabel("comision");
		lblComision.setBounds(91, 185, 46, 14);
		contentPane.add(lblComision);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(183, 48, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(183, 94, 86, 20);
		contentPane.add(txtapellido);
		
		txtsueldo = new JTextField();
		txtsueldo.setColumns(10);
		txtsueldo.setBounds(183, 141, 86, 20);
		contentPane.add(txtsueldo);
		
		txtcomision = new JTextField();
		txtcomision.setColumns(10);
		txtcomision.setBounds(183, 182, 86, 20);
		contentPane.add(txtcomision);
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setBounds(104, 239, 261, 20);
		contentPane.add(lblresultado);
		
		JButton btnenviar = new JButton("enviar");
		btnenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = txtnombre.getText();
				String apellido = txtapellido.getText();
				int sueldo = Integer.parseInt(txtsueldo.getText());
				int comision = Integer.parseInt(txtcomision.getText());
				int suma = sueldo + comision;
				
				lblresultado.setText(nombre + " " + apellido + " cobrará " + String.valueOf(suma));
				
				if(suma < 1300) {
					lblresultado.setForeground(Color.RED);
				}else if(suma > 1300) {
					lblresultado.setForeground(Color.GREEN);
				}
				
			}
		});
		btnenviar.setBounds(359, 108, 89, 23);
		contentPane.add(btnenviar);
	}

}
