package T3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Retirar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtretirar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retirar frame = new Retirar();
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
	public Retirar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("RETIRAR EN EFECTIVO");
		lblNewLabel_1.setBounds(213, 10, 209, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(new Color(0, 128, 192));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Tipo de cuenta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(49, 89, 160, 52);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"corriente", "credito"}));
		comboBox.setBounds(213, 91, 288, 52);
		contentPane.add(comboBox);
		
		JLabel lblDineroASacar = new JLabel("Dinero a retirar:");
		lblDineroASacar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDineroASacar.setBounds(49, 151, 160, 52);
		contentPane.add(lblDineroASacar);
		
		txtretirar = new JTextField();
		txtretirar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtretirar.setBounds(213, 155, 288, 45);
		contentPane.add(txtretirar);
		txtretirar.setColumns(10);
		
		JButton btnNewButton = new JButton("Retirar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(241, 229, 160, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Saldo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(49, 316, 70, 61);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblsaldor = new JLabel("");
		lblsaldor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblsaldor.setBounds(111, 319, 300, 61);
		contentPane.add(lblsaldor);
	}
}
