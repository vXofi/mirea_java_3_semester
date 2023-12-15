package ru.mirea.lab4;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.println("Input radius of a circle (should be number greater than 0)\n");
        radius = sc.nextDouble();

        Circle figure = new Circle(radius);

        int input;
        while(true) {
            System.out.println("""
                    Input:\s
                     0 to change a radius\s
                     1 to output radius\s
                     2 to output circumference\s
                     3 to output area
                     -1 to exit""");
            while (!sc.hasNextInt()) {
                System.out.println("only type integer is supported");
                sc.next();
            }
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case (-1):
                    break;
                case (0):
                    System.out.println("Input radius of a circle (should be number greater than 0)\n");
                    radius = sc.nextDouble();
                    figure.setRad(radius);
                    continue;
                case (1):
                    System.out.println("radius equals to: " + figure.getRad());
                    continue;
                case (2):
                    System.out.println("circumference equals to: " + figure.getCircumference());
                    continue;
                case (3):
                    System.out.println("area equals to: " + figure.getArea());
                    continue;
                default:
                    System.out.println("unsupported command code");
                    break;
            }
            break;
        }
    }
}
