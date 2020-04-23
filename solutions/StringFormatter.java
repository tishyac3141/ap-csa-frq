package solutions;

import java.util.List;

/**
 * STAND ALONE QUESTION
 * 
 * work in progress; does not work
 */

public class StringFormatter {

    public static int totalLetters(List<String> wordList){
        int count = 0;
        for(int i = 0; i < wordList.size(); i++){
            
           count += wordList.get(i).length();
        }

        return count;
    }
    public static int basicGapWidth(List<String> wordList, int formattedLen){
        int width = 1;
        int amtLetters = totalLetters(wordList);
        int difference = formattedLen - amtLetters; 
        int numGaps = wordList.size() - 1;

        while(numGaps < difference){
            width++;
            difference += numGaps;
        }

        width--;
        return width;
    }
    public static int leftOverSpaces(List<String> wordList, int formattedLen){
        return formattedLen - (((wordList.size() - 1) * basicGapWidth(wordList, formattedLen)));
    }
    
    public static String format(List<String> wordList, int formattedLen){
        String newString = ""; 
        int leftover = leftOverSpaces(wordList, formattedLen);
        int gap = basicGapWidth(wordList, formattedLen);

        for(int i = 0; i < wordList.size(); i++){
            newString += wordList.get(i);
            if(leftover > 0){
                newString += " ";
                leftover--;
            }
            for(int j = 0; j < gap; j++){
                newString += " ";
            }

        }

        return newString;

    }

}