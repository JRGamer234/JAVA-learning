import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ejer5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtingresar;
	private JTextField txtretirar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer5 frame = new ejer5();
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
	public ejer5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importe");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 42, 84, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblIngresar.setBounds(160, 168, 84, 32);
		contentPane.add(lblIngresar);
		
		JLabel lblRetirar = new JLabel("Retirar");
		lblRetirar.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblRetirar.setBounds(487, 168, 84, 32);
		contentPane.add(lblRetirar);
		
		txtingresar = new JTextField();
		txtingresar.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		txtingresar.setBounds(127, 211, 148, 39);
		contentPane.add(txtingresar);
		txtingresar.setColumns(10);
		
		txtretirar = new JTextField();
		txtretirar.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		txtretirar.setColumns(10);
		txtretirar.setBounds(448, 211, 148, 39);
		contentPane.add(txtretirar);
		
		JLabel lblim = new JLabel("4000");
		lblim.setForeground(new Color(0, 128, 192));
		lblim.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblim.setBounds(171, 42, 84, 32);
		contentPane.add(lblim);
		
		JPanel panelingresar = new JPanel();
		panelingresar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelingresar.setBounds(88, 147, 228, 258);
		contentPane.add(panelingresar);
		
		JPanel panelretirar = new JPanel();
		panelretirar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelretirar.setBounds(405, 147, 228, 258);
		contentPane.add(panelretirar);
		
		JButton ingre = new JButton("Aceptar");
		ingre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ingreso = Integer.parseInt(txtingresar.getText());
				String importe = lblim.getText(); 
				String suma = importe + ingreso;
				lblim.setText(suma);
			
			}
		});
		ingre.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		ingre.setBounds(139, 277, 126, 32);
		contentPane.add(ingre);
		
		JButton reti = new JButton("Aceptar");
		reti.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		reti.setBounds(466, 280, 126, 32);
		contentPane.add(reti);
		
		
		
		
		
		
	}
}
