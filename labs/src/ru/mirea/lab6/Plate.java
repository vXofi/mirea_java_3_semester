package ru.mirea.lab6;

public class Plate extends Dish {
    boolean hasFood;
    public Plate(){
        super();
        this.hasFood = false;
    }
    public Plate(String m, String c, boolean f, boolean hf){
        super(m, c, f);
        this.hasFood = hf;
    }

    @Override
    public String toString() {
        return super.toString() + "\nhas food:" + this.hasFood;
    }
}
