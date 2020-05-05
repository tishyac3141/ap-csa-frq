package solutions;

public class Hailstone2 {

    public static int hailstoneLength(int n){
        int count = 1;
        
        while(n > 1){
            if(n % 2 == 0){ 
                n = n / 2;
                count++;
            } else {
                n = (3 * n) + 1;
                count++;
            }
        }

        return count;
    }

    public boolean isLongSeq(int n){
       return hailstoneLength(n) > n;

    }

    //in the AP CS review videos, this method was 'open ended' meaning
    //we had to write how to implement the method and not actually implement it
    //hence this second implementation
    public double propLong(int n){
        return 0;
        /**
         * I would first declare a variable to keep track of how many hailstone sequences are
         * considered long and I woult initialize it to 0.
         * Then, using a for loop, I would iterate from 1 to n (inclusive).
         * For each value, I would call the 'isLongSeq' method, passing in 'i' as a parameter,
         * and if it returns true, I would increment the variable that keeps track of how many
         * sequences are long by 1.
         * At the end, I would return the counter / n, making sure to cast to double so that any decimals
         * are not cut off.
         * 
         * To implement the isLongSeq() method, in the method, I would check if the length of the sequence
         * is greater than 'n'.
         * I would do this by calling hailstoneLength() and passing 'n' as a parameter.
         * 
         */
    }
    
}