package T3;

/*
* . Principal: saldoCredito, saldoCorriente variables globales   
* . Ingreso y Retirada: desplegable con cuenta corriente y		// HECHO //
*                            cuenta credito.   			
* Comprobar si se ha seleccionado, cual se ha seleccionado.
*            Si es corriente maximo ingreso
            y retirada 150, si es credito maximo
            ingreso y retirada 300. Color rojo saldo retirada,
            color verde saldo ingreso
*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("BANCO");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Retirar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Redirigir a Retirar
				Retirar frame = new Retirar();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ingresar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Redirigir a Ingresar
				Ingresar frame = new Ingresar();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		frame.getContentPane().setLayout(null);
	}
}
