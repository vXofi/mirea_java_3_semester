package ru.mirea.lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// View
class CalculatorView extends JFrame {
    private Display screen = new Display();
    private Keys keyboard = new Keys();

    CalculatorView() {
        super("RPN Calculator");
        JPanel displayField  = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());

        displayField.add(screen, BorderLayout.NORTH);
        displayField.add(keyboard, BorderLayout.CENTER);
        displayField.setBackground(Color.LIGHT_GRAY);

        setContentPane(displayField);
        setVisible(true);

    }

    /***
     * Return the calculator's screen.
     * @return The Screen element.
     */
    public Display getDisplay() { return screen; }

    /***
     * Return the calculator's keyboard.
     * @return The Keyboard element.
     */
    public Keys getKeys() { return keyboard; }
}