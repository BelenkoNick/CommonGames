package ru.joor.games.dices;

import java.security.SecureRandom;
import java.util.Scanner;

public class HigherOrLower {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scn = new Scanner(System.in);

    private static final String prompt = "Dices are rolled. Make your bets: is if higher or lower then %s? 'higher'/'lower'";
    private static final String endPrompt = "Dices rolled %s. You said it would be %s then %s. You were %s!";

    private static int[] ints = new int[]{3, 5, 7, 9};

    public static void play() {
        int score = 0;
        int gate = ints[random.nextInt(3)];

        // roll the dices
        for (int i = 0; i < 2; i++) {
            score += random.nextInt(5) + 1;
        }
        System.out.printf((prompt) + "%n", gate);
        String input = scn.nextLine();
        if (!input.equalsIgnoreCase("higher") && !input.equalsIgnoreCase("lower") ){
            System.out.println("Input should be 'higher' or 'lower', try again!");
            return;
        }
        String result = score > gate ? "higher" : "lower";
        System.out.printf((endPrompt) + "%n", score, input, gate, result.equals(input) ? "right" : "wrong");
    }
}
