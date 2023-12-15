package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation {

    private JFrame frame;
    private JLabel animationLabel;
    private Timer timer;
    private ImageIcon[] frames;
    private int currentFrameIndex;

    public Animation() {
        // Создаем окно
        frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загружаем кадры анимации
        frames = new ImageIcon[3];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("D:\\mirea_java_3_semester\\labs\\src\\ru\\mirea\\lab8\\frame" + i + ".png");
        }

        // Создаем метку для отображения анимации
        animationLabel = new JLabel(frames[0]);

        // Добавляем метку на окно
        frame.getContentPane().add(animationLabel, BorderLayout.CENTER);

        // Создаем таймер для обновления кадров анимации
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrameIndex]);
            }
        });

        // Создаем кнопку для управления анимацией
        JButton startButton = new JButton("Старт");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        JButton stopButton = new JButton("Стоп");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        // Добавляем кнопки на окно
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Устанавливаем размеры окна и делаем его видимым
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
