package solutions;

/**
 * SUUPLEMENTARY TO MASTERORDER.JAVA
 */

public class CookieOrder {

    String variety;
    int numOfBoxes;

    public CookieOrder(String variety, int numBoxes){
        this.variety = variety;
        this.numOfBoxes = numBoxes;
    }

    public String getVariety(){
        return variety;
    }

    public int getNumBoxes(){
        return numOfBoxes;
    }
    
}