package Task4;

import javax.swing.*;
import java.awt.*;

public class Task4 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Example how to display buttons");
        jf.setSize(240, 200);
        String pos[] = { "East", "West", "North", "South", "Center" };
        for (String position : pos) {
            JButton button = new JButton(position);
            jf.add(button, position);
        }

        jf.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String position : pos) {
            JButton button = new JButton(position);
            jf.add(button);
        }

        jf.setLayout(new FlowLayout());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jf.setLayout(new GridLayout(0, 3));

        for (String position : pos) {
            JButton button = new JButton(position);
            jf.add(button);
        }

        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
