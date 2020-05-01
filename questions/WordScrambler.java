package questions;

/**
 * STAND ALONE QUESTION
 */

public class WordScrambler {

    private String[] scrambledWords;

    public WordScrambler(String[] wordArr){
        scrambledWords = wordArr;
    }   

    /**
     * rite the WordScrambler method recombine. 
     * This method returns a String created from its two String parameters as follows:
     * 
     * take the first half of word1
     * take the second half of word2
     * concatenate the two halves and return the new string
     * 
     * Note that if a word has an odd number of letters, the second half of the 
     * word contains the extra letter.
     * 
     * for example:
     * if word1 = "apple" and word2 = "pear", then the new string would be "apar"
     * or if word1 = "pear" and word2 = "apple", then the new string would be "peple"
     */
    private String recombine(String word1, String word2){
        //your code here
        return null;
    }

    /**
     * It takes the first pair of strings in words and combines them to produce a pair of strings to be 
     * included in the array returned by the method. If this pair of strings consists of w1 and w2, 
     * the method should include the result of calling recombine with w1 and w2 as arguments and should 
     * also include the result of calling recombine with w2 and w1 as arguments. The next two strings, 
     * if they exist, would form the next pair to be processed by this method. The method should continue 
     * until all the strings in words have been processed in this way and the new array has been filled. 
     * You can assume that the length of the array is even.
     *
     * For example, if the array 'words' contains the following elements:
     * {"apple", "pear", "this", "cat"}
     * then mixedWord(words) would return:
     * {"apar", "peple", "that", "cis"}
     */
    private String[] mixedWords(String[] words){
        //your code here
        return null;
    }

}