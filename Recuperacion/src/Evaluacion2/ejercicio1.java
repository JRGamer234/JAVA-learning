package Evaluacion2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txtsuma;
	private JTextField txtmayor;
	private JTextField txttotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
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
	public ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n1");
		lblNewLabel.setBounds(54, 98, 88, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblN = new JLabel("n2");
		lblN.setBounds(54, 149, 88, 27);
		contentPane.add(lblN);
		
		JLabel lblN_1 = new JLabel("n3");
		lblN_1.setBounds(54, 199, 88, 27);
		contentPane.add(lblN_1);
		
		txt1 = new JTextField();
		txt1.setBounds(128, 101, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(128, 152, 86, 20);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(128, 202, 86, 20);
		contentPane.add(txt3);
		
		JLabel lblN_1_1 = new JLabel("suma");
		lblN_1_1.setBounds(54, 295, 56, 27);
		contentPane.add(lblN_1_1);
		
		txtsuma = new JTextField();
		txtsuma.setColumns(10);
		txtsuma.setBounds(128, 298, 86, 20);
		contentPane.add(txtsuma);
		
		txtmayor = new JTextField();
		txtmayor.setColumns(10);
		txtmayor.setBounds(338, 298, 86, 20);
		contentPane.add(txtmayor);
		
		JLabel lblN_1_1_1 = new JLabel("mayor");
		lblN_1_1_1.setBounds(271, 295, 56, 27);
		contentPane.add(lblN_1_1_1);
		
		JLabel lblN_1_1_2 = new JLabel("total");
		lblN_1_1_2.setBounds(54, 348, 56, 27);
		contentPane.add(lblN_1_1_2);
		
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(120, 351, 113, 20);
		contentPane.add(txttotal);
		
		JButton btnenviar = new JButton("enviar");
		btnenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(txt1.getText());
				int n2 = Integer.parseInt(txt2.getText());
				int n3 = Integer.parseInt(txt3.getText());
				txttotal.setText(n1+ ", " + n2 + ", " + n3);
				txtsuma.setText(String.valueOf(n1 + n2 + n3));
				
				int mayor = 0;
				if(n1 > n2 && n1 > n3) {
					mayor = n1;
				}else if(n2 > n1 && n2 > n3) {
					mayor = n2;
				}else if(n3 > n1 && n3 > n2) {
					mayor = n3;
				}
				txtmayor.setText(String.valueOf(mayor));
			}
		});
		btnenviar.setBounds(335, 151, 89, 23);
		contentPane.add(btnenviar);
	}
}
