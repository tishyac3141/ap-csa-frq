package solutions;

import java.util.Random;

/**
 * SOLUTION
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

    public boolean simulate(){
        
        int totalDistance = 0;
        for(int hops = 0; hops < maxHops; hops++){

            if(totalDistance < 0) return false;
            totalDistance += hopDistance();
            if(totalDistance >= goalDistance) return true;
        
         }
    
         return totalDistance >= goalDistance;

    }

    public double runSimulations(int num){

        int amountTrue = 0;
        for(int i = 0; i < num; i++){
           
            if(simulate()){
                amountTrue++;
            }

        }
        //don't forget to cast!!
        return (double) amountTrue / num;
    }
}