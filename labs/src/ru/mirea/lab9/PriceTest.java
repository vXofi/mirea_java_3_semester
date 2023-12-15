package ru.mirea.lab9;

public class PriceTest {
    public static void main(String[] args) {
        Product laptop = new Product("laptop", 1000.0);

        System.out.println(laptop.getPrice());
    }
}
