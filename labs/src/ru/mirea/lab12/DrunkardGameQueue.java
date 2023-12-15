package ru.mirea.lab12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGameQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayerCards = scanner.nextLine()    ;
        String secondPlayerCards = scanner.nextLine();

        Queue<Integer> player1Cards = new LinkedList<>();
        Queue<Integer> player2Cards = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                player1Cards.add(Character.getNumericValue(firstPlayerCards.charAt(i)));
                player2Cards.add(Character.getNumericValue(secondPlayerCards.charAt(i)));
            }
            else{
                player1Cards.add(-1);
                player2Cards.add(-1);
            }
        };


        int moves = 0;

        while (!player1Cards.isEmpty() && !player2Cards.isEmpty()) {
            int card1 = player1Cards.poll();
            int card2 = player2Cards.poll();

            if ((card1 == 0 && card2 == 9) || (card1 == 9 && card2 == 0)) {
                if (card1 == 0) {
                    player1Cards.add(card1);
                    player1Cards.add(card2);
                } else {
                    player2Cards.add(card1);
                    player2Cards.add(card2);
                }
            } else {
                if (card1 > card2) {
                    player1Cards.add(card1);
                    player1Cards.add(card2);
                } else {
                    player2Cards.add(card1);
                    player2Cards.add(card2);
                }
            }

            moves++;

            if (moves > 106) {
                System.out.println("botva");
                return;
            }
        }

        if (player1Cards.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
