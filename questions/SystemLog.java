package questions;

import java.util.List;

public class SystemLog {
    
    private List<LogMessage> messageList;

    public SystemLog(List<LogMessage> list){
        messageList = list; 
    }

    /**
     * Write the SystemLog method removeMessages, which removes from the system log all entries 
     * whose descriptions properly contain keyword and returns a list of the removed entries in their 
     * original order. 
     * 
     * For example, assume that 'theLog' is a SystemLog object initially containing six 
     * LogMessage objects representing the following list of log messages:
     * 
     * CLIENT3:security alert - repeated login failures
     * Webserver:disk offline
     * SERVER1:file not found
     * SERVER2:read error on disk DSK1
     * SERVER1:write error on disk DSK2
     * Webserver:error on /dev/disk
     * 
     * the call: theLog.removeMessages("disk") would return a list containing the following:
     * 
     * Webserver:disk offline
     * SERVER2:read error on disk DSK1
     * SERVER1:write error on disk DSK2
     * 
     * and would modify the list so that all the entries that properly contain 'keyword' are removed
     * 'messageList' would look like the following after the call:
     * 
     * CLIENT3:security alert - repeated login failures
     * SERVER1:file not found
     * Webserver:error on /dev/disk
     * 
     * 
     */
    public List<LogMessage> removeMessages(String keyword){
        //your code here
        return null;
    }
    
}