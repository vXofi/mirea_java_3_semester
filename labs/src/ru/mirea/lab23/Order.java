package ru.mirea.lab23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Order{
    private int drinkSize, dishSize;
    private Dish[] dishes;
    private Drink[] drinks;

    public Order(int dishSize, int drinkSize){
        this.dishSize = dishSize;
        this.drinkSize = drinkSize;
        try{
            dishes = new Dish[dishSize];
            drinks = new Drink[drinkSize];
            for (int i=0; i<dishSize; i++) dishes[i] = null;
            for (int i=0; i<drinkSize; i++) drinks[i] = null;
        } catch (Exception e) {
            System.out.println("invalid array length");
        }
    }

    public boolean addDrink(Drink drink){
        if (this.drinkQuantity() < drinkSize){
            for (int i=0; i<drinkSize; i++){
                if(Objects.equals(drinks[i], null)){
                    drinks[i] = drink;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean addDish(Dish dish){
        if (this.dishQuantity() < dishSize){
            for (int i=0; i<dishSize; i++){
                if(Objects.equals(dishes[i], null)){
                    dishes[i] = dish;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeDish(String name){
        for(int i = dishSize-1; i >= 0; i--){
            if(Objects.equals(dishes[i].getName(), name)){
                dishes[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean removeDrink(String name){
        for(int i = drinkSize-1; i >= 0; i--){
            if(Objects.equals(drinks[i].getName(), name)){
                drinks[i] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAllDrink(String name){
        int cc = 0;
        for (int i=0; i<drinkSize; i++){
            if(Objects.equals(drinks[i].getName(), name)){
                drinks[i] = null;
                cc++;
            }
        }
        return cc;
    }
    public int removeAllDish(String name){
        int cc = 0;
        for (int i=0; i<dishSize; i++){
            if(Objects.equals(dishes[i].getName(), name)){
                dishes[i] = null;
                cc++;
            }
        }
        return cc;
    }

    public int drinkQuantity(){
        int cc = 0;
        for (int i=0; i<drinkSize; i++){
            if(!Objects.equals(drinks[i], null)){
                cc++;
            }
        }
        return cc;
    }
    public int drinkQuantity(String name){
        int cc = 0;
        for (int i=0; i<drinkSize; i++){
            if(Objects.equals(drinks[i].getName(), name)){
                cc++;
            }
        }
        return cc;
    }

    public int dishQuantity(){
        int cc = 0;
        for (int i=0; i<dishSize; i++){
            if(!Objects.equals(dishes[i], null)){
                cc++;
            }
        }
        return cc;
    }
    public int dishQuantity(String name){
        int cc = 0;
        for (int i=0; i<dishSize; i++){
            if(Objects.equals(dishes[i].getName(), name)){
                cc++;
            }
        }
        return cc;
    }

    public Drink[] getDrinks(){ return drinks; }
    public Dish[] getDishes(){ return dishes; }

    public double getTotalCost(){
        double result = 0;
        for(Dish dish : dishes){
            if(!Objects.equals(dish, null)){ result += dish.getCost(); }
        }
        for(Drink drink : drinks){
            if(!Objects.equals(drink, null)){ result += drink.getCost(); }
        }
        return result;
    }

    public String[] getDishNames(){
        int length = this.dishQuantity();
        String[] names = new String[length];
        int curr_idx = 0;
        for (Dish dish : dishes){
            if (!Objects.equals(dish, null)) { names[curr_idx++] = dish.getName(); }
        }
        return names;
    }

    public String[] getDrinkNames(){
        int length = this.drinkQuantity();
        String[] names = new String[length];
        int curr_idx = 0;
        for (Drink drink : drinks){
            if (!Objects.equals(drink, null)) { names[curr_idx++] = drink.getName(); }
        }
        return names;
    }

    public Item[] sortByCostDS(){
        Item[] items = new Item[this.dishQuantity() + this.drinkQuantity()];
        int curr_idx = 0;
        for (Drink drink : drinks) items[curr_idx++] = drink;
        for (Dish dish : dishes) items[curr_idx++] = dish;
        Arrays.sort(items, Comparator.comparing(Item::getCost).reversed());
        return items;
    }

    @Override
    public String toString(){
        StringBuilder totalOrder = new StringBuilder();
        Dish[] dishItems = this.getDishes();
        Drink[] drinkItems = this.getDrinks();
        for (Drink drink : drinkItems){
            if (drink != null){ totalOrder.append(drink.toString()).append("\n"); }
        }
        for (Dish dish : dishItems){
            if (dish != null){ totalOrder.append(dish.toString()).append("\n"); }
        }
        return totalOrder.toString();
    }
}