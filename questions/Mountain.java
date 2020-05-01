package questions;

/**
 * STAND ALONE QUESTION
 */

public class Mountain {

    /**
     * Write the Mountain method getPeakIndex. Method getPeakIndex returns the index 
     * of the first peak found in the parameter array, if one exists. A peak is 
     * defined as an element whose value is greater than the value of the element 
     * immediately before it and is also greater than the value of the element 
     * immediately after it. Method getPeakIndex starts at the beginning of the 
     * array and returns the index of the first peak that is found or -1 if no 
     * peak is found.
     * 
     * For example:
     * 
     * if arr = {11, 22, 33, 22, 11}, getPeakIndex(arr) would return 2
     * if arr = {11, 22, 11, 22, 11}, getPeakIndex(arr) would return 1
     * if arr = {11, 22, 33, 55, 77}, getPeakIndex(arr) would return -1
     * if arr = {99, 33, 55, 77, 120}, getPeakIndex(arr) would return -1
     * if arr = {99, 33, 55, 77, 55}, getPeakIndex(arr) would return 3
     * if arr = {33, 22, 11}, getPeakIndex(arr) would return -1
     */
    public static int getPeakIndex(int[] arr){
        //your code here
        return 0;
    }

    /**
     * Write the Mountain method isMountain. Method isMountain returns true if the 
     * values in the parameter array are ordered as a mountain; otherwise, it returns 
     * false. The values in array are ordered as a mountain if all three of the 
     * following conditions hold.
     * 
     * There must be a peak.
     * The array elements with an index smaller than the peak’s index must appear 
     * in increasing order.
     * The array elements with an index larger than the peak’s index must 
     * appear in decreasing order.
     * 
     * For example:
     * if arr = {1, 2, 3, 2, 1}, isMountain(arr) would return true
     * if arr = {1, 2, 1, 2, 1}, isMountain(arr) would return false
     * if arr = {1, 2, 3, 1, 5}, isMountain(arr) would return false
     * if arr = {1, 4, 2, 1, 0}, isMountain(arr) would return true
     * if arr = {9, 3, 5, 7, 5}, isMountain(arr) would return false
     * if arr = {3, 2, 1}, isMountain(arr) would return false
     */
    public static boolean isMountain(int[] arr){
        //your code here
        return false;
    }

}