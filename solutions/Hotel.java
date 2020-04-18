package solutions;

import java.util.ArrayList;

public class Hotel {

    private Reservation[] rooms;
    private ArrayList waitList;

    public Reservation requestRoom(String guestName){
        
        //iterating through whole array
        for(int i = 0; i < rooms.length; i++){

            //checking if the element at that index is null
            if(rooms[i] == null){
                //if it is, creating a new Reservation with the specifed name
                //and assigning it at that index
                rooms[i] = new Reservation(guestName, i);
                
                //returning the Reservation that was just made and exiting the method
                return rooms[i];
            }
        }
        //adding the name to 'waitList' because if it has exited the loop but is still
        //in the method, that means all the rooms are full
        waitList.add(guestName);
        //returning null, as specified by the problem
        return null;
    }

    public Reservation cancelAndReassign(Reservation res){
        int index = res.getRoomNumber();
        rooms[index] = null;

        if(waitList.size() > 0){
            //don't forget to cast! because the ArrayList has a generic type and the 
            //Reservation constructor requires a String, 
            //you will need to cast when creating a new Reservation 
            rooms[index] = new Reservation( (String) waitList.get(0), index);
            //make sure to remove the name from 'waitList'
            waitList.remove(0);
            //remember to return the Reservation you just made
            return rooms[index];
        }

        return null;
    }
}