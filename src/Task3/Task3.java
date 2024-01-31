package Task3;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;


public class Task3 {
    public static void main(String[] args){
    JFrame jf = new JFrame("Jlabel and Jtext example");
        jf.setLayout(new

    FlowLayout());
    JLabel label = new JLabel("Property name: ");

    JTextField textField = new JTextField("White");
        textField.setEditable(false);
        textField.setBorder(new EtchedBorder());
        textField.setBackground(Color.white);
        textField.setPreferredSize(new

    Dimension(180,20));
        jf.add(label);
        jf.add(textField);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    center(jf);
        jf.pack();
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
