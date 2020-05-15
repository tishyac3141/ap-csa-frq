package solutions;

import java.util.ArrayList;

public class WordPairList {

    public ArrayList<WordPair> allPairs;

    public static void main(String[] args){
        WordPairList list = new WordPairList(new String[] {"the", "red", "fox", "the", "red"});

        for(int i = 0; i < list.allPairs.size(); i++){
            System.out.println(list.allPairs.get(i).getFirst() + " " + list.allPairs.get(i).getSecond());
        }

        System.out.println(list.numMatches());
    }

    public WordPairList(String[] words){

        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i++){

            for(int j = i + 1; j < words.length; j++){

                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches(){
        int sum = 0;
        WordPair pair;
        for(int i = 0; i < allPairs.size(); i++){
            pair = allPairs.get(i);
            if(pair.getFirst().equals(pair.getSecond())) sum++;
        }

        return sum;
    }
    
}