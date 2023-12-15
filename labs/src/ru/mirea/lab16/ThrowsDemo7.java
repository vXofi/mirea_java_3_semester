package ru.mirea.lab16;

import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
        } catch (Exception e) {
            e.printStackTrace();
            key = "default";
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo7 td = new ThrowsDemo7();
        td.getKey();
    }
}
