package ru.mirea.lab6;

public class Glass extends Dish {
    boolean hasDrink;
    public Glass(){
        super();
        this.hasDrink = false;
    }
    public Glass(String m, String c, boolean f, boolean hf){
        super(m, c, f);
        this.hasDrink = hf;
    }

    @Override
    public String toString() {
        return super.toString() + "\nhas drink:" + this.hasDrink;
    }

}
