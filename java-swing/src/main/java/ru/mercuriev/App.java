package ru.mercuriev;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Eugene on 28.02.16.
 */
public class App {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);
        jf.setVisible(true);

        jf.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3 * 3; i++) {
            jf.add(getPanel(new Random().nextBoolean() ? Color.GRAY : Color.LIGHT_GRAY));
        }
        jf.pack();
    }

    private static JPanel getPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setSize(50, 50);
        return panel;
    }
}
