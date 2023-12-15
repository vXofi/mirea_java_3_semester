package ru.mirea.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dollar rate");
        while(!sc.hasNextDouble()){
            System.out.println("Input supports only numbers");
            sc.next();
        }
        double val = sc.nextDouble();
        CurrencyConverter dollar = new CurrencyConverter(new Currency("USD", val));

        System.out.println("Enter the euro rate");
        while(!sc.hasNextDouble()){
            System.out.println("Input supports only numbers");
            sc.next();
        }
        val = sc.nextDouble();
        CurrencyConverter euro = new CurrencyConverter(new Currency("EUR", val));

        int action;
        double cost;

        System.out.println("Enter value in rubles");
        while(!sc.hasNextDouble()){
            System.out.println("Input supports only numbers");
            sc.next();
        }
        cost = sc.nextDouble();

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter 1: RUB -> USD\nEnter 2: RUB -> EUR");
            while(!sc.hasNextInt()){
                System.out.println("Input supports only type Integer");
                sc.next();
            }
            action = sc.nextInt();

            if (action == 1) {
                    System.out.println(dollar.convert(cost) + " USD");
            }
            else if (action == 2)
            {
                System.out.println(euro.convert(cost) + " EUR");
            }
            else
            {
                System.out.println("Wrong number");
            }
        }

    }
}
