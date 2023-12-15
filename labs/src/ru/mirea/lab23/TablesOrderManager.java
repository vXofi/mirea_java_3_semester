package ru.mirea.lab23;

import java.util.HashMap;

public class TablesOrderManager {
    private int size;
    private Order[] orders;

    public TablesOrderManager() { orders = null; }

    public TablesOrderManager(Order[] order){
        this.size = order.length;
        this.orders = new Order[size];
        for(int i=0; i<size; i++) { this.orders[i] = orders[i]; }
    }

    public void add(Order order, Item item){
        for (int i=0; i<size; i++){
            if (orders[i] == order){
                if (item.getClass().equals(Dish.class)) {
                    orders[i].addDish((Dish) item);
                } else if (item.getClass().equals(Drink.class)){
                    orders[i].addDrink((Drink) item);
                }
            }
        }
    }

    public void remove(Order order, String name){
        for (int i=0; i<size; i++){
            if (orders[i] == order){
                if (!orders[i].removeDish(name)){
                    orders[i].removeDrink(name);
                }
            }
        }
    }

    public void removeAll(Order order, String name){
        for (int i=0; i<size; i++){
            if(orders[i] == order){
                if(orders[i].removeAllDish(name) == 0){
                    orders[i].removeAllDrink(name);
                }
            }
        }
    }

    public Item[] getItems(Order order){
        int dishCount = order.dishQuantity();
        int drinkCount = order.drinkQuantity();
        Item[] items = new Item[dishCount + drinkCount];
        Dish[] dishes = new Dish[dishCount];
        Drink[] drinks = new Drink[drinkCount];
        for (int i=0; i<size; i++){
            if (orders[i] == order){
                dishes = order.getDishes();
                drinks = order.getDrinks();
            }
        }
        int curr_idx = 0;
        for (Dish dish : dishes) items[curr_idx++] = dish;
        for (Drink drink : drinks) items[curr_idx++] = drink;

        return items;
    }

    public double getCost(Order order){
        double total = 0;
        for (int i=0; i<size; i++){
            if (orders[i] == order){ total = orders[i].getTotalCost(); }
        }
        return total;
    }

    public int getQuantity(Order order) { return order.dishQuantity() +
                                                order.drinkQuantity();}
    public String[] getTitles(Order order){
        int dishCount = order.dishQuantity();
        int drinkCount = order.drinkQuantity();
        String[] items = new String[dishCount + drinkCount];
        String[] dishes = new String[dishCount];
        String[] drinks = new String[drinkCount];
        for (int i=0; i<size; i++){
            if (orders[i] == order){
                dishes = order.getDishNames();
                drinks = order.getDrinkNames();
            }
        }
        int curr_idx = 0;
        for (String dishName : dishes) items[curr_idx++] = dishName;
        for (String drinkName : drinks) items[curr_idx++] = drinkName;

        return items;
    }

    public Item[] getSorted(Order order){
        Item[] items = new Item[order.dishQuantity() + order.drinkQuantity()];
        for (int i=0; i<size; i++){
            if (orders[i] == order){
                items = orders[i].sortByCostDS();
            }
        }
        return items;
    }

    public void showOrder(Item[] order){
        for (Item item : order) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder receipt = new StringBuilder();
        for (int i=0; i< orders.length; i++){
            if (orders[i] != null) receipt.append("Order number ").append(i+1).append(":\n").append(orders[i].toString()).append("\n");
        }
        return receipt.toString();
    }
}
