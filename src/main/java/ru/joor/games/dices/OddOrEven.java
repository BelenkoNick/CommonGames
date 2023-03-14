package ru.joor.games.dices;

import java.security.SecureRandom;
import java.util.Scanner;

public class OddOrEven {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scn = new Scanner(System.in);

    private static final String prompt = "Dices are rolled. Make your bets: is if odd or even? 'odd'/'even'";
    private static final String endPrompt = "Dices rolled %s and it's %s. You were %s!";


    public static void play() {
        int score = 0;

        // roll the dices
        for (int i = 0; i < 2; i++) {
            score += random.nextInt(5) + 1;
        }
        System.out.println(prompt);
        String input = scn.nextLine();
        if (!input.equalsIgnoreCase("even") && !input.equalsIgnoreCase("odd") ){
            System.out.println("Input should be 'odd' or 'even', try again!");
            return;
        }
        String result = score % 2 == 1 ? "odd" : "even";
        System.out.printf((endPrompt) + "%n", score, result, result.equals(input) ? "right" : "wrong");
    }
}
