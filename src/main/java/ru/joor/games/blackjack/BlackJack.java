package ru.joor.games.blackjack;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scn = new Scanner(System.in);

    private static final String prompt = "You got %s in your hand. Total score is %s.\nDo you wish to get another one? 'y'/'n'";
    private static final String endPrompt = "Game over. Total score is %s. You have %s.";

    private static final int[] deck = new int[]{2, 3, 4, 6, 7, 8, 9, 10, 11};
    private static final ArrayList<Integer> hand = new ArrayList<>();
    private static int score = 0;

    public static void play() {
        boolean isOn = true;

        // starting hand
        for (int i = 0; i < 2; i++) {
            dealCards();
        }
        // main game loop
        while (isOn) {
            System.out.printf((prompt) + "%n", hand, score);
            String input = scn.nextLine();
            if (input.equalsIgnoreCase("y")) {
                dealCards();
            } else if (input.equalsIgnoreCase("n")){
                isOn = false;
            } else {
                System.out.println("Input should be 'y' or 'n', try again!");
            }
        }
        System.out.printf((endPrompt) + "%n", score, score <= 21 ? "won" : "lost");
    }

    private static void dealCards() {
        int card = deck[random.nextInt(9)];
        hand.add(card);
        score += (card);
    }
}
