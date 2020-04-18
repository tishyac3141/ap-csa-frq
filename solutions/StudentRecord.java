package solutions;

public class StudentRecord {

    private int[] scores;

    private double average(int first, int last){
        double average = 0.0;

        for(int i = first; i <= last; i++){
            average += scores[i];
        }
        average = average / (last - first); //check
        return average;
    }

    private boolean hasImproved(){

        boolean hasImproved = true;
        int previous = scores[0];
        
        for(int i = 1; i < scores.length; i++){
            if(! (scores[i] > previous) ) hasImproved = false;
            previous = scores[i];
        }

        return hasImproved;

    }

    public double finalAverage(){

    }

}