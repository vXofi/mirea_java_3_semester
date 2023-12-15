package ru.mirea.lab3;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        //1
        Double dob = Double.valueOf("5");
        //2
        num3 = Double.parseDouble("12.3");
        //3
        Double obj = Double.valueOf("64");
        int intVal = obj.intValue();
        System.out.println("int value: " + intVal);
        byte byteVal = obj.byteValue();
        System.out.println("byte value: " + byteVal);
        short shortVal = obj.shortValue();
        System.out.println("short value: " + shortVal);
        float floatVal = obj.floatValue();
        System.out.println("short value: " + floatVal);
        double doubleVal = obj;
        System.out.println("double value: " + doubleVal);
        //4
        System.out.println("number 3 equals to: " + dob);
        //5
        String d = Double.toString(3.14);
        System.out.println("Literal value: " + d);
    }
}
