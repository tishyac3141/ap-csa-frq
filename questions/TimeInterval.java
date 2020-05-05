package questions;

/**
 * SUPPLEMENTARY WITH APPOINTMENT.JAVA *and* DAILYSCHEDULE.JAVA
 * SEE THOSE FOR FULL QUESTION (this question has two parts, the first part
 * is in Appointment.java and the second part is in DailySchedule.java)
 */

public class TimeInterval {

    private int interval;

    public TimeInterval(int interval){
        this.interval = interval;
    }

    public int getInterval(){
        return interval;
    }

    public boolean overlapsWith(TimeInterval interval){ 
        return interval.getInterval() == this.interval;
    }
    
}