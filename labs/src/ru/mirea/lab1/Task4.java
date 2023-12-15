package ru.mirea.lab1;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("\nInput array size greater than 0: ");
        while(!sc.hasNextInt()){
            System.out.println("Input supports only type Integer");
            sc.next();
        }

        n = sc.nextInt();
        arr = new int[n];

        System.out.print("Input " + n + " elements: ");

        int i = 0;

        while (i < n) {
            while(!sc.hasNextInt()){
                System.out.println("Input supports only type Integer");
                sc.next();
            }
            arr[i] = sc.nextInt();

            sum += arr[i];
            min = Integer.min(min, arr[i]);
            max = Integer.max(max, arr[i]);

            i++;
        }

        System.out.println("Sum: " + sum + "; Min: " + min + "; Max: " + max);
    }
}