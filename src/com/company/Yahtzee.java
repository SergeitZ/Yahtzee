package com.company;
import java.util.Scanner;

public class Yahtzee {
//    public Cup myCup = new Cup();
    public Player player;
    private final Scanner scanner = new Scanner(System.in);

    public Yahtzee() {
        System.out.println("What is your name?");
        String name = (scanner.nextLine().trim());
        player = new Player(name);
    }

    // TODO: refactor play to run 5 turns then display total score.
    public void play() {
        turn();
    }

    public void getSelections() {
        System.out.println("select dice you want to re-roll (1-5)");
        String input = scanner.nextLine();
        player.cup.roll(player.cup.parseSelections(input));

    }
    // TODO: refactor turn to update score and display round score.
    public void turn() {
        player.cup.roll();

        for (int i = 0; i < 2; i++) {
            System.out.println(player.cup.displayCup());
            getSelections();

        }

        System.out.println(player.cup.displayCup());
    }

}
