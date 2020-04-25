package solutions;

import java.util.List;

/**
 * STAND ALONE QUESTION
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

        if(numGaps == difference) return width;

        while((width * numGaps) < difference){
            width++;
        }

        if((width * numGaps) > difference){
            width--;
        }
        
        return width;
    }
    public static int leftOverSpaces(List<String> wordList, int formattedLen){
        return formattedLen - (totalLetters(wordList) + ((wordList.size() - 1) * basicGapWidth(wordList, formattedLen)));
    }
    
    public static String format(List<String> wordList, int formattedLen){
        String newString = ""; 
        int leftover = leftOverSpaces(wordList, formattedLen);
        int gap = basicGapWidth(wordList, formattedLen);
        
        System.out.println("total amt of letters = " + totalLetters(wordList));
        System.out.println("number of gaps = " + (wordList.size() - 1));
        System.out.println("basic width gap = " + gap);
        System.out.println("left over = " + leftover);

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