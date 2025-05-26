package Evaluacion2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtedad;
	private JTextField txtdueno;
	private JTextField txtraza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3 frame = new ejercicio3();
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
	public ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tipo animal");
		lblNewLabel.setBounds(46, 36, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(46, 86, 98, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("edad");
		lblEdad.setBounds(46, 126, 98, 14);
		contentPane.add(lblEdad);
		
		JLabel lblDuei = new JLabel("dueño");
		lblDuei.setBounds(309, 36, 98, 14);
		contentPane.add(lblDuei);
		
		JLabel lblRaza = new JLabel("raza");
		lblRaza.setBounds(309, 86, 98, 14);
		contentPane.add(lblRaza);
		
		JComboBox comboboxtipo = new JComboBox();
		comboboxtipo.setModel(new DefaultComboBoxModel(new String[] {"seleccionar", "perro", "gato", "hurón", "conejo"}));
		comboboxtipo.setBounds(114, 32, 86, 18);
		contentPane.add(comboboxtipo);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(114, 80, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtedad = new JTextField();
		txtedad.setColumns(10);
		txtedad.setBounds(114, 123, 86, 20);
		contentPane.add(txtedad);
		
		txtdueno = new JTextField();
		txtdueno.setColumns(10);
		txtdueno.setBounds(388, 33, 86, 20);
		contentPane.add(txtdueno);
		
		txtraza = new JTextField();
		txtraza.setColumns(10);
		txtraza.setBounds(388, 83, 86, 20);
		contentPane.add(txtraza);
		
		JCheckBox checkesterilizado = new JCheckBox("Esterilizado");
		checkesterilizado.setBounds(365, 122, 97, 23);
		contentPane.add(checkesterilizado);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje, nombre, tipo, dueno, raza, edad, esterilizado;
				nombre = txtnombre.getText();
				tipo = comboboxtipo.getSelectedItem().toString();
				dueno = txtdueno.getText();
				raza = txtraza.getText();
				edad = txtedad.getText();
				if(checkesterilizado.isSelected()) {
					esterilizado = "Esterilizado";
				}else {
					esterilizado = "No esterilizado";
				}
				mensaje = "Tipo: " + tipo + "\nRaza: "+ raza + "\nNombre: " + nombre + "\nEdad: " + edad + "\nDueño: " + dueno + "\n" + esterilizado;
				JOptionPane.showMessageDialog(null, mensaje, nombre, 1);
			}
		});
		btnguardar.setBounds(222, 180, 89, 23);
		contentPane.add(btnguardar);
	}
}
