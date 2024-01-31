package Task6;

import javax.swing.*;
import java.awt.*;

public class Task6 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        JFrame jf = new JFrame("Run");
        jf.setSize(400, 160);
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Open");
        JTextField textField = new JTextField(" ", 30);
        textPanel.add(label, BorderLayout.WEST); // Label on the left side
        textPanel.add(textField, BorderLayout.CENTER);

        // Here we create the panel with buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton browseButton = new JButton("Browse");
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(browseButton);

        jf.add(textPanel);
        jf.add(buttonPanel);
        //As always we set the jframe to be exit on close, so the application will close when hitting the x button
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout());

        jf.setVisible(true);
    }
}
