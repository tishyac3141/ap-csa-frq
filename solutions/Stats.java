package solutions;

import java.util.ArrayList;

public class Stats {

    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int score){
        
        
        for(int i = 0; i < scoreList.size(); i++){
            if(scoreList.get(i).getScore() == score){
                scoreList.get(i).increment();
                return false;
            }
        }

        
        for(int i = 0; i < scoreList.size(); i++){

            if(scoreList.get(i).getScore() > score){
                if(i > 0){
                    scoreList.add(i - 1, new ScoreInfo(score));
                    return true;
                } else {    
                    scoreList.add(0, new ScoreInfo(score));
                    return true;
                }
            }
        }
        
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