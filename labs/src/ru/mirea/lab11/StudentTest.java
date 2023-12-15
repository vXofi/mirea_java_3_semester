package ru.mirea.lab11;

public class StudentTest {
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student(3), new Student(1), new Student(2)};

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getIDNumber());
        }

        insertionSort(students);

        System.out.println("After sorting:");
        for (Student student : students) {
            System.out.println(student.getIDNumber());
        }
    }
}
