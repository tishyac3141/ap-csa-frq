package solutions;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {

    private List<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime){
        ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
        climbList.add(newClimb);
    }

    public int distinctPeakNames(){
        //your code here
        return 0;
    }

}