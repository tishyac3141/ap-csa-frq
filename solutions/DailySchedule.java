package solutions;

import java.util.ArrayList;
/**
 * SUPPLEMENTARY WITH APPOINTMENT.JAVA *and* TIMEINTERVAL.JAVA
 */

public class DailySchedule {
    
    //added a specific type for the arrayList because that is better to do in java
    private ArrayList<Appointment> apptList;

    public DailySchedule(){
        apptList = new ArrayList<Appointment>();
    }

    //added for test purposes only, not in original question
    public DailySchedule(ArrayList<Appointment> list){
        apptList = list;
    }

    /**
     * removes all appointments that overlap the given Appointment
     * postcondition: all appointments that have a time conflict with 
     *                appt have been removed from this DailySchedule
     */
    public ArrayList<Appointment> clearConflicts(Appointment appt){
        
        Appointment other;

        for(int i = 0; i < apptList.size(); i++){
            other = (Appointment) apptList.get(i);

            if(appt.conflictsWith(other)){
                apptList.remove(i);
                i--;
            }
        }

        return apptList;
    }

    /**
     * if emergency is true, clears any overlapping appointments and adds
     * appt to this DailySchedule; otherwise, if there are no conflicting 
     * appointments, adds appt to this DailySchedule
     * returns true if the appointment was added
     * otherwise, returns false
     */
    public boolean addAppt(Appointment appt, boolean emergency){
        
        if(emergency){

            this.clearConflicts(appt);
            apptList.add(appt);
            return true;

        } else {

            boolean isConflict = false;
            Appointment other;

            for(int i = 0; i < apptList.size(); i++){
                other = (Appointment) apptList.get(i);
                if(other.conflictsWith(appt)) isConflict = true;
            }
            
            if(!isConflict) {
                apptList.add(appt);
                return true;
            }
        }

        return false;

    }
}