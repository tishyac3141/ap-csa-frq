package classroomfrq;

import java.util.Random;

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
        int distance = random.nextInt(100);
        if(distance == 0) distance = 1;

        int isNegative = random.nextInt();
        if(isNegative % 2 == 0) return (0 - distance);
        else return distance;
    }

    /**
     * has the frog hop, using the hopDistance() method, until:
     * 1) it reaches it's goal,
     * 2) the distance value becomes negative
     * 3) it hops the maximum amount of hops allowed (specified by field 'maxHops')
     * 
     * @return returns whether the frog reached it's goal or not
     */
    public boolean simulate(){
        
        int totalDistance = 0;
        for(int hops = 0; hops < maxHops; hops++){

            if(totalDistance < 0) return false;
            totalDistance += hopDistance();
            if(totalDistance >= goalDistance) return true;
        
         }
    
         return totalDistance >= goalDistance;

    }

    /**
     * returns the ratio of how many times the frog reached it's goal by 
     * calling simulate() the specified amount of times
     * @return returns a double value 
     */
    public double runSimulations(int num){

        int amountTrue = 0;
        for(int i = 0; i < num; i++){
           
            if(simulate()){
                amountTrue++;
            }

        }

        return (double) amountTrue / num;
    }
}