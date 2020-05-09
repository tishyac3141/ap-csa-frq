package solutions;

import java.util.ArrayList;

/**
 * STAND ALONE QUESTION
 */
public class WordList {

    private ArrayList myList;

    public int numWordsOfLength(int len){
        int num = 0;

        String word;   
        for(int i = 0; i < myList.size(); i++){
           word = (String) myList.get(i);
           if(word.length() == len) num++;
            
        }

        return num;
    }

    public void removeWordsOfLength(int len){
        String word;
        for(int i = 0; i < myList.size(); i++){
            word = (String) myList.get(i);
            if(word.length() == len) {
                myList.remove(i);
                i--;
            }
             
         }
    }
    
}