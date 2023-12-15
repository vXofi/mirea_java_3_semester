package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class MR1 {
    public static void main(String[] args) {

        double[] arr_m = new double[10];
        double[] arr_r = new double[10];

        Random rand = new Random();

        for (int i=0; i < 10; i++){
            arr_m[i] = Math.round(Math.random() * 100.0) / 100.0;
        }

        for (int i=0; i < 10; i++){
            arr_r[i] = Math.round(rand.nextDouble() * 100.0) / 100.0;
        }


        System.out.print("\nInitial array for Math Class: ");

        for (double el : arr_m) {
            System.out.print(el + " ");
        }

        System.out.print("\nInitial array for Random Class: ");

        for (double el : arr_r) {
            System.out.print(el + " ");
        }

        Arrays.sort(arr_m);
        Arrays.sort(arr_r);

        System.out.print("\nSorted array for Math Class: ");

        for (double el : arr_m) {
            System.out.print(el + " ");
        }

        System.out.print("\nSorted array for Math Class: ");

        for (double el : arr_r) {
            System.out.print(el + " ");
        }

    }
}
