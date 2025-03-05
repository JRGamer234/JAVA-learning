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

public class ComisionGraf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtSueldo;
	private JTextField txtComision;
	private JTextField txtSueldoComision;
	private JTextField txtNombreApellidos;

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
		setBounds(100, 100, 800, 666);
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
		
		JLabel lblSueldoConComisin = new JLabel("Sueldo con Comisión");
		lblSueldoConComisin.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblSueldoConComisin.setBounds(61, 502, 230, 48);
		contentPane.add(lblSueldoConComisin);
		
		txtSueldoComision = new JTextField();
		txtSueldoComision.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtSueldoComision.setColumns(10);
		txtSueldoComision.setBounds(308, 502, 262, 35);
		contentPane.add(txtSueldoComision);
		
		JButton Enviar = new JButton("Enviar");
		Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				int sueldo = Integer.parseInt(txtSueldo.getText());
				int comision = Integer.parseInt(txtComision.getText());
				
				
				txtNombreApellidos.setText(nombre + " " + apellido);
				txtSueldoComision.setText(String.valueOf(sueldo + comision));
			}
		});
		Enviar.setFont(new Font("Algerian", Font.PLAIN, 20));
		Enviar.setBounds(251, 367, 115, 48);
		contentPane.add(Enviar);
		
		JLabel lblNombreYApellidos = new JLabel("Nombre y Apellidos");
		lblNombreYApellidos.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblNombreYApellidos.setBounds(61, 447, 230, 48);
		contentPane.add(lblNombreYApellidos);
		
		txtNombreApellidos = new JTextField();
		txtNombreApellidos.setFont(new Font("Algerian", Font.PLAIN, 20));
		txtNombreApellidos.setColumns(10);
		txtNombreApellidos.setBounds(308, 447, 262, 35);
		contentPane.add(txtNombreApellidos);
	}
}
