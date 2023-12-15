package ru.mirea.lab4;

public class Circle {
    private static final double pi = Math.PI;
    private double rad, area, circ;

    public Circle(double r){
        this.rad = r;
        this.area = rad * rad * pi;
        this.circ = 2 * rad * pi;
    }

    public void setRad(double r){
        this.rad = r;
        this.area = rad * rad * pi;
        this.circ = 2 * rad * pi;
    }

    public double getRad(){ return rad;}
    public double getArea() {return area;}
    public double getCircumference() {return circ;}
}
