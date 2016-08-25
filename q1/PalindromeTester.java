package q1;
import java.util.Scanner;

/**
 * <p>To determine whether the sentence is a palindrome.</p>
 * @author Yuheng Song
 * @version 1.0
 */
public class PalindromeTester {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //The sentence which user enter.
        String sentence;
        //How long is half of the sentence.
        int middleIndex;
        //How long is the sentence.
        int length;
        //determine whether the characters are same.
        int dete = 1;
        //The characters in first half of the sentence.
        char char1;
        //The characters in last half of the sentence.
        char char2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("#--------PALINDROME MODIFIER--------#");
        System.out.println();
        //let users to enter a sentence.
        System.out.println("Please enter your sentence: ");
        sentence = scan.nextLine();
        //recheck the sentence.
        System.out.println("\n Your sentence is:\n" + sentence);
        System.out.println();
        
        //To remove all of puncuations and space by using regular expression.
        sentence = sentence.replaceAll("[\\p{Punct}\\p{Space}]", "");
        
        sentence = sentence.toLowerCase();
        length = sentence.length();
        middleIndex = length / 2;
        
        for (int i = 0; i < middleIndex; i++) {
            char1 = sentence.charAt(i);
            char2 = sentence.charAt(length - i - 1);
            if (char1 == char2) {
                dete = 0;
            } else {
                dete = 1;
            }
            
            
        }
       
        // Determine whether the sentence is a palindrome.
        if (dete == 0) {
            System.out.println("Result of modifing: \n"
                    + "Yes, this sentence is a palindrome.");
        } else {
            System.out.println("Result of modifing: \n"
                    + "Sorry, this sentence is not a palindrome.");
        }
       
        scan.close();
    }

}
