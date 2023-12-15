package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageTest {
    public static void main(String[] args) {
        String imageUrl = args[0];
        /// https://upload.wikimedia.org/wikipedia/en/thumb/4/49/Creeper_%28Minecraft%29.png/220px-Creeper_%28Minecraft%29.png

        if (imageUrl == null || imageUrl.isEmpty()) {
            System.out.println("No URL entered.");
            return;
        }

        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                try {
                    URL url = new URL(imageUrl);
                    BufferedImage image = ImageIO.read(url);
                    g.drawImage(image, 0, 0, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}