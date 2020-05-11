package solutions;

import java.util.List;

/**
 * SUPPLEMENATRY WITH FUELROBOT.JAVA *and* FUELTANK.JAVA
 */

public class FuelDepot {

    private FuelRobot filler;
    private List<FuelTank> tanks;

    public int nextTankToFill(int threshold){
        int lowest = Integer.MAX_VALUE;
        int lowestIndex = 0;
        
        for(int i = 0; i < tanks.size(); i++){
            if(tanks.get(i).getFuelLevel() <= threshold && tanks.get(i).getFuelLevel() < lowest){
                lowestIndex = i;
            }
        }
        if(lowest == Integer.MAX_VALUE) return filler.getCurrentIndex();
        return lowestIndex;

    }

    public void moveToLocation(int locIndex){
        if(filler.getCurrentIndex() < locIndex){
            
            if(filler.isFacingRight()){
                filler.moveForward(locIndex - filler.getCurrentIndex());
            } else {
                filler.changeDirection();
                filler.moveForward(locIndex - filler.getCurrentIndex());
            }

        } else {
            
            if(filler.isFacingRight()){
                filler.changeDirection();
                filler.moveForward(filler.getCurrentIndex() - locIndex);
            } else{
                filler.moveForward(filler.getCurrentIndex() - locIndex);
            }

        }
    }
}