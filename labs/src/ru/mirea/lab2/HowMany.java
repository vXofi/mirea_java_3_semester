package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("input words, else input empty line to terminate");
        while(true){
            String nextLine = sc.nextLine();
            if (nextLine.equals("")){
                break;
            }
            for (String s : nextLine.split("\\s+")){
                counter += 1;
            }
        }
        System.out.println("number of input words: " + counter);
    }
}

