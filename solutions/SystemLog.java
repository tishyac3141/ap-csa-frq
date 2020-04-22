package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * SUPPLEMENTARY WITH LOGMESSAGE.JAVA
 */

public class SystemLog {
     
    private List<LogMessage> messageList;

    public SystemLog(List<LogMessage> list){
        messageList = list; 
    }

    public List<LogMessage> removeMessages(String keyword){
        
        List<LogMessage> containsKeyword = new ArrayList<LogMessage>(); 
        LogMessage message;
        for(int i = 0; i < messageList.size(); i++){
            message = messageList.get(i);
            //System.out.println("message = " + message);

            if(message.containsWord(keyword)){
                containsKeyword.add(message);
                messageList.remove(i);
                i--;
            }
        }

        return containsKeyword;
    }

    //for test purposes only, not included in original question
    public List<LogMessage> getList(){
        return messageList;
    }

}