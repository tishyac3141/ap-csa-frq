package solutions;

/**
 * Completed this class under a time limit
 */

public class WordScrambler2 {

    private String[] scrambledWords;

    public WordScrambler2(String[] wordArr){
        scrambledWords = wordArr;
    }

    private String recombine(String word1, String word2){

        String half1 = word1.substring(0, (word1.length() / 2) - 1);
        String half2 = word2.substring(word2.length() / 2, word2.length() - 1);

        return half1 + half2;
    }

    //part b: open-ended
    //the method header would be: 
    //public boolean checkValidLength(String word1, String word2){}

    //to implement this method, I would first call the 'recombine()' method
    //passing in the 'word1' and 'word2' as parameters
    //and then I would store the returned result in a String variable
    //Then, I would write an if statement that compares the length of each String passed
    //in  (word1 and word2) with the length of the new word that resulted from calling
    //'recombine()' and if the length of the new word is greater than either of the lengths
    //of 'word1' and 'word2' I would return false, else return true.


    
}