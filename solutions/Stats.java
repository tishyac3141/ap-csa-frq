package solutions;

import java.util.ArrayList;

/**
 * SUPPLEMENTARY WITH SCOREINFO.JAVA
 * this was done during the "mock exam" video posted by AP
 * here is the video where they go over this question:
 * https://youtu.be/wRtmNmpVLmE
 */

public class Stats {

    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int score){
        
        //iterating through the whole array
        for(int i = 0; i < scoreList.size(); i++){
            //if the score is equal to a score in the array,
            //then increment and return false as nothing was added to the array
            if(scoreList.get(i).getScore() == score){
                scoreList.get(i).increment();
                return false;
            }
        }

        //if the thread has reached this point, that means the score has
        //not been found in the array (hence no need for if statement)
        for(int i = 0; i < scoreList.size(); i++){

            //if there's a score that's greater than the score we're trying
            //to add in the array
            if(scoreList.get(i).getScore() > score){
                //add it in the spot before (since we know scoreList is sorted)
                //but make sure to check if i is not 0
                if(i > 0){
                    scoreList.add(i - 1, new ScoreInfo(score));
                    return true; 
                //in this case, if i IS 0, that means the score we are trying to add
                //is the lowest score    
                } else {    
                    scoreList.add(0, new ScoreInfo(score));
                    return true;
                }
            }
        }
        
        //if the thread has reached this point, that means there was no score
        //that was larger than the one we are tring to fit and thus is the highest
        //score and must be added to the end of the list
        scoreList.add(scoreList.size() - 1, new ScoreInfo(score));
        return true;

    }

    public void recordScores(int[] stuScores){
        
        for(int i = 0; i < stuScores.length; i++){
            record(stuScores[i]);
        }
        
    }

    //part c: open ended
    /**
     * the header for the method 'getSeniorPercent' would look like the following:
     * public double getSeniorPercent(int score){ }
     * 
     * For changes made to the 'ScoreInfo' class, I would first create a new
     * private int instance field, called 'numSeniors', that would store the number of
     * seniors that received that score.
     * Within the constructor and the 'increment()' method, I would also include a
     * boolean parameter, called 'isSenior' that, if true, would increment the 'numSeniors'
     * instance field. 
     * Finally, I would also add a 'getNumOfSeniors()' method that would return the 
     * number of seniors that received that score, represented by the 'numSeniors'
     * instance field.
     * 
     * 
     */
    
    
    
}