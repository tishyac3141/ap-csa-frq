package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * STAND ALONE QUESTION
 */

public class Scramble {

    public static String scrambleWord(String word){
        if(word.length() == 0) return "";

        String newWord = "";

        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(i) == 'A'){

                if(word.charAt(i + 1) != 'A'){
                    newWord += word.charAt(i + 1);
                    newWord += word.charAt(i);
                    i++;
                }   
            }
            else{
                newWord += word.charAt(i);
            }
        }
        if(newWord.length() < word.length()){
            newWord += word.charAt(word.length() - 1);
        }
        return newWord;
    }

    public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList){
        
        String scrambledWord = "";
        
        for(int i = 0; i < wordList.size(); i++){
            scrambledWord = scrambleWord(wordList.get(i));

            if(scrambledWord.equals(wordList.get(i))){
                wordList.remove(i);
                i--;
            }
            else{
                wordList.set(i, scrambledWord);
            }

        }

        return wordList;
    }
}