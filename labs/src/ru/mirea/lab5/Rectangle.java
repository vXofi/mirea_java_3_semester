package ru.mirea.lab5;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){ return this.width; }
    public void setWidth(double width){ this.width = width; }

    public double getLength(){ return this.length; }
    public void setLength(double length){ this.length = length; }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, length: " + this.length + "\nwidth:" + this.width + "\narea: " + this.getArea() +
                "\nperimeter: " + this.getPerimeter();
    }
}
