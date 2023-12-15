package ru.mirea.lab12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayerCards = scanner.nextLine()    ;
        String secondPlayerCards = scanner.nextLine();

        Deque<Integer> firstPlayerDeck = new ArrayDeque<>();
        Deque<Integer> secondPlayerDeck = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                firstPlayerDeck.addLast(Character.getNumericValue(firstPlayerCards.charAt(i)));
                secondPlayerDeck.addLast(Character.getNumericValue(secondPlayerCards.charAt(i)));
            }
            else{
                firstPlayerDeck.addLast(-1);
                secondPlayerDeck.addLast(-1);
            }
        };

        int moves = 0;

        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {
            int card1 = firstPlayerDeck.pop();
            int card2 = secondPlayerDeck.pop();

            if ((card1 == 0 && card2 == 9) || (card1 == 9 && card2 == 0)) {
                if (card1 == 0) {
                    firstPlayerDeck.addLast(card1);
                    firstPlayerDeck.addLast(card2);
                } else {
                    secondPlayerDeck.addLast(card1);
                    secondPlayerDeck.addLast(card2);
                }
            } else {
                if (card1 > card2) {
                    firstPlayerDeck.addLast(card1);
                    firstPlayerDeck.addLast(card2);
                } else {
                    secondPlayerDeck.addLast(card1);
                    secondPlayerDeck.addLast(card2);
                }
            }

            moves++;

            if (moves > 106) {
                System.out.println("botva");
                return;
            }
        }

        if (firstPlayerDeck.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
