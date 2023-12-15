package ru.mirea.lab3;

public class DoubleConversion
{
    public static void main(String[] args)
    {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        String strValue = "1.618";
        double doubleValue = Double.parseDouble(strValue);

        double primitiveDouble1 = doubleObj1.doubleValue();
        double primitiveDouble2 = doubleObj2.doubleValue();

        System.out.println("Value of doubleObj1: " + doubleObj1);
        System.out.println("Value of doubleObj2: " + doubleObj2);

        double literalDouble = 3.14;
        String strDouble = Double.toString(literalDouble);

        System.out.println("Value of doubleValue: " + doubleValue);
        System.out.println("Converted literal double to string: " + strDouble);
    }
}