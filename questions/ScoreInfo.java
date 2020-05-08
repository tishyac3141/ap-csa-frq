package questions;

/**
 * SUPPLEMENTARY TO STATS.JAVA
 * see that for the full question
 */

public class ScoreInfo {

    private int score;
    private int numStudents;

    public ScoreInfo(int aScore){
        score = aScore;
        numStudents = 1;
    }

    public void increment(){
        numStudents++;
    }

    public int getScore(){
        return score;
    }

    public int getFrequence(){
        return numStudents;
    }
    
}