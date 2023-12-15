package ru.mirea.lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPNCalculator {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel calculator = new CalculatorModel();
        CalculatorController control = new CalculatorController(calculator, view);

        for(JButton b: view.getKeys().getButtons())
            b.addActionListener(control);
    }
}
