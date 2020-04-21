package questions;

import java.util.List;

/**
 * STAND ALONE QUESTION
 * 
 * This question involves reasoning about strings made up of uppercase letters.
 * You will implement two related methods that appear in the same class (not
 * shown). The first method takes a single string parameter and returns a
 * scrambled version of that string. The second method takes a list of strings
 * and modifies the list by scrambling each entry in the list. Any entry that
 * cannot be scrambled is removed from the list.
 * 
 */

public class Scramble {

    /**
     * Write the method scrambleWord, which takes a given word and returns a string that contains 
     * a scrambled version of the word according to the following rules:
     * 
     * The scrambling process begins at the first letter of the word and continues from left to right.
     * 
     * If two consecutive letters consist of an "A" followed by a letter that is not an "A", then the 
     * two letters are swapped in the resulting string.
     * 
     * Once the letters in two adjacent positions have been swapped, neither of those two positions 
     * can be involved in a future swap.
     * 
     * For example:
     * 
     * "TAN" -> "TNA"
     * "ABRACADABRA" -> "BARCADABARA"
     * "WHOA" -> "WHOA"
     * "EGGS" -> "EGGS"
     * "A" -> "A"
     * "" -> ""
     * 
     */
    public static String scrambleWord(String word){
        //your code here
        return null;
    }

    /**
     * Write the method scrambleOrRemove, which replaces each word in the parameter wordList with its 
     * scrambled version and removes any words that are unchanged after scrambling. The relative ordering 
     * of the entries in wordList remains the same as before the call to scrambleOrRemove. You should be 
     * modifying 'wordList' itself and not have to create an additional list.
     * 
     * The following example shows how the contents of wordList would be modified as a result of 
     * calling 'scrambleOrRemove()'.
     * 
     * Before: {"TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"}
     * 
     * After: {"TNA", "BARCADABARA", "PAPLE"}
     * 
     * Assume that scrambleWord is in the same class as scrambleOrRemove and works as specified, 
     * regardless of what you wrote in part (a).
     */
    public static void scrambleOrRemove(List<String> wordList){

    }

}