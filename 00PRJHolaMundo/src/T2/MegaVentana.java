package T2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MegaVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel fondocolor;
	private JTextField txt1;
	private JTextField txthola;
	private JTextField txt2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MegaVentana frame = new MegaVentana();
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
	public MegaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 495);
		fondocolor = new JPanel();
		fondocolor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fondocolor);
		fondocolor.setLayout(null);
		
		JLabel lblhola = new JLabel("Hola");
		lblhola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblhola.setBounds(61, 48, 161, 25);
		fondocolor.add(lblhola);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt1.setBounds(37, 90, 185, 31);
		fondocolor.add(txt1);
		txt1.setColumns(10);
		
		txthola = new JTextField();
		txthola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txthola.setColumns(10);
		txthola.setBounds(421, 45, 185, 31);
		fondocolor.add(txthola);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt2.setColumns(10);
		txt2.setBounds(421, 90, 185, 31);
		fondocolor.add(txt2);
		
		JButton btncambiar = new JButton("-->");
		btncambiar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String palabra1 = txt1.getText();
		        txt2.setText(palabra1);
		        txt1.setText("");
		    }
		});

		btncambiar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btncambiar.setBounds(266, 90, 114, 31);
		fondocolor.add(btncambiar);
		
		JButton btnhola = new JButton("Cambiar");
		btnhola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabrahola = txthola.getText();
		        lblhola.setText(palabrahola);
			}
		});
		btnhola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnhola.setBounds(266, 44, 114, 31);
		fondocolor.add(btnhola);
		
		JPanel panelcolor = new JPanel();
		panelcolor.setBounds(37, 160, 185, 180);
		fondocolor.add(panelcolor);
		panelcolor.setLayout(null);
		
		JRadioButton Naranja = new JRadioButton("Naranja");
		buttonGroup.add(Naranja);
		Naranja.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Naranja.setBounds(37, 40, 103, 21);
		panelcolor.add(Naranja);
		
		JRadioButton Azul = new JRadioButton("Azul");
		buttonGroup.add(Azul);
		Azul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Azul.setBounds(37, 80, 103, 21);
		panelcolor.add(Azul);
		
		JRadioButton Verde = new JRadioButton("Verde");
		buttonGroup.add(Verde);
		Verde.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Verde.setBounds(37, 117, 103, 21);
		panelcolor.add(Verde);
		
		JPanel panelmedidas = new JPanel();
		panelmedidas.setLayout(null);
		panelmedidas.setBounds(421, 160, 185, 180);
		fondocolor.add(panelmedidas);
		
		JRadioButton m1 = new JRadioButton("800x800");
		buttonGroup_1.add(m1);
		m1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		m1.setBounds(37, 40, 103, 21);
		panelmedidas.add(m1);
		
		JRadioButton m2 = new JRadioButton("1200x700");
		buttonGroup_1.add(m2);
		m2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		m2.setBounds(37, 80, 142, 21);
		panelmedidas.add(m2);
		
		JRadioButton m3 = new JRadioButton("1200x800");
		buttonGroup_1.add(m3);
		m3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		m3.setBounds(37, 117, 142, 21);
		panelmedidas.add(m3);
		
		JButton btnconvertir = new JButton("Convertir");
		btnconvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Naranja.isSelected()) {
					fondocolor.setBackground(Color.orange);
				}
				if(Azul.isSelected()) {
					fondocolor.setBackground(Color.blue);
				}
				if(Verde.isSelected()) {
					fondocolor.setBackground(Color.green);
				}
				if(m1.isSelected()) {
					setBounds(100,100,800,800);
				}
				if(m2.isSelected()) {
					setBounds(100,100,1200,700);
				}
				if(m3.isSelected()) {
					setBounds(100,100,1200,800);
				}
			}
		});
		btnconvertir.setForeground(new Color(255, 128, 0));
		btnconvertir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnconvertir.setBounds(232, 160, 179, 180);
		fondocolor.add(btnconvertir);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(48, 423, 161, 25);
		fondocolor.add(lblNumero);
		
		txtnum = new JTextField();
		txtnum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char codigoTecla = e.getKeyChar();
				if(codigoTecla < 48 || codigoTecla > 59) {
					e.consume();
				}
			}
		});
		txtnum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnum.setColumns(10);
		txtnum.setBounds(161, 417, 185, 31);
		fondocolor.add(txtnum);
	}
}
