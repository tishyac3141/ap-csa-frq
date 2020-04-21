package solutions;

/**
 * STAND ALONE SOLUTION
 */

public class StudentRecord {

    private int[] scores;

    private double average(int first, int last){
        //initializing our variable (+1/2 point)
        double average = 0.0;

        //iterating through the whole array (+1 point)
        for(int i = first; i <= last; i++){
            //adding each score to the average (+1/2 point)
            average += scores[i];
        }
        //keep in mind that 'first' and 'last' are inclusive, so you'll need to add one
        //for example, if 'first' = 2 and 'last' = 5, then there are 4 values that will 
        //be added, so you'll need to add 1 to 'last' and then subtract 'first'
        //(+1 point)
        average = average / ((last + 1) - first ); 
        return average; //(+1/2 point)
    }

    private boolean hasImproved(){

        //im starting off with the variable being true
        boolean hasImproved = true;
        //since we will be comparing previous values, to avoid an index out of bounds
        //exception, i'll initialize the variable to the first element
        //and start my for loop from 1 instead of 0
        //exception thrown = -1/2 point so be careful!
        int previous = scores[0];
        
        //traversing through array (+1 point if correct)
        for(int i = 1; i < scores.length; i++){
            //if the current element is NOT greater than the previous element, then 
            //'hasImproved' will become false
            if(! (scores[i] > previous) ) hasImproved = false;
            //setting 'previous' to the current element for the next iteration
            previous = scores[i];
        }

        return hasImproved; //(+1/2 point)

    }

    public double finalAverage(){
        //initializing our variable
        double average = 0.0;

        //if the scores have improved, then we enter this if block
        //calling 'hasImproved()' gains +1/2 point
        if(hasImproved()){
            
            //utilizing the 'average()' method (+1 point if correct)
            average = average(scores.length/2, scores.length-1);
            return average;

        }
        //otherwise...
        else{
            //utlizing 'average()' (+1 point if correct)
            average = average(0, scores.length-1);
            return average;
        }

    }

}