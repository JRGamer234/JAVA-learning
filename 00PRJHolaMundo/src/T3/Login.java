package T3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField pswduser;
	// CONSTANTES
	private static final String USER = "Jorge";
	private static final String PSSWD = "1234";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(69, 52, 569, 328);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtuser.setBounds(264, 49, 255, 37);
		panel.add(txtuser);
		txtuser.setColumns(10);
		
		pswduser = new JPasswordField();
		pswduser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pswduser.setBounds(264, 155, 255, 37);
		panel.add(pswduser);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 43, 188, 43);
		panel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(30, 149, 188, 43);
		panel.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtuser.getText();
				String contrasena = pswduser.getText();
				
				if(usuario.equalsIgnoreCase(USER) && contrasena.equals(PSSWD)) {
					JOptionPane.showMessageDialog(null,"Has iniciado sesión", "Login", 1);
					principal p = new principal();
					p.main(null);
				}else {
					JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos", "Login", 0);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(214, 238, 144, 37);
		panel.add(btnNewButton);
	}
}

