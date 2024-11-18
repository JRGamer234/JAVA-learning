package Aprenderfuncioens;

import javax.swing.JOptionPane;

public class mensajes {
	public  void mensaje(String msg) {
		System.out.println(msg);
	}
	public void mensaje_rojo(String msg) {
		System.err.println(msg);
	}
	public void mensaje_info(String msg) {
		int tipo = 2;
		JOptionPane.showMessageDialog(null, msg, "Info",tipo);
	}
}
