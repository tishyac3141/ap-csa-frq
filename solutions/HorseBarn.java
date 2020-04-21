package solutions;

/**
 * SEE 'HORSE' and 'HORSECLASS' TO TEST CODE
 */

public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] horses){
        spaces = horses;
    }

    public int findHorseSpace(String name){

        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null && spaces[i].getName() == name){
                return i;
            }
        }

        return -1;
    }

    public void consolidate(){

        //i am initializing an additional counter
        int counter = 0;

        //traversing through the array (+1/2 point)
        for(int i = 0; i < spaces.length; i++){
            //starting at i
            counter = i;
            //if at i, the element is null
            if(spaces[i] == null){

                //then while 'counter' is less than length-1 (yes less than, because it will add up to 
                //length-1 before the condition evaluates false) and the elements at counter is null, 
                //increment counter
                //this is to take care of the case where there are multiple 'nulls' in a rows
                while(counter < spaces.length - 1 && spaces[counter] == null ){
                    counter++;
                }
                //by this point, either the array has already been sorted, and two nulls are being switched around
                //OR spaces[counter] != null, in which case we want to switch it with spaces[i], which is null
                spaces[i] = spaces[counter];
                spaces[counter] = null;
            }
        }
    }

    /**
     * for test purposes
     */
    public Horse[] getHorses(){
        return spaces;
    }

}