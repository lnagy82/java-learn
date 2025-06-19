package java8.Lambdas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lambdas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Kattints!");
        button.addActionListener(e -> System.out.println("Gombra kattintottál!" + e.getSource()));
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
