package ru.mirea.lab11;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);
        return i + 1;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }
}
