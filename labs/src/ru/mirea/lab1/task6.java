package ru.mirea.lab1;

public class task6 {
    public static void main(String[] args) {
        //6 Написать программу, в результате работы которой выводятся на
        //экран первые 10 чисел гармонического ряда (форматировать вывод).//
        System.out.println("First ten numbers of a harmonic series " +
                "rounded to two decimal places");
        double last = 0;
        for(int i=1; i<10+1; i++){
            System.out.println(i + ": " + String.format("%.2f", (double) 1/i + last));
            last += (double) 1/i;
        }
    }
}