package T2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnRayaGraf extends JFrame {
    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true;
    private ImageIcon iconoX;
    private ImageIcon iconoO;

    public TresEnRayaGraf() {
        setTitle("Tres en Raya");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        inicializarGUI();
    }

    private void inicializarGUI() {
        // Cargar imágenes
        iconoX = new ImageIcon(new ImageIcon("C:/Users/jorge/Pictures/cruz.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        iconoO = new ImageIcon(new ImageIcon("C:/Users/jorge/Pictures/circulo.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));

        // Crear los botones del tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                botones[i][j].setFocusPainted(false);
                botones[i][j].addActionListener(new BotonListener(i, j));
                add(botones[i][j]);
            }
        }
    }

    private class BotonListener implements ActionListener {
        int fila, columna;

        public BotonListener(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }
        

        @Override
        public void actionPerformed(ActionEvent e) {
            if (botones[fila][columna].getIcon() == null) {
                botones[fila][columna].setIcon(turnoX ? iconoX : iconoO);
                turnoX = !turnoX;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TresEnRayaGraf().setVisible(true));
    }
}
