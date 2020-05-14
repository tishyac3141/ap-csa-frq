package solutions;

public class Trail {

    private int[] markers;

    public Trail(){
        markers = new int[] {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
    }

    public boolean isLevelTrailSegment(int start, int end){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = start; i <= end; i++){
            if(markers[i] < min) min = markers[i];
            if(markers[i] > max) max = markers[i];
        }

        return (max - min) <= 10;
    }

    public boolean isDifficult(){
        int counter = 0;

        for(int i = 1; i < markers.length; i++){
            if(Math.abs(markers[i] - markers[i - 1]) >= 30) counter++;
        }

        return counter >= 3;
    }
    
}