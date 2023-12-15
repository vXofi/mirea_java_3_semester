package ru.mirea.lab19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        String directoryPath = "D:\\mirea_java_3_semester\\labs\\src\\ru\\mirea\\lab19";
        List<String> fileList = getDirectoryListing(directoryPath);

        System.out.println("First 5 elements of the directory contents:");
        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }

    public static List<String> getDirectoryListing(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            }
        } else {
            System.out.println("Directory is not existing");
        }

        return fileList;
    }
}
