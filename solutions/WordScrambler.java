package solutions;

/**
 * STAND ALONE QUESTION
 */

public class WordScrambler {

    private String[] scrambledWords;

    public WordScrambler(String[] wordArr){
        scrambledWords = wordArr;
    }

    private String recombine(String word1, String word2){
        String half1 = word1.substring(0, word1.length()/2);
        String half2 = word2.substring(word2.length() / 2, word2.length());

        return half1 + half2;
    }

    
    public String[] mixedWords(String[] words){

        String word1;
        String word2;
        String[] newArray = new String[words.length]; 
        for(int i = 0; i < words.length - 1; i += 2){
            word1 = words[i];
            word2 = words[i+1];

            newArray[i] = recombine(word1, word2);
            newArray[i + 1] = recombine(word2, word1);
        }
        
        return newArray;
    }

}