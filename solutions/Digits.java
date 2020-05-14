package solutions;

import java.util.ArrayList;

/**
 * STAND ALONE CLASS
 */
public class Digits {

    public ArrayList<Integer> digitList;

    public Digits(int num){
        int digit;
        digitList = new ArrayList<Integer>();

        while(num > 0){
            digit = num % 10;
            digitList.add(0, digit);
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing(){
        boolean isIncreasing = true;
        if(digitList.size() == 1) return true;
        for(int i = 1; i < digitList.size(); i++){
            if(digitList.get(i) <= digitList.get(i - 1)) isIncreasing = false;
        }

        return isIncreasing;
    }

    
    
}