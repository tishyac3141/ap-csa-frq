package solutions;

public class Mountain {

    public static void main(String[] args){
        int[] array = {3, 2, 1};
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println(getPeakIndex(array));
        System.out.println(isMountain(array));


    }

    public static int getPeakIndex(int[] array){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(i == 0) continue;
            else if(i == array.length - 1) continue;

            else if(array[i] > array[i-1] && array[i] > array[i + 1]) return i;
        }

        return index;

    }

    public static boolean isMountain(int[] array){
        boolean isMountain = true;
        int indexOfPeak =  getPeakIndex(array);
        if(indexOfPeak < 0) return false;

        for(int i = 0; i < indexOfPeak; i++){
            if(i == 0) continue;
            else if(!(array[i - 1] < array[i])) isMountain = false;
        }

        for(int i = indexOfPeak + 1; i < array.length; i++){
            if(i == array.length - 1) continue;
            else if(!(array[i - 1] > array[i])) isMountain = false;
        }

        return isMountain;
    }

}