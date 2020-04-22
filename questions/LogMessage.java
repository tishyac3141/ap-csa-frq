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
     * (in clearer terms): as stated above, the first part of a log message, before the colon, is the 
     * 'machineID', so 'machineID' should be set to the string before the colon, while the 'description'
     * is everything after colon
     */
    public LogMessage(String message){
        //your code here
    }

    /**
     * 
     * Write the LogMessage method containsWord, which returns true if 'description' in 
     * the log message properly contains a given keyword and returns false otherwise.
     * 
     * A description properly contains a keyword if the following conditions are true:
     * 
     * the keyword is a substring of 'description'
     * the keyword is either at the beginning or it is immediately preceeded by a space
     * the keyword is either at the end of the description or it is immediately followed by a space
     * 
     * for example, the following strings (or descriptions) properly contain the keyword "disk"
     * 
     * "disk"
     * "error on disk"
     * "error on /dev/disk disk"
     * "error on disk DSK1"
     * 
     * the following string DO NOT properly contain the keyword "disk"
     * 
     * "DISK"
     * "error on disk3"
     * "error on /dev/disk"
     * "diskette"
     */
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