package q3;

/**
 * Represents a street address.
 * @author Yuheng Song(Hugh)
 * @version 1
 */
public class Address {
    /** Street address. */
    private String streetAddress = "3700 Willingdon Ave.";
    /** city. */
    private String city = "Burnaby";
    /** State. */
    private String state = "BC";
    /** Postal code, any country. */
    private String postalCode = "V5G 3H2";
    /**
     * Constructor: Sets up this address with the specified data.
     *
     * @param street
     *        Holds new streetAddress
     * @param town
     *        Holds new city
     * @param st
     *        Holds new state
     * @param code
     *        Holds new postalCode
     */
    public Address(String street, String town, String st, String code) {
        streetAddress = street;
        city = town;
        state = st;
        postalCode = code;
    }

    /**
     * Returns a description of this Address object.
     * @return formatted value of streetAddress, city, state, zipCode
     */
    public String toString() {
        String result;

        result = streetAddress + "\n";
        result += city + ", " + state + "  " + postalCode;

        return result;
    }
}
