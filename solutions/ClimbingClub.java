package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * HAS CLIMBINFO.JAVA AS A SUPPLEMENTARY CLASS
 */

public class ClimbingClub {

    private List<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb1(String peakName, int climbTime){
        ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
        climbList.add(newClimb);
    }

    public void addClimb2(String peakName, int climbTime){
        ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
        String otherName;
        
        if(climbList.size() == 0) climbList.add(newClimb);
        else{
            for(int i = 0; i < climbList.size(); i++){
                otherName = climbList.get(i).getName();

                if(peakName.compareTo(otherName) <= 0){
                    climbList.add(i-1, newClimb);
                    break;
                }
            }

        }
    }


}