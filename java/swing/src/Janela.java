import javax.swing.*;
import java.awt.*;

public class Janela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela");
        janela.setSize(400,300);
        janela.setLocation(300,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);


        JLabel rotulo = new JLabel("Label");
        rotulo.setBounds(100,100,300,200);
        rotulo.setForeground(new Color(110,0,255));
        rotulo.setFont(new Font("Arial", Font.BOLD, 40));

        janela.add(rotulo);

        janela.setVisible(true);


    }
}
