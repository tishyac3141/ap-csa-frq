package questions;

/**
 * INTERFACE 'HORSE' IS SUPPLEMENTARY TO THIS QUESTION
 */


public class HorseBarn {

    /**
     * 'spaces' is an array that holds the type Horse
     * some have Horse objects in them and others are null
     * the empty spaces, denoted by null, are mixed in with the full spaces
     */

    private Horse[] spaces;

    public HorseBarn(Horse[] horses){
        spaces = horses;
    }

    /**
     * Given the string name, find the index of wear the horse stays
     * Keep in mind that the Horse interface has a method called 'getName()'
     * If the horse is not in the array, then return -1
     * Otherwise return the index of where the horse is
     * Also keep in mind that the array does have 'null' elements in it 
     */
    public int findHorseSpace(String name){
        //your code here    
        return 0;
    }


    /**
     * the array 'spaces' has Horses and empty spaces mixed together
     * with this method, all the horses should be at the beginning of the array, and all the nulls
     * at the other
     * for example: 
     * if the array looked like this before 'consolidate()': (I am denoting the Horse objects by putting their name)
     * 
     * "Patches", null, "Duke", null, null, "Silver", "Chestnut", null
     * 
     * Then after calling 'consolidate()', it should look like this:
     * 
     * "Patches", "Duke", "Silver", "Chestnut", null, null, null, null
     * 
     * hence, the original order of the horses should remain and no object should be deleted
     * 
     */
    public void consolidate(){
        //your code here
    }

    /**
     * for test purposes
     */
    public Horse[] getHorses(){
        return spaces;
    }

}