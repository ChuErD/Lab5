//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /** what the heck is a enum? */
    public enum BankAccountType {
        /** sdfasd. */
        CHECKINGS,
        /** sdfsad. */
        SAVINGS,
        /** sdfasdf. */
        STUDENT,
        /** dsfadsf. */
        WORKPLACE,
    }

    /** sdafads. */
    private int accountNumber;
    /** sdfasdf. */
    private BankAccountType accountType;
    /** sdfasdf. */
    private double accountBalance;
    /** sdfasdf. */
    private String ownerName;
    /** sadfsdaffs. */
    private double interestRate;
    /** sdafsdfa. */
    private double interestEarned;

    /**
     * @param name sdfasdfa.
     * @param accountCategory sdfasdfasf.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
