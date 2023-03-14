package ru.joor.games;

import ru.joor.games.blackjack.BlackJack;
import ru.joor.games.dices.HigherOrLower;
import ru.joor.games.dices.OddOrEven;

import java.util.Scanner;

public class App {

    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose which game to play:\n" +
                "1 - BlackJack\n" +
                "2 - Dices. OddOrEven\n" +
                "3 - Dices. HigherOrLower\n");
        switch (Integer.parseInt(scn.nextLine())) {
            case(1):
                BlackJack.play();
                break;
            case(2):
                OddOrEven.play();
                break;
            case(3):
                HigherOrLower.play();
                break;
        }
    }
}
