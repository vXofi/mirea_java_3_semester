package ru.mirea.lab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaitListTest {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(5);
        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();

        waitList.add(10);
        waitList.add(20);
        waitList.add(30);

        boundedWaitList.add("one");
        boundedWaitList.add("two");
        boundedWaitList.add("three");
        boundedWaitList.add("four");
        boundedWaitList.add("five");
        boundedWaitList.add("six"); // won`t be added because of size boundaries

        unfairWaitList.add('A');
        unfairWaitList.add('B');
        unfairWaitList.add('C');

        System.out.println("WaitList has 20: " + waitList.contains(20));
        System.out.println("BoundedWaitList has 'two': " + boundedWaitList.contains("two"));
        System.out.println("UnfairWaitList has 'D': " + unfairWaitList.contains('D'));

        List<Integer> elements = new ArrayList<>(Arrays.asList(10, 30));
        System.out.println("WaitList has [10, 30]: " + waitList.containsAll(elements));

        System.out.println("WaitList is empty: " + waitList.isEmpty());
        System.out.println("BoundedWaitList is empty: " + boundedWaitList.isEmpty());

        unfairWaitList.moveToBack('B');

        System.out.println("WaitList contents: " + waitList);
        System.out.println("BoundedWaitList contents: " + boundedWaitList);
        System.out.println("UnfairWaitList contents: " + unfairWaitList);
    }
}