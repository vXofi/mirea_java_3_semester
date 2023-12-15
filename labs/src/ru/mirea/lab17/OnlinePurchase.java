package ru.mirea.lab17;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Input ITN number: ");
        String inn = scanner.nextLine();

        try {
            validateInn(inn);
            System.out.println("ITN is valid. Order is completed for " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("invalid ITN: " + e.getMessage());
        }
    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() != 10) {
            throw new InvalidInnException("Invalid ITN length");
        }

        if (!inn.matches("\\d+")) {
            throw new InvalidInnException("Invalid ITN: non integer symbols found");
        }
    }
}

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}
