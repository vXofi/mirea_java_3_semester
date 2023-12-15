package ru.mirea.lab4;

public class Arm {
    private final boolean isLeft;

    public Arm(boolean left){
        this.isLeft = left;
    }

    public boolean isLeft() {
        return isLeft;
    }

    @Override
    public String toString() {
        return "has " + (isLeft ? "left" : "right") + " arm\n";
    }
}
