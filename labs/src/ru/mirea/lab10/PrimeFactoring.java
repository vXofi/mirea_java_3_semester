package ru.mirea.lab10;

import java.util.Scanner;

public class PrimeFactoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer number greater than 0");
        int n = sc.nextInt();

        System.out.println("prime factors of number " + n + ":");
        printPrimeFactors(n, 2);
    }

    // Рекурсивная функция для вывода простых множителей числа
    public static void printPrimeFactors(int n, int i) {
        if (n == 1) {
            return;
        }

        // Если i является простым множителем числа n
        if (n % i == 0 && isPrime(i, 2)) {
            System.out.print(i + " ");
            printPrimeFactors(n / i, i);
        }
        // Если i не является простым множителем числа n
        else {
            printPrimeFactors(n, i + 1);
        }
    }

    // Рекурсивная функция для проверки простоты числа
    public static boolean isPrime(int n, int i) {
        if (n == 2) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        if (i >= Math.sqrt(n)) {
            return true;
        }

        return isPrime(n, i + 1);
    }
}
