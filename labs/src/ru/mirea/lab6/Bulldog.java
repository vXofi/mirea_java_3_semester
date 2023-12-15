package ru.mirea.lab6;

public class Bulldog extends Dog{

    public Bulldog(String name, int age) {
        super(name, "medium", age);
    }

    public String getBreed() {
        return "Bulldog";
    }
    @Override
    public String toString() {
        return super.toString() + "\nbreed: " + this.getBreed();
    }

}
