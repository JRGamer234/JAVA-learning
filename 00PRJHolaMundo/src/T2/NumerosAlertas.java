package T2;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumerosAlertas extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumerosAlertas frame = new NumerosAlertas();
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
	public NumerosAlertas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(82, 42, 62, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblN = new JLabel("n2");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN.setBounds(82, 109, 62, 44);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("n3");
		lblN_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1.setBounds(82, 176, 62, 44);
		contentPane.add(lblN_1);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt1.setBounds(154, 50, 165, 36);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt2.setColumns(10);
		txt2.setBounds(154, 109, 165, 36);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt3.setColumns(10);
		txt3.setBounds(154, 184, 165, 36);
		contentPane.add(txt3);
		
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txt1.getText());
					int n2 = Integer.parseInt(txt2.getText());
					int n3 = Integer.parseInt(txt3.getText());
					
					// Calcular los resultados
					String total = n1 + ", " + n2 + ", " + n3;
					int suma = n1 + n2 + n3;
					
					int mayor = n1;
					if (n2 > mayor) {
						mayor = n2;
					}
					if (n3 > mayor) {
						mayor = n3;
					}
					
					// Mostrar resultados en una alerta
					String mensaje = "Números ingresados: " + total + "\nSuma: " + suma + "\nMayor: " + mayor;
					
					JOptionPane.showMessageDialog(contentPane, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
					
					// Limpiar los campos de texto
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt1.requestFocus();
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(contentPane, "Por favor, ingrese números válidos en todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		enviar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		enviar.setBounds(360, 113, 130, 44);
		contentPane.add(enviar);
	}
}