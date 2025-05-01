package prac2.task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Players count: ");
        int n = scanner.nextInt();
        if (n * 5 > 52) {
            System.out.println("Too much players. Max. of players: " + (52 / 5));
            scanner.close();
            return;
        }

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] deck = new String[52];

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[i * 4 + j] = ranks[i] + suits[j];
            }
        }

        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck[i * 5 + j] + " ");
            }
            System.out.println("\n");
        }
        scanner.close();
    }
}
