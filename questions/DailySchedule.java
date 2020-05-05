package questions;

import java.util.ArrayList;

public class DailySchedule {
    
    private ArrayList<Appointment> apptList;

    public DailySchedule(){
        apptList = new ArrayList<Appointment>();
    }

    public DailySchedule(ArrayList<Appointment> list){
        apptList = list;
    }

    /**
     * removes all appointments that overlap the given Appointment
     * postcondition: all appointments that have a time conflict with 
     *                appt have been removed from this DailySchedule
     */
    public void clearConflicts(Appointment appt){
       //your code here
    }

    /**
     * if emergency is true, clears any overlapping appointments and adds
     * appt to this DailySchedule; otherwise, if there are no conflicting 
     * appointments, adds appt to this DailySchedule
     * returns true if the appointment was added
     * otherwise, returns false
     */
    public boolean addAppt(Appointment appt, boolean emergency){
        //your code here
        return false;
    }

}