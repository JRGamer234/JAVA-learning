package T2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class SueldosGraficos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtsueldos;
	private JTextField txtcomision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SueldosGraficos frame = new SueldosGraficos();
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
	public SueldosGraficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(70, 81, 170, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApellidos.setBounds(70, 166, 170, 42);
		contentPane.add(lblApellidos);
		
		JLabel lblSueldos = new JLabel("Sueldos");
		lblSueldos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSueldos.setBounds(70, 251, 170, 42);
		contentPane.add(lblSueldos);
		
		JLabel lblComision = new JLabel("Comision");
		lblComision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComision.setBounds(70, 336, 170, 42);
		contentPane.add(lblComision);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnombre.setBounds(234, 86, 337, 42);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtapellido.setColumns(10);
		txtapellido.setBounds(234, 166, 337, 42);
		contentPane.add(txtapellido);
		
		txtsueldos = new JTextField();
		txtsueldos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtsueldos.setColumns(10);
		txtsueldos.setBounds(234, 251, 337, 42);
		contentPane.add(txtsueldos);
		
		txtcomision = new JTextField();
		txtcomision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtcomision.setColumns(10);
		txtcomision.setBounds(234, 336, 337, 42);
		contentPane.add(txtcomision);
	}
}
