package T3;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Ingresar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtingreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingresar frame = new Ingresar();
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
	public Ingresar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinero a ingresar: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(63, 147, 150, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaldo.setBounds(63, 287, 66, 58);
		contentPane.add(lblSaldo);
		
		txtingreso = new JTextField();
		txtingreso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtingreso.setBounds(223, 159, 283, 35);
		contentPane.add(txtingreso);
		txtingreso.setColumns(10);
		
		JLabel lblsaldoi = new JLabel("");
		lblsaldoi.setBounds(125, 299, 338, 35);
		contentPane.add(lblsaldoi);
		
		JComboBox descuenta = new JComboBox();
		descuenta.setModel(new DefaultComboBoxModel(new String[] {"corriente", "credito"}));
		descuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		descuenta.setBounds(223, 99, 283, 35);
		contentPane.add(descuenta);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta:");
		lblTipoDeCuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeCuenta.setBounds(63, 87, 150, 58);
		contentPane.add(lblTipoDeCuenta);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESAR EN EFECTIVO");
		lblNewLabel_1.setBackground(new Color(0, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(147, 20, 261, 46);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = (String) descuenta.getSelectedItem();
				int dinero = Integer.parseInt(txtingreso.getText());
				
				lblsaldoi.setText(String.valueOf(dinero));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(209, 227, 163, 46);
		contentPane.add(btnNewButton);
	}
}
