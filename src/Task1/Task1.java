package Task1;

import javax.swing.*;
//Problema 1 (1 punct) Program pentru afişarea unei ferestre cu titlu folosind clasa JFrame.
//Funcţia main() creează un obiect JFrame, stabileşte dimensiunile şi cere afişarea acestuia.
//Veţi folosi metodele setSize(), respectiv setVisible().
//Să se observe efectul unui clic pe butonul de închidere (X).
//Pentru terminarea aplicaţiei tastaţi CTRL-C.
//Adăugaţi apoi următoarea instrucţiune, unde jf este obiectul JFrame tocmai creat: jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
public class Task1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Wow:)");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
