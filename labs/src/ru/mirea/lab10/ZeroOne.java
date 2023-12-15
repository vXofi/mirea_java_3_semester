package ru.mirea.lab10;

import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number of zeros (a): ");
        int a = scanner.nextInt();
        System.out.print("input number of ones (b): ");
        int b = scanner.nextInt();

        int count = countSequences(a, b);
        System.out.println("number of sequences: " + count);
    }

    public static int countSequences(int a, int b) {
        if (a == 0) {
            return 1;
        } else if (a == 1) {
            return b + 1;
        } else if (a > 1 & b == 0){
            return 0;
        } else {
            return countSequences(a - 1, b - 1) + countSequences(a, b - 1);
        }
    }
}
