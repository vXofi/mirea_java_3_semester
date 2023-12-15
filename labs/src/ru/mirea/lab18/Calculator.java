package ru.mirea.lab18;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T num1, V num2) {
        if (num2.doubleValue() != 0) {
            return num1.doubleValue() / num2.doubleValue();
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    }

    public static <T extends Number, V extends Number> double subtraction(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 3.5;

        double sumResult = Calculator.sum(num1, num2);
        double multiplyResult = Calculator.multiply(num1, num2);
        double divideResult = Calculator.divide(num1, num2);
        double subtractionResult = Calculator.subtraction(num1, num2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Subtraction: " + subtractionResult);
    }
}
