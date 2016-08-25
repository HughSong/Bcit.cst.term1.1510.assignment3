package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * Rock; paper; scissors game!
 * </p>
 *
 * @author Yuheng Song
 * @version 1.0
 */
public class RockPaperScissors {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     * command line arguments.
     */
    public static void main(String[] args) {
        // User's play -- "R", "P", or "S"
        String personPlay;
        // Computer's play -- "R", "P", or "S"
        String computerPlay = null;
        // Randomly generated number used to determine
        int computerInt;
        //how many times the user win.
        int winCount = 0;
        //how many times the user lose.
        int loseCount = 0;
        //how many times the user tie with computer.
        int tieCount = 0;
        /**
         * There are rock, paper, scissors; three kinds of cases.
         */
        final int cases = 3;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("--------------Rock-Paper-Scissors "
                + "game--------------"
                + "\nNotes: \"S\" is scissors; \"P\" is paper;"
                + " \"R\" is rock. "
                + "\nIf you want exit the game, just enter \"stop\".\n");
        
        do {
            // Get player's play
            System.out.println("Enter your play: R, P, or S: ");
            personPlay = scan.nextLine();
            // Make player's play uppercase for ease of comparison
            // Generate computer's play (0,1,2)
            computerInt = generator.nextInt(cases);
            // Translate computer's randomly generated play to string
            switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
            default :
                computerPlay = "S";
                break;
            }

        // Print computer's play
        System.out.println("Computer play is: " + computerPlay);
        // See who won. Use nested ifs instead of &&.
        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("It's a tie!");
            tieCount++;
        } else if (personPlay.equalsIgnoreCase("R")
                   && computerPlay.equalsIgnoreCase("S")
                   || personPlay.equalsIgnoreCase("S")
                   && computerPlay.equalsIgnoreCase("P")
                   || personPlay.equalsIgnoreCase("P")
                   && computerPlay.equalsIgnoreCase("R")) {
           
                System.out.println("Yse! You win!!");
                winCount++;
            } else {
                System.out.println("Sorry,computer win.");
                loseCount++;
            }
    } while(!personPlay.equalsIgnoreCase("stop"));
        //To print out the final result.
        System.out.println("------------------------------"
                            + "\nThe game is over!"
                            + "\nWIN: " + winCount + " times."
                            + "\nLOST: " + loseCount + " times."
                            + "\nTIE: " + tieCount + " times.");
        scan.close();
    }
}
