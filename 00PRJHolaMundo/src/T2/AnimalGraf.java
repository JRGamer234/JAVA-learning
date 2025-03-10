package T2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnimalGraf extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtdueno;
	private JTextField txtedad;
	private JTextField txtraza;

	/**
	 * Formulario de ingreso animal
	 * 
	 * Pedid: que tipo de animal es (perro, gato, conejo, huron), nombre, nombre del dueño, edad, castrado(checkbox), raza
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGraf frame = new AnimalGraf();
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
	public AnimalGraf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo animal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 47, 126, 48);
		contentPane.add(lblNewLabel);
		
		JComboBox ctipo = new JComboBox();
		ctipo.setModel(new DefaultComboBoxModel(new String[] {"perro", "gato", "conejo", "huron"}));
		ctipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ctipo.setBounds(201, 60, 200, 30);
		contentPane.add(ctipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(33, 115, 126, 48);
		contentPane.add(lblNombre);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnombre.setBounds(201, 115, 200, 48);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblDueo = new JLabel("Dueño");
		lblDueo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDueo.setBounds(455, 115, 90, 48);
		contentPane.add(lblDueo);
		
		txtdueno = new JTextField();
		txtdueno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtdueno.setColumns(10);
		txtdueno.setBounds(532, 115, 200, 48);
		contentPane.add(txtdueno);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEdad.setBounds(33, 196, 126, 48);
		contentPane.add(lblEdad);
		
		txtedad = new JTextField();
		txtedad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtedad.setColumns(10);
		txtedad.setBounds(201, 196, 200, 48);
		contentPane.add(txtedad);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRaza.setBounds(455, 196, 90, 48);
		contentPane.add(lblRaza);
		
		txtraza = new JTextField();
		txtraza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtraza.setColumns(10);
		txtraza.setBounds(532, 196, 200, 48);
		contentPane.add(txtraza);
		
		JCheckBox checkesterilizado = new JCheckBox("Esterilizado");
		checkesterilizado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		checkesterilizado.setBounds(134, 290, 228, 38);
		contentPane.add(checkesterilizado);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje , nombre, tipo, dueno, raza, edad, esterilizado;
				nombre = txtnombre.getText();
				tipo = ctipo.getSelectedItem().toString();
				dueno = txtdueno.getText();
				raza = txtraza.getText();
				edad = txtedad.getText();
				if(checkesterilizado.isSelected()) {
					esterilizado = " Esterilizado";
				}else {
					esterilizado = " No esterilizado";
				}
				
				mensaje = "Tipo: " + tipo + "\n Raza: " + raza + "\n Nombre: " + nombre + "\nEdad: " + edad + "\n Dueño: " + dueno + "\n" + esterilizado;
				
				JOptionPane.showMessageDialog(null, mensaje, nombre, 1);
			}
		});
		guardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		guardar.setBounds(532, 290, 170, 38);
		contentPane.add(guardar);
	}
}
