package ru.mirea.lab18;

import java.io.Serializable;

class Animal {}
class Special extends Animal implements Serializable {}

public class Task3<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variable1;
    private V variable2;
    private K variable3;

    public Task3(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void printClassNames() {
        System.out.println("Class of variable1: " + variable1.getClass().getName());
        System.out.println("Class of variable2: " + variable2.getClass().getName());
        System.out.println("Class of variable3: " + variable3.getClass().getName());
    }

    public static void main(String[] args) {
        Special obb = new Special();
        Task3<Integer, Special, Double> myObject = new Task3<>(3, obb, 3.14);
        myObject.printClassNames();
    }
}