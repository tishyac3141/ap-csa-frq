package questions;

import java.util.ArrayList;

/**
 * SUPPLEMENTARY WITH TIMEINTERVAL.JAVA *and* APPOINTMENT.JAVA
 * make sure to see Appointment.java for the first part of the question
 * and too see what methods you can use in this question
 */

public class DailySchedule {
    
    private ArrayList apptList;

    //In the original question, ArrayLists with unspecified types are instantiated
    public DailySchedule(){
        apptList = new ArrayList();
    }


    /**
     * part B:
     * removes all appointments that overlap the given Appointment
     * postcondition: all appointments that have a time conflict with 
     *                appt have been removed from this DailySchedule
     */
    public void clearConflicts(Appointment appt){
       //your code here
    }

    /**
     * part C:
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