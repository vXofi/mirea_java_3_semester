package ru.mirea.lab20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controller
class CalculatorController implements ActionListener {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorModel cal, CalculatorView view){
        this.model = cal;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // In this case the sources are always a button.
        JButton butt = (JButton) e.getSource();
        String buttTxt = butt.getText();

        if(buttTxt.equals("+"))
            model.doOperation("+");
        else if(buttTxt.equals("-") && !model.getCurrentDisplay().equals("0"))
            model.doOperation("-");
        else if(buttTxt.equals("*"))
            model.doOperation("*");
        else if(buttTxt.equals("/"))
            model.doOperation("/");
        else if(buttTxt.equals("Enter"))
            model.enter();
        else if(buttTxt.equals("C"))
            model.clear();
        else // The button isn't an operator, so we add the digit.
            model.addDigit(buttTxt);

        // Then we get the new displayed number.
        view.getDisplay().setText(model.getCurrentDisplay());
    }
}