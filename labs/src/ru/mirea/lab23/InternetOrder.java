package ru.mirea.lab23;

import java.util.*;


public class InternetOrder{
    private LinkedList<Item> items;

    public InternetOrder(){
        this.items = new LinkedList<>();
    }

    public InternetOrder(LinkedList<Item> order){
        this.items = order;
    }

    public boolean addPosition(Item item){
        items.add(item);
        return true;
    }

    public boolean remove(String food) {
        for(int i = items.size()-1; i >= 0; i--){
            if(Objects.equals(items.get(i).getName(), food)){
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public int removeAll(String name) { // delete all positions with this name, return number of deleted items
        Iterator<Item> iterator = items.iterator();
        int cc = 0;

        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equals(name)) {
                iterator.remove();
                cc++;
            }
        }
        return cc;
    }

    public Item[] getItems(){
        //Item[] all = new Item[items.size()];
        //for (int i=0; i<items.size(); i++){ all[i] = items.get(i); }
        //return all;
        return (Item[]) items.toArray();
    }

    public int count(){ //add parameter: name
        return items.size();
    }

    public int costTotal() {
        int sum = 0;
        for (Item item : items) sum += item.getCost();
        return sum;
    }

    public int count(String name){ //add parameter: name
        int counter = 0;
        for (Item item : items){
            if (item.getName().equals(name)) { counter++; }
        }
        return counter;
    }

    public String[] receipt(String name){ //array of dishes and drinks
        String[] str = new String[items.size()];
        for (int i = 0; i < items.size(); i++)
            str[i] = items.get(i).getName() + " " + items.get(i).getDescription() + " " + items.get(i).getCost();
        return str;
    }

    public Item[] sortByCostDS(){
        Item[] all = new Item[items.size()];
        for (int i=0; i<items.size(); i++){ all[i] = items.get(i); }
        Arrays.sort(all, Comparator.comparing(Item::getCost).reversed());
        return all;
    }

    @Override
    public String toString(){
        StringBuilder receipt = new StringBuilder();
        for (int i=0; i< items.size(); i++){
            if (items.get(i) != null) receipt.append("Order number ").append(i+1).append(":\n").append(items.get(i).toString()).append("\n");
        }
        return receipt.toString();
    }
}