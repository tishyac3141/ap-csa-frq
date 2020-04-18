package questions;

import java.util.Random;

/**
 * STAND ALONE QUESTION
 */

public class Frog {

    private int goalDistance;
    private int maxHops;

    public Frog(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    /**
     * a method that randomly returns a distance that the frog is hopping
     * @return value can be positive or negative and will be under 100
     */
    private int hopDistance(){

        Random random = new Random();
        //this random number represents the distance the frog is hopping in this one hop
        int distance = random.nextInt(100);
        if(distance == 0) distance = 1;

        int isNegative = random.nextInt();
        if(isNegative % 2 == 0) return (0 - distance);
        else return distance;
    }

    /**
     * has the frog hop, using the hopDistance() method, until one of three occurs:
     * 1) it reaches it's goal, in which case you will return true
     * 2) the distance value becomes negative, in which case you will return false
     * regardless of whether it has reached its 'maxHops' or not
     * 3) it hops the maximum amount of hops allowed (specified by field 'maxHops')
     * and has still not reached the goal, in which case you will return false
     * 
     * @return returns whether the frog reached it's goal or not
     */
    public boolean simulate(){
        
        //your code here
        return false;
    }

     /**
     * returns the ratio of how many times the frog reached it's goal by 
     * calling simulate() the specified amount of times
     * 
     * return a double value that represents the amount of times 'simulate()'
     * returned true divided by the amount specfied by 'num'
     */
    public double runSimulations(int num){

        //your code here
        return 0.0;
    }

}