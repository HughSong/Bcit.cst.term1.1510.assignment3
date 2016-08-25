package q4;
import java.util.Scanner;

/**
 * <p>Find primes.</p>
 *
 * @author Yuheng Song
 * @version 1.0
 */
public class Primes {
    /** upper bound of the list. */
    private int n;
    /** number of prime in the list. */
    private int count;
    /** list. */
    private boolean[] primes;
    
    /**
     * Constructor: to establish the list.
     * @param upper range: 0 to upperBound.
     */
    public Primes(int upper) {
        if (upper <= 1) {
            throw new IllegalArgumentException("Your bounder is "
                    + "smaller than 2.");
        } else {
        
        n = upper;
        primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        calculatePrimes();
        }
        
    }
    
    
    /**
     * Using the Sieve of Eratosthenes to determine which indices are
     * prime and which are not.
     */
    private void calculatePrimes() {
        
        primes[0] = false;
        primes[1] = false;
        primes[2] = true;
        
        //Continue until you have reached N/2.
        for (int i = 2; i <= n / 2; i++) {
            //cross all of number which is prime's multiples.
            if (primes[i]) {
                //determine which number is prime's multiples.
                for (int remindNum = n; remindNum > i; remindNum--) {
                    //let every numbers remind this primes.
                    int m = remindNum % i;
                    //If reminder is 0, it means this number is a multiples
                    //of a primes.
                    if (m == 0) {
                        isnotPrimes(remindNum);
                    }
                }
            }
        }
    }
    /**
     * To returns true if x is prime and false if it is not.
     * @param posi the position in list.
     * @return false if it is not a prime.
     */
    private boolean isnotPrimes(int posi) {
        primes[posi] = false;
        return primes[posi];

    }
    /**
     * Prints out the list of primes you calculated.
     */
    private void printPrimes() {
        for (int i = 0; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            } 
        }
    }
   /**
    * Counting how many primes in this list.
    * @return the number of prime.
    */
    private int countPrimes() {
        for (int i = 0; i <= n; i++) {
            if (primes[i]) {
                count++;
            } 
        }
        return count;
    }
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2;
        String dete = "y";
        System.out.println("--------------PRIMES MODIFIER-------------");
        System.out.println("This program uses the sieve of Eratosthenese"
                + " to determine which numbers are prime.");
        do {
        try {
            System.out.println("Enter an upper bound: ");
            n = scan.nextInt();
            Primes mylist = new Primes(n);
            System.out.println("There are " + mylist.countPrimes() 
            + " primes.");
            System.out.println();
            mylist.printPrimes();
            dete = "n";
            scan.close();
        } catch (IllegalArgumentException ex) {
            System.out.println("SORRY, your bounder cannot be smaller than 2!");
            System.out.println("Do you want to try again?(y/n)");
            dete = scan.next();
        }
        
        } while(dete.equalsIgnoreCase("y"));
        

}
}
