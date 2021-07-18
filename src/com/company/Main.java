package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();

        boolean didWin = true;

        while (didWin) {
            die1.roll();
            die2.roll();
            int total = die1.faceUpValue + die2.faceUpValue;

            System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (total));
            System.out.println("Will the next number be (h)igher or (l)ower?");
            String input = scanner.next();

            die1.roll();
            die2.roll();
            int newTotal = die1.faceUpValue + die2.faceUpValue;
            if (total == newTotal) {
                System.out.println("same number you lose");
            }

            boolean isLarger = newTotal > total;
            System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (newTotal));
            System.out.println(isLarger ? "Number is higher" : "Number is lower");
            if (input.equals("l")) { //guessed higher
                if (isLarger || newTotal == total) {
                    didWin = false;
                }
            } else { //guessed lower
                if (!isLarger) {
                    didWin = false;
                }
            }
            System.out.println(didWin ? "you WIN" : "You LOSE");
        }
        scanner.close();
    }
}
