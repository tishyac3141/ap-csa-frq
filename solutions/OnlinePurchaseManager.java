package solutions;

import java.util.ArrayList;

/**
 * GIZMO.JAVA IS SUPPLEMENTARY TO THIS CLASS
 */

public class OnlinePurchaseManager {

    private ArrayList<Gizmo> purchases;

    //part a:
    public int countElectronicsByMaker(String maker){
        int counter = 0;
        Gizmo thing;

        for(int i = 0; i < purchases.size(); i++){
            thing = purchases.get(i);
            if(thing.isElectronic() && thing.getMaker().equals(maker)) {
                counter++;
            }
        }

        return counter;
    }

    //part b:
    public boolean hasAdjacentEqualPair(){
        if(purchases.size() < 2) return false;

        boolean areAdjacent = false;
        for(int i = 1; i < purchases.size(); i++){
            if(purchases.get(i).equals(purchases.get(i - 1))) areAdjacent = true;
        }

        return areAdjacent;
    }

    //part c: open ended
    /*
    the method header for the new method would look like: 
    public Gizmo getCheapestGizmoByMaker(String maker){}

    the changes to the Gizmo class in order to implement this method would be as follows
        - The addition of a ‘price’ instance field which would be a private integer 
        variable that holds the price of the Gizmo
        - The addition of a ‘getPrice()’ method which would be public and would return 
        an integer represented by the ‘price’ instance field

    no additional changes would need to be made to the OnlinePurchaseManager class, 
    aside from the addition of the method ‘getCheapestByMaker()’
    
    */
    

    
    
}