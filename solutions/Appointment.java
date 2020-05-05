package solutions;

import solutions.TimeInterval;

/**
 * SUPPLEMENTARY WITH TIMEINTERVAL.JAVA *and* DAILYSCHEDULE.JAVA
 */

public class Appointment {
    
    private TimeInterval interval;

    public Appointment(){
        interval = new TimeInterval(0);
    }

    public Appointment(int hours){
        interval = new TimeInterval(hours);
    }    

    public TimeInterval getTime(){
        return interval;
    }

    /**
     * returns true if the time interval of this Appointment
     * overlaps with the time interval of other
     * otherwise returns false
     */
    public boolean conflictsWith(Appointment other){

        TimeInterval otherInterval = other.getTime();
        return otherInterval.overlapsWith(this.getTime());

    }

}