package questions;

/**
 * SUPPLEMENTARY WITH SYSTEMLOG.JAVA; FIND IT FOR FULL QUESTION
 * 
 * Log messages have the format machineId:description, where machineId identifies the computer and 
 * description describes the event being logged. Exactly one colon (":") appears in a log message. 
 * There are no blanks either immediately before or immediately after the colon.
 * 
 * Here is an example log message:
 * 
 * SERVER1:file not found
 * 
 */

public class LogMessage {

    private String machineID;
    private String description;

    /**
     * Write the constructor for the LogMessage class. It must initialize the private data of the object 
     * so that getMachineId returns the machineId part of the message and getDescription returns the 
     * description part of the message.
     * 
     * (in clearer terms):  
     */
    public LogMessage(String message){
        //your code here
    }

    public boolean containsWord(String keyword){
        return false;
        //your code here
    }

    public String getMachineID(){
        return machineID;
    }

    public String getDescription(){
        return description;
    }

}