package solutions;

public class Seat {

    private boolean available;
    private int tier;

    public Seat(boolean isAvail, int tierNum){
        tier = tierNum;
        available = isAvail;
    }

    public boolean isAvailable(){
        return available;
    }

    public int getTier(){
        return tier;
    }
    
    public void setAvailability(boolean isAvail){
        available = isAvail;
    }
}