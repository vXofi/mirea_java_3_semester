package ru.mirea.lab19;

public class Task2<T> {
    private T[] array;

    public Task2(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Task2<Integer> intArray = new Task2<>(5);
        intArray.set(0, 10);
        intArray.set(1, 20);
        intArray.set(2, 30);

        int value = intArray.get(1);
        System.out.println("Value at index 1: " + value);

        Task2<String> stringArray = new Task2<>(3);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");

        String str = stringArray.get(0);
        System.out.println("String at index 0: " + str);
    }
}
