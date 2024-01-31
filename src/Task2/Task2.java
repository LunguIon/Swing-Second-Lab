package Task2;

import javax.swing.*;
import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Wow:)");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        center(jf);
        jf.setVisible(true);
    }
    public static void center(Window w) {
        Dimension ws = w.getSize();
        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
        int newX = (ss.width - ws.width) / 2;
        int newY = (ss.height - ws.height) / 2;
        w.setLocation(newX, newY);
    }
}
