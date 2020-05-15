package solutions;

/**
 * STAND ALONE CLASS:
 * here's the link to the questions: 
 * https://apcentral.collegeboard.org/pdf/ap-2020exam-sample-questions-computer-science.pdf
 */

public class CheckDigit {

    public static int getCheck(int num){
        return 0;
        //i just put these since the implementation was not shown
        //so unfortunately this question is not testible (for now)
    }

    //part a
    public static boolean isValid(int numWithCheckDigit){
        int num = numWithCheckDigit / 10;
        int check = getCheck(num);

        return (check == (numWithCheckDigit % 10));
    }

    //part b: open ended
    /*
    In order to implement the addition the programmer would like to make, I 
    would need to add a private instance variable that is an integer called 
    “timesIncorrect” that would keep track of how many times the ‘isValid()’ 
    method was called with an incorrect check digit. This instance variable would 
    be initialized to 0 in the constructor. Within the ‘isValid()’ method, I would 
    increment ‘timeIncorrect’ if the check digit is incorrectly present.
    */
}