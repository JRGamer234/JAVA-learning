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

public class NumerosGraf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txtSuma;
	private JTextField txtTotal;
	private JTextField txtMayor;
	private JTextField txtMenor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumerosGraf frame = new NumerosGraf();
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
	public NumerosGraf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(44, 32, 103, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(44, 85, 103, 42);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 3");
		lblNumero_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero_1.setBounds(44, 138, 103, 42);
		contentPane.add(lblNumero_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt1.setBounds(188, 33, 245, 42);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt2.setColumns(10);
		txt2.setBounds(188, 85, 245, 42);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt3.setColumns(10);
		txt3.setBounds(188, 138, 245, 42);
		contentPane.add(txt3);
		
		JButton enviar = new JButton("Enviar");
		enviar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		enviar.setBounds(257, 206, 128, 49);
		contentPane.add(enviar);
		
		JLabel suma = new JLabel("SUMA");
		suma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		suma.setBounds(59, 270, 103, 42);
		contentPane.add(suma);
		
		txtSuma = new JTextField();
		txtTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txt1.getText());  //Convertir de String a Entero; se pone antes esto: Integer.parseInt(**Aqui dentro se pone lo que va a hacer**)
				int n2 = Integer.parseInt(txt2.getText());
				int n3 = Integer.parseInt(txt3.getText());
				
				txtTotal.setText(n1 + ", " + n2 + ", " + n3);
			}
		});
		txtSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSuma.setColumns(10);
		txtSuma.setBounds(44, 312, 103, 42);
		contentPane.add(txtSuma);
		
		JLabel txtToototo = new JLabel("n1, n2, n3");
		txtToototo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtToototo.setBounds(44, 408, 103, 42);
		contentPane.add(txtToototo);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		txtTotal.setBounds(173, 409, 308, 42);
		contentPane.add(txtTotal);
		
		JLabel lblMayor = new JLabel("MAYOR");
		lblMayor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMayor.setBounds(202, 270, 103, 42);
		contentPane.add(lblMayor);
		
		JLabel lblMenor = new JLabel("MENOR");
		lblMenor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMenor.setBounds(345, 271, 103, 42);
		contentPane.add(lblMenor);
		
		txtMayor = new JTextField();
		txtMayor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMayor.setColumns(10);
		txtMayor.setBounds(189, 313, 103, 42);
		contentPane.add(txtMayor);
		
		txtMenor = new JTextField();
		txtMenor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMenor.setColumns(10);
		txtMenor.setBounds(339, 313, 103, 42);
		contentPane.add(txtMenor);
	}
}
