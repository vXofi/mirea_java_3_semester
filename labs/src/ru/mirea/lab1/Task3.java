package ru.mirea.lab1;

public class Task3
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 3, 37, 22, 8};
        int sum = 0;
        float avg;

        System.out.print("\nInitial array: ");

        for (int el : arr) {
            System.out.print(el + " ");
            sum += el;
        }

        avg = (float) sum / arr.length;

        System.out.println("\nSum: " + sum + "; Average: " + avg);
    }
}