package ru.mirea.lab5;

import ru.mirea.lab5.Shape;

public class Circle extends Shape {
    protected final double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){ return this.radius;}
    @Override
    public double getArea() {return this.radius * this.radius * Math.PI;}
    @Override
    public double getPerimeter() {return this.radius * 2 * Math.PI;}
    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + "\narea: " + this.getArea() + "\nperimeter: " +
                this.getPerimeter();
    }
}
