package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;

public class AnimTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Animation();
            }
        });
    }
}
