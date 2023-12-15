package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class WindowTest {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);

            JPanel panel = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Random random = new Random();

                    for (int i = 0; i < 20; i++) {
                        int x = random.nextInt(400);
                        int y = random.nextInt(400);
                        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                        if (random.nextBoolean()) {
                            int width = random.nextInt(100);
                            int height = random.nextInt(100);
                            Rectangle rectangle = new Rectangle(color, x, y, width, height);
                            rectangle.draw(g);
                        } else {
                            int radius = random.nextInt(50);
                            Circle circle = new Circle(color, x, y, radius);
                            circle.draw(g);
                        }
                    }
                }
            };

            frame.add(panel);
            frame.revalidate();
        }
}
