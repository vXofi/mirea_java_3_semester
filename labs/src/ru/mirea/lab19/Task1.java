package ru.mirea.lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] stringArray = {"Python", ">", "Java"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("list of Strings: " + stringList);

        Integer[] numberArray = {1, 2, 3, 4, 5};
        List<Integer> numberList = convertArrayToList(numberArray);
        System.out.println("List if Integers: " + numberList);
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
