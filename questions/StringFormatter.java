package questions;

import java.util.List;

/**
 * STAND ALONE QUESTION
 * 
 * this question is wack, so bear with me,, the solution works, but i need to upload the question 
 * seperately
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

    public static int basicGapWidth(List<String> wordList, int formattedLen){
        //your code here
        return 0;
    }

    public static int leftOverSpaces(List<String> wordList, int formattedLen){
        return formattedLen - (((wordList.size() - 1) * basicGapWidth(wordList, formattedLen)));
    }
    public static String format(List<String> wordList, int formattedLen){
        //your code here
        return "";
    }

}