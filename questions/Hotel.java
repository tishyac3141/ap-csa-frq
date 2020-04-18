package questions;

import java.util.ArrayList;

/**
 * QUESTION INCLUDES RESERVATION CLASS; FIND IT FOR FULL PROBLEM
 */

public class Hotel {

    private Reservation[] rooms;
    private ArrayList waitList;

    /**
     * Write the Hotel method requestRoom. Method requestRoom attempts to reserve a room in the 
     * hotel for a given guest. If there are any empty rooms in the hotel, one of them will be assigned 
     * to the named guest and the newly created reservation is returned. If there are no empty rooms, 
     * the guest is added to the end of the waiting list and null is returned.
     * 
     * Complete the method below
     */

    public Reservation requestRoom(String guestName){
        //your code here
        return null;
    }


    /**
     * Write the Hotel method cancelAndReassign. Method cancelAndReassign releases a previous 
     * reservation. If the waiting list for the hotel contains any names, the vacated room is 
     * reassigned to the first person at the beginning of the list. That person is then removed from 
     * the waiting list and the newly created reservation is returned. If no one is waiting, the room 
     * is marked as empty and null is returned.
     * 
     * release the room associated with the parameter res
     * if there is any name in the waitlist, remove the first name and create a new Reservation
     * for this person in the room reserved by 'res' and return the Reservation
     * 
     * In writing cancelAndReassign you may call any accessible methods in the Reservation and 
     * Hotel classes. Assume that these methods work as specified.
     * 
     * precondition: res is a valid Reservation for some room in this hotel
     * 
     * Complete the method below
     */

    public Reservation cancelAndReassign(Reservation res){
        //your code here
        return null;
    }

}