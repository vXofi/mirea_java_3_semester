package ru.mirea.lab23;

import java.util.ArrayList;
import java.util.Arrays;
//29 че то сделал

public class Test {
    public static void main(String[] args) {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("pizza: Peperoni: 590");
        dish.add("cake: Sweet: 700");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("water: Fresh, Bubbles: 160");
        drink.add("juice: Orange, Apple: 190");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);
        for (String s: drink)
            System.out.println(s);

        Order order = new Order(1, 1);
        order.addDish(new Dish("pizza", "Peperoni", 590));
        order.addDrink(new Drink("Juice", "Orange", 190));
        System.out.println("\npositions in the order: " + ((int) order.drinkQuantity() + (int) order.dishQuantity()));
        System.out.println(Arrays.toString(order.getDrinkNames()));
        System.out.println(Arrays.toString(order.getDishNames()));

        Order order1 = new Order(1, 1);
        order1.addDish(new Dish("cake", "Sweet", 700));
        order1.addDrink(new Drink("water", "Fresh, Bubbles", 160));
        System.out.println("Positions in the order: " + ((int) order1.drinkQuantity() + (int) order1.dishQuantity()));
        System.out.println(order1);

        System.out.println("\n" + "Restaurant orders: ");
        Order[] orders = {order, order1};
        TablesOrderManager orderManager = new TablesOrderManager(orders);
        System.out.println(orderManager);

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("cake", "Sweet", 700));
        internetOrder.addPosition(new Drink("water", "Fresh, Bubbles", 160));
        System.out.println(internetOrder);
    }
}