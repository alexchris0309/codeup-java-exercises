import com.sun.source.util.SourcePositions;

import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class HighLow {


    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win=false;

        while(win==false) {
            System.out.println("guess a number between 1-100");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win=true;

            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too High");


            }
        }

        System.out.println("You win!");
        System.out.println("the number was " + numberToGuess);
        System.out.println("It took you "+ numberOfTries + " tries");

    }
}
