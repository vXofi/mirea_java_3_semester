package ru.mirea.lab23;

import java.util.Objects;



public final class Drink implements Item{
    private double cost;
    private String name, description;

    public Drink(String name, String description) throws IllegalArgumentException{
        this.cost = DEFAULT_COST;
        this.name = name;
        this.description = description;
    }

    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public void setCost(double cost) { this.cost = cost; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String getName() { return name; }
    @Override
    public double getCost() { return cost; }
    @Override
    public String getDescription() { return description; }

    @Override
    public String toString() {return "Drink:" + this.getName() +
                                    ", cost: " + this.getCost() +
                                    ", description: " + this.getDescription(); }
    static double DEFAULT_COST = 0;
}