package ru.mirea.lab12;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGameStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayerCards = scanner.nextLine()    ;
        String secondPlayerCards = scanner.nextLine();

        Stack<Integer> player1Cards = new Stack<>();
        Stack<Integer> player2Cards = new Stack<>();

        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                player1Cards.push(Character.getNumericValue(firstPlayerCards.charAt(i)));
                player2Cards.push(Character.getNumericValue(secondPlayerCards.charAt(i)));
            }
            else{
                player1Cards.push(-1);
                player2Cards.push(-1);
            }
        };

        int moves = 0;

        while (!player1Cards.isEmpty() && !player2Cards.isEmpty()) {
            int card1 = player1Cards.pop();
            int card2 = player2Cards.pop();

            if ((card1 == 0 && card2 == 9) || (card1 == 9 && card2 == 0)) {
                if (card1 == 0) {
                    player1Cards.add(0, card1);
                    player1Cards.add(0, card2);
                } else {
                    player2Cards.add(0, card1);
                    player2Cards.add(0, card2);
                }
            } else {
                if (card1 > card2) {
                    player1Cards.add(0, card1);
                    player1Cards.add(0, card2);
                } else {
                    player2Cards.add(0, card1);
                    player2Cards.add(0, card2);
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
