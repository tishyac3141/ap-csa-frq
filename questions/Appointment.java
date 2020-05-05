package questions;

/**
 * SUPPLEMENTARY WITH TIMEINTERVAL.JAVA *and* DAILYSCHEDULE
 * look at TimeInterval.java to see the methods included there
 * and yes, it looks like Appointment and TimeInterval to the same thing 
 * but that's because the classes were mostly unimplemented and I'm assuming
 * TimeInterval is supposed to be more complicated but for the sake of time
 * and simplicity, I just made intervals integers
 */

public class Appointment {

    private TimeInterval interval;

    public Appointment(){
        interval = new TimeInterval(0);
    }

    public TimeInterval getTime(){
        return interval;
    }

    /**
     * Returns true if the time interval of this Appointment overlaps with the time interval of other
     * otherwise returns false
     * make sure to look at TimeInterval.java and use any methods from there
     */
    public boolean conflictsWith(Appointment other){
        //your code here
        return false;
    }

    
}