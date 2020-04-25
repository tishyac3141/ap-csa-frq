package questions;

import java.util.List;

/**
 * STAND ALONE QUESTION
 * 
 * This question involves the process of taking a list of words, called wordList, and 
 * producing a formatted string of a specified length. The list wordList contains at least two words.
 * 
 * When the formatted string is constructed, spaces are placed in the gaps between words so 
 * that as many spaces as possible are evenly distributed to each gap. The equal number of spaces 
 * inserted into each gap is referred to as the basic gap width. Any leftover spaces are inserted 
 * one at a time into the gaps from left to right until there are no more leftover spaces.
 * 
 * to view examples of what this class is supposed to do, click on these links:
 * In each example, the list of words is to be placed into a formatted string of length 20.
 * 
 * Example 1: https://drive.google.com/file/d/1fWbE0-4Q09OHKYYzNij-alfCfo8wrKKa/view?usp=sharing
 * Example 2: https://drive.google.com/file/d/1aAAHWtNwjLotInkTiameBoevcLhMkhPw/view?usp=sharing
 * Example 3: https://drive.google.com/file/d/1iVToap-0-2BA_IlKI9h2_uHkgMsVN0YX/view?usp=sharing
 */


public class StringFormatter {

    /**
     * Write the StringFormatter method totalLetters, which returns the total number of letters 
     * in the words in its parameter wordList. For example, if the variable List<String> words is 
     * ["A", "frog", "is"], then the call StringFormatter.totalLetters(words) returns 7. 
     * You may assume that all words in wordList consist of one or more letters.
     */
    public static int totalLetters(List<String> wordList){
        //your code here
        return 0;
    }

    /**
     * Write the StringFormatter method basicGapWidth, which returns the basic gap width as defined earlier.
     * Assume that totalLetters works as specified regardless of what you wrote in part (a). 
     * You must use totalLetters appropriately to receive full credit.
     */
    public static int basicGapWidth(List<String> wordList, int formattedLen){
        //your code here
        return 0;
    }

    /**
     * Inluded method.
     */
    public static int leftOverSpaces(List<String> wordList, int formattedLen){
        return formattedLen - (((wordList.size() - 1) * basicGapWidth(wordList, formattedLen)));
    }

    /**
     * Write the StringFormatter method format, which returns the formatted string as defined earlier. 
     * The StringFormatter class also contains a method called leftoverSpaces, 
     * which has already been implemented. This method returns the number of leftover spaces as 
     * defined earlier and is shown above.
     */
    public static String format(List<String> wordList, int formattedLen){
        //your code here
        return "";
    }

}