package ru.mirea.lab20;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Display extends JLabel {

    public Display(){
        super("0");
        this.setPreferredSize(new Dimension(400, 70));
        this.setOpaque(true);
        this.setHorizontalAlignment(RIGHT);
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setFont(new Font("Arial", Font.PLAIN, 24));
    }
}
