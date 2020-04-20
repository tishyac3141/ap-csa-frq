package questions;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {

    private List<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }


    /**
     * Write an implementation of the ClimbingClub method addClimb that stores the ClimbInfo 
     * objects in the order they were added. This implementation of addClimb should create a new 
     * ClimbInfo object with the given name and time. It appends a reference to that object to the 
     * end of climbList. 
     */
    public void addClimb1(String peakName, int climbTime){
        //your code here
    }

    /**
     * Write an implementation of the ClimbingClub method addClimb that stores the elements of 
     * climbList in alphabetical order by name (as determined by the compareTo method of the 
     * String class). This implementation of addClimb should create a new ClimbInfo object with the 
     * given name and time and then insert the object into the appropriate position in climbList. 
     * Entries that have the same name will be grouped together and can appear in any order within 
     * the group. 
     */
    public void addClimb2(String peakName, int climbTime){
        //your code here
    }


    /**
     * Consider the following implementation of the method below
     * Which is supposed to return the number of different names in 'climbList'
     */
    public int distinctPeakNames(){
        if(climbList.size() == 0){
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;

        for(int k = 1; k < climbList.size(); k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if(prevName.compareTo(currName) != 0){
                numNames++;
                prevName = currName;
            }
        }

        return numNames;
    }

}