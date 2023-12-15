package ru.mirea.lab19;

public class Task3 {
    public static void main(String[] args) {
        String[] stringArray = {"Python", ">", "Java"};
        int index1 = 1;
        String element1 = getElementAtIndex(stringArray, index1);
        System.out.println("array element by index " + index1 + ": " + element1);
        Integer[] numberArray = {1, 2, 3, 4, 5};
        int index2 = 3;
        Integer element2 = getElementAtIndex(numberArray, index2);
        System.out.println("array element by index " + index2 + ": " + element2);
    }

    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
    }
}