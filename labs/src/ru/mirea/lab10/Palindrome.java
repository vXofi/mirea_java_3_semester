package ru.mirea.lab10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a word: ");
        String word = scanner.nextLine();

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word, int start, int end)  {
        if (start >= end) {
            return true;
        } else if (word.charAt(start) != word.charAt(end)) {
            return false;
        } else {
            return isPalindrome(word, start + 1, end - 1);
        }
    }
}
