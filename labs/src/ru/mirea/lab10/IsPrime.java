package ru.mirea.lab10;


import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer number greater than or equal to 0");
        int n = sc.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n == 1){
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        if (i >= Math.floor(Math.sqrt(n)) + 1) {
            return true;
        }

        return isPrime(n, i + 1);
    }
}
