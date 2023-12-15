package ru.mirea.lab4;

public class Leg {
    private final boolean isLeft;

    public Leg(boolean left){
        this.isLeft = left;
    }

    public boolean isLeft() {
        return isLeft;
    }

    @Override
    public String toString() {
        return "has " + (isLeft ? "left" : "right") + " leg\n";
    }
}
