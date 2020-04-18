package solutions;

public class Reservation {

    private int roomNum;
    private String name;

    public Reservation(String guestName, int roomNumber){
        name = guestName;
        roomNum = roomNumber;
    }

    public int getRoomNumber(){
        return roomNum;
    }
}