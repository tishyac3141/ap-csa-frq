package questions;

/**
 * STAND ALONE QUESTION
 * 
 * A mathematical sequence is an ordered list of numbers. 
 * This question involves a sequence called a hailstone sequence. If n is the value of a term in the
 * sequence, then the following rules are used to find the next term:
 * 
 * if n = 1, the sequence terminates
 * if n is even, then the next term is n/2
 * if n is odd, then the next term is 3n+1
 * 
 * The following are examples of hailstone sequences:
 * 
 * Example 1: 5, 16, 8, 4, 2, 1
 * 
 * The first term is 5, so the second term is  5 * 3 + 1 = 16 
 * The second term is 16, so the third term is  16 / 2 = 8 
 * The third term is 8, so the fourth term is  8/ 2 = 4 
 * The fourth term is 4, so the fifth term is  4 / 2 = 2 
 * The fifth term is 2, so the sixth term is  2 / 2 = 1 
 * Since the sixth term is 1, the sequence terminates.
 * 
 * Example 2: Example 2: 8, 4, 2, 1
 * 
 * The first term is 8, so the second term is  8 / 2 = 4 
 * The second term is 4, so the third term is  4 / 2 = 2 
 * The third term is 2, so the fourth term is  2 / 2 = 1 
 * Since the fourth term is 1, the sequence terminates.
 */

public class Hailstone {

    /**
     * The length of a hailstone sequence is the number of terms it contains. 
     * For example, the hailstone sequence in example 1 (5, 16, 8, 4, 2, 1) has a length of 6 
     * and the hailstone sequence in example 2 (8, 4, 2, 1) has a length of 4.
     * 
     * Write the method hailstoneLength(int n), which returns the 
     * length of the hailstone sequence that starts with n.
     */

    public static int hailstoneLength(int n) {  
        //your code here
        return 0;
    }
        
    /**
     * A hailstone sequence is considered long if its length is greater than its starting value. 
     * For example, the hailstone sequence in example 1 (5, 16, 8, 4, 2, 1) is considered long 
     * because its length (6) is greater than its starting value (5). The hailstone sequence in 
     * example 2 (8, 4, 2, 1) is not considered long because its length (4) is less than or equal 
     * to its starting value (8).
     * 
     * Write the method isLongSeq(int n), which returns true if the hailstone sequence starting 
     * with n is considered long and returns false otherwise. Assume that hailstoneLength works as intended,
     * regardless of what you wrote in part (a). You must use hailstoneLength() 
     * appropriately to receive full credit.
     * 
     * returns true is the length is greater than the starting value and false if not
     */
    public static boolean isLongSeq(int n) { 
        //your code here
        return false;
    }

    /**
     * The method propLong(int n) returns the proportion of long hailstone sequences with starting 
     * values between 1 and n, inclusive.
     * 
     * For example, if 10 were passed into this method, then it would test whether or not the sequence
     * is 'long' (as defined in part b) for each value between 1 and 10, inclusive.
     * The method would return the amount of times the sequence was long divided by the total amount
     * of sequences tested.
     * 
     * In this case, 5 of the 10 sequences were long, so the method would return 0.5.
     * 
     * Write the propLong method. Assume that hailstoneLength and isLongSeq work as intended, 
     * regardless of what you wrote in parts (a) and (b). You must use isLongSeq appropriately to 
     * receive full credit.
     */
    public static double propLong(int n) {  
        //your code here
        return 0;
    }


}