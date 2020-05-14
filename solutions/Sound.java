package solutions;

/**
 * STAND ALONE CLASS
 */

public class Sound {

    public int[] samples;

    public Sound(){
        samples = new int[] {0, 0, 0, 40, 2532, 0, 17, -2300, 0, -17, -4000, 4000};
    }

    public int limitAmplitude(int limit){
        int counter = 0;

        for(int i = 0; i < samples.length; i++){
            if(samples[i] > limit){
                counter++;
                samples[i] = limit;
            }
            else if(samples[i] < -limit){
                counter++;
                samples[i] = -limit;
            }
        }

        return counter;
    }

    public void trimSilenceFromBeginning(){
        int newLength = 0;

        for(int i = 0; i < samples.length; i++){
            if(samples[i] == 0) newLength++;
            else break;
        }

        int[] newSamples = new int[samples.length - newLength];
        int otherIndex = 0;
        for(int i = newLength; i < samples.length; i++){
            newSamples[otherIndex] = samples[i];
            otherIndex++;
        }
        
        samples = newSamples;
    }
    
}