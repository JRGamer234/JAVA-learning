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

public class SumaGraf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txtTotal;
	private JTextField txtSuma;
	private JTextField txtMayor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumaGraf frame = new SumaGraf();
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
	public SumaGraf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 506);
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
				int n1 = Integer.parseInt(txt1.getText());
				int n2 = Integer.parseInt(txt2.getText());
				int n3 = Integer.parseInt(txt3.getText());
				
				
				txtTotal.setText(n1 + ", " + n2 + ", " + n3);
				
				txtSuma.setText(String.valueOf(n1 + n2 + n3));
				
				int mayor = 0;
				
				if(n1 > mayor) {
					mayor = n1;
				}
				if(n2 > mayor) {
					mayor = n2;
				}
				if(n3 > mayor){
					mayor = n3;
				}
				
				txtMayor.setText(String.valueOf(mayor));
				
			}
		});
		enviar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		enviar.setBounds(446, 113, 130, 44);
		contentPane.add(enviar);
		
		JLabel lblN_1_1 = new JLabel("Total");
		lblN_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1_1.setBounds(47, 362, 62, 44);
		contentPane.add(lblN_1_1);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		txtTotal.setBounds(132, 370, 365, 36);
		contentPane.add(txtTotal);
		
		JLabel lblN_1_2 = new JLabel("Suma");
		lblN_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1_2.setBounds(47, 308, 62, 44);
		contentPane.add(lblN_1_2);
		
		txtSuma = new JTextField();
		txtSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSuma.setColumns(10);
		txtSuma.setBounds(125, 308, 130, 36);
		contentPane.add(txtSuma);
		
		JLabel lblN_1_2_1 = new JLabel("Mayor");
		lblN_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN_1_2_1.setBounds(299, 308, 62, 44);
		contentPane.add(lblN_1_2_1);
		
		txtMayor = new JTextField();
		txtMayor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMayor.setColumns(10);
		txtMayor.setBounds(371, 308, 130, 36);
		contentPane.add(txtMayor);
	}
}
