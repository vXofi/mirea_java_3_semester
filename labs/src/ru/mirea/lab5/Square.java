package ru.mirea.lab5;

public class Square extends Rectangle {
    public Square(){
        this.width = 0;
        this.length = 0;
    }
    public Square(double side){
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){ return this.width; }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.getSide() + "\narea: " + this.getArea() +
                "\nperimeter: " + this.getPerimeter();
    }
}
