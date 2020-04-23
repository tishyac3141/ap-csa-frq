package solutions;

/**
 * SUPPLEMENTARY WITH SYSTEMLOG.JAVA; FIND IT FOR FULL QUESTION
 */

public class LogMessage {

    private String machineID = "";
    private String description = "";

    public LogMessage(String message){
        
        boolean foundColon = false;
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ':'){
                foundColon = true;
                i++;
            }
            if(foundColon){
                description += message.charAt(i);
            }
            else{
                machineID += message.charAt(i);
            }
        }
    }

    public boolean containsWord(String keyword){

        int position = description.indexOf(keyword);

        if(position < 0) return false;

        else if(position == 0){
            if(Character.isWhitespace(description.charAt(position + 4))){
                return true;
            }
            else{
                return false;
            }

        } 
        
        else if(position == (description.length() - 4)){
            if(Character.isWhitespace(description.charAt(position - 1))){
                return true;
            }
            else{
                return false;
            }
        }

        else if(Character.isWhitespace(description.charAt(position + 4))){
            return true;
        }
        
        else return false;

    }   

    public String getMachineID(){
        return machineID;
    }

    public String getDescription(){
        return description;
    }

}