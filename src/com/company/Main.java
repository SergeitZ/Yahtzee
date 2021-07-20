package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cup myCup = new Cup();
        Scanner scanner = new Scanner(System.in);
        String input;

        myCup.roll();
        System.out.println(myCup.displayCup());
        System.out.println("Select dice do you want to re-roll (1-5)");
        input = scanner.nextLine();
        myCup.roll(myCup.parseSelections(input));
        System.out.println(myCup.displayCup());
    }
}
