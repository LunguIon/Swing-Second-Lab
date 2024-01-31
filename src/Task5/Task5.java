package Task5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Task5 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Exemplu de adaugare a butoanelor");

        jf.setSize(200, 200);
        JPanel[] pp = new JPanel[8];
        JButton[] buttons = new JButton[8];
        for (int i = 0; i < 8; i++) {
            buttons[i] = new JButton("Buton " + (i + 1));
            pp[i] = new JPanel();
            pp[i].setLayout(new GridLayout(1, 1));
            pp[i].setBorder(new EmptyBorder(10, 10, 10, 10)); // Add spaces between panels
            pp[i].add(buttons[i]);
        }

        jf.setLayout(new GridLayout(0, 2));

        for (int i = 0; i < 8; i++) {
            jf.add(pp[i]);
        }

        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
