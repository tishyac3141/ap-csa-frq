package solutions;

/**
 * STAND ALONE QUESTION
 */

public class BatteryCharger {

    private static int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 
                                     200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 
                                     80, 60};

    public static void main(String[] args){
        //output should be:
        //40
        //110
        //550
        //3710
        //12
        //22
        System.out.println(BatteryCharger.getChargingCost(12, 1)); 
        System.out.println(BatteryCharger.getChargingCost(0, 2));   
        System.out.println(BatteryCharger.getChargingCost(22, 7));
        System.out.println(BatteryCharger.getChargingCost(22, 30));
        
        System.out.println(BatteryCharger.getChargeStartTime(1));
        System.out.println(BatteryCharger.getChargeStartTime(4));
    }

    private static int getChargingCost(int startHour, int chargeTime){
        int cost = 0;
        int hour = startHour;

        for(int i = 0; i < chargeTime; i++){
            
            if(hour >= rateTable.length){
                hour = 0;
            }
            cost += rateTable[hour];
            hour++; 
        }

        return cost;
    }

    public static int getChargeStartTime(int chargeTime){
        int minCost = Integer.MAX_VALUE;
        int minIndex = 0;

        for(int i = 0; i < rateTable.length; i++){
            
            if(getChargingCost(i, chargeTime) < minCost){
                minIndex = i;
                minCost = getChargingCost(i, chargeTime);
            }
        }

        return minIndex;
    }

    
}