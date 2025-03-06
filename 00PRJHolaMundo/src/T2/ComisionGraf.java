package T2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ComisionGraf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtSueldo;
	private JTextField txtComision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComisionGraf frame = new ComisionGraf();
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
	public ComisionGraf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblNewLabel.setBounds(61, 58, 193, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblApellidos.setBounds(61, 147, 193, 48);
		contentPane.add(lblApellidos);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblSueldo.setBounds(61, 233, 193, 48);
		contentPane.add(lblSueldo);
		
		JLabel lblComisin = new JLabel("Comisión");
		lblComisin.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblComisin.setBounds(61, 308, 193, 48);
		contentPane.add(lblComisin);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtNombre.setBounds(201, 66, 262, 35);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtApellido.setColumns(10);
		txtApellido.setBounds(201, 147, 262, 35);
		contentPane.add(txtApellido);
		
		txtSueldo = new JTextField();
		txtSueldo.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(201, 233, 262, 35);
		contentPane.add(txtSueldo);
		
		txtComision = new JTextField();
		txtComision.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtComision.setColumns(10);
		txtComision.setBounds(201, 308, 262, 35);
		contentPane.add(txtComision);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblResultado.setBounds(10, 446, 579, 171);
		contentPane.add(lblResultado);
		JButton Enviar = new JButton("Enviar");
		
		Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				int sueldo = Integer.parseInt(txtSueldo.getText());
				int comision = Integer.parseInt(txtComision.getText());
				
				int suma = sueldo + comision;
				
				lblResultado.setText(nombre + " " + apellido + " cobrará " + String.valueOf(suma));
				if(suma < 1300) {
					lblResultado.setForeground(Color.RED);
				}else if(suma > 1300) {
					lblResultado.setForeground(Color.GREEN);
				}
			}
		});
		Enviar.setFont(new Font("Algerian", Font.PLAIN, 20));
		Enviar.setBounds(251, 367, 115, 48);
		contentPane.add(Enviar);
		
		
	}
}
