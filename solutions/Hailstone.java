package solutions;

/**
 * STAND ALONE QUESTION
 */

public class Hailstone{

    public static int hailstoneLength(int n) {  
        if(n == 1) return 1;
        
        int term = n;
        int length = 1;

        while(term > 1){
            if(term % 2 == 0){
                term = term / 2;
            } else {
                term = (3 * n) + 1;
            }
            length++;
        }

        return length;

    }

    public static boolean isLongSeq(int n) { 
        int length = Hailstone.hailstoneLength(n);
        return length > n;
    }

    public static double propLong(int n) {  
        int amtLong = 0;
        for(int i = 1; i <= n; i++){
            if(Hailstone.isLongSeq(i)) amtLong++;
        }

        return (double) amtLong / n;
    }
}