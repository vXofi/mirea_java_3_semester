package ru.mirea.lab16;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        /*
        boolean next = false;
        do {
            next = false;
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try{
                printDetails(key);
            }catch (Exception e){
                next = true;
            }
        }while (next);
         */
        for (int i=0; i<2; i++){
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try{
                printDetails(key);
            }catch (Exception e){
                continue;
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo8 td = new ThrowsDemo8();
        td.getKey();
    }
}
