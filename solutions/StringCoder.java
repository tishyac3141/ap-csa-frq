package solutions;

import java.util.ArrayList;

public class StringCoder {

    private String masterString;

    public StringCoder(String master){
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts){
        String fullString = "";
        StringPart part;
        for(int i = 0; i < parts.size(); i++){
            part = parts.get(i);
            fullString += masterString.substring(part.getStart(), part.getStart() + part.getLength()) + 1;
        }

        return fullString;
    }

    public ArrayList<StringPart> encodeString(String word){
        ArrayList<StringPart> parts = new ArrayList<StringPart>();

        int length = 0;
        StringPart part;

        while(length < word.length()){
            part = findPart(word.substring(length));
            parts.add(part);
            length += part.getLength() - 1;
        }

        return parts;

    }

    private StringPart findPart(String str){
        return null;
    }
    
}