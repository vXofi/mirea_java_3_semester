package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getIDNumber() < list2.get(j).getIDNumber()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(3));
        list1.add(new Student(5));
        list1.add(new Student(8));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1));
        list2.add(new Student(4));
        list2.add(new Student(7));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student.getIDNumber());
        }
    }
}
