package solutions;

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