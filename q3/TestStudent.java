package q3;



/**
 * <p>Testing student.</p>
 *
 * @author Yuheng Song(Hugh)
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //Hugh's grade in 1st test.
        final double hughScore1 = 99;
        //Hugh's grade in 2nd test.
        final double hughScore2 = 100;
        //Hugh's grade in 3rd test.
        final double hughScore3 = 95;
        //Marsha's grade in 1st test.
        final double mScore1 = 90;
        //Marsha's grade in 2nd test.
        final double mScore2 = 88.8;
        //Marsha's grade in 3rd test.
        final double mScore3 = 92;
        //Hannah's grade in 1st test.
        final double hScore1 = 97;
        //Hannah's grade in 2nd test.
        final double hScore2 = 95;
        //Hannah's grade in 3rd test.
        final double hScore3 = 77;
        //To represent the 3rd test.
        final int testNum = 3;
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                "V5G 3H2");

        Address sHome = new Address("21 Jump Street", "Langley", "BC",
                    "V3A 6K6");
        Student hugh = new Student("Hugh", "Song", sHome, school,
                hughScore1, hughScore2, hughScore3);
        hugh.average();
        
        Address mHome = new Address("123 Main Street", "North Pole", "NU",
                    "H0H 0H0");
        Student marsha = new Student("Marsha", "Jones", mHome, school,
                mScore1, mScore2, mScore3);
        marsha.average();
        
        Student hannah = new Student();
        hannah.setTestScore(1, hScore1);
        hannah.setTestScore(2, hScore2);
        hannah.setTestScore(testNum, hScore3);

        System.out.println(hugh);
        System.out.println("----------------------------");
        System.out.println(marsha);
        System.out.println("----------------------------");
        System.out.println("Hannah Jane");
        System.out.println("Test 1: " + hannah.getTestScore(1));
        System.out.println("Test 2: " + hannah.getTestScore(2));
        System.out.println("Test 3: " + hannah.getTestScore(testNum));
        System.out.println("The average score is: " + hannah.average());
    }

}
