package solutions;

/**
 * STAND ALONE QUESTION
 */

public class NumberCube {

    public int toss(){
        return (int)((Math.random() * 6) + 1);
    }
    
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] values = new int[numTosses];
        
        for(int i = 0; i < values.length; i++){
            values[i] = cube.toss();
        }

        return values;
    }

    public static int getLongestRun(int[] values){
        int index = -1;
        int counter = 0;
        int previousRuns = 1;
        int currentRuns = 1;

        for(int i = 1; i < values.length; i++){
            if(values[i - 1] == values[i]){
                
                while(counter < values.length && values[counter - 1] == values[counter]){
                    counter++;
                    currentRuns++;
                }
                if(currentRuns > previousRuns){
                    index = i;
                    previousRuns = currentRuns;
                }

                i = counter;
                
            }
        }

        return index;
    }
}