package q3;

/**
 * Represents a college student.
 * @author Yuheng Song(Hugh)
 * @version 1
 */
public class Student {
    /** First name of this student. */
    private String firstName;
    /** Last name of this student. */
    private String lastName;
    /** Home address of this student. */
    private Address homeAddress;
    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    /** Score for first test. */
    private double score1;
    /** Score for second test. */
    private double score2;
    /** Score for third test. */
    private double score3;
    /** Average score. */
    private double average;
    /** Total number of tests. */
    private final int total = 3;

    /**
     * Constructor: Sets up this student with the specified values.
     * @param first first name.
     * @param last last name.
     * @param home address of the home.
     * @param school address of the school.
     * @param score1 how many marks the student gets in test1.
     * @param score2 how many marks the student gets in test2.
     * @param score3 how many marks the student gets in test3.
     */
    public Student(String first, String last, Address home,
            Address school, double score1, double score2, double score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    /**
     * Constructor: Sets up this student who live in school with the
     * initial score 0.
     */
    public Student() {
        firstName = "Hannah";
        lastName = "Jones";
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }
    
    /**
     * To set up students' scores.
     * @param testNum Which test dose the student take.
     * @param score How many marks dose the student get in this test.
     */
    public void setTestScore(int testNum, double score) {
        if (testNum == 1) {
            score1 = score;
        } else if (testNum == 2) {
            score2 = score;
        } else {
            score3 = score;
        }
    }
    
    /**
     * To get students's scores according to test number.
     * @param testNum Which test dose the student take.
     * @return score
     */
    public double getTestScore(int testNum) {
        if (testNum == 1) {
            return score1;
        } else if (testNum == 2) {
            return score2;
        } else {
            return score3;
        }
    }
    
    /**
     * To compute the average score of a student.
     * @return average score
     */
    public double average() {
        average = (this.score1 + this.score2 + this.score3) / total;
        return average;
    }

    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test 1: " + score1 + "\n";
        result += "Test 2: " + score2 + "\n";
        result += "Test 3: " + score3 + "\n";
        result += "The average score is: " + average;

        return result;
    }
}
