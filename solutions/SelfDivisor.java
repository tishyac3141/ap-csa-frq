package solutions;

import java.util.ArrayList;

public class SelfDivisor {

    public static boolean isSelfDivisor(int number){
        
        ArrayList<Integer> digitsOfNum = new ArrayList<Integer>();
        boolean isSelf = true;

        if(number % 10 == 0) return false;

        int remainder = number % 10;
        int newNumber = number;

        while(newNumber != 0){
            remainder = newNumber % 10;
            System.out.println(" remainder = " + remainder);

            digitsOfNum.add(remainder);

            newNumber = (int)(newNumber / 10);
            System.out.println(" number after dividing = " + remainder);
            
        }

        int toDivideBy;
        for(int i = 0; i < digitsOfNum.size(); i++){
            toDivideBy = digitsOfNum.get(i);
            if(number % toDivideBy != 0) isSelf = false;
        }
     
        return isSelf;
    }

    public static int[] firstNumSelfDivisors(int start, int num){
        int[] nums = new int[num];

        int currentNumber = start;
        int count = 0;

        while(count < num){
            currentNumber++;
            if(isSelfDivisor(currentNumber)) count++;
            nums[count] = currentNumber;
        }
        
        return nums;

    }
}