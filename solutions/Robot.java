package solutions;

public class Robot {

    private int[] hall;
    private int pos;
    private boolean facingRight;

    private boolean forwardMoveBlocked(){
        if(pos + 1 > hall.length && facingRight) return true;
        else if(pos - 1 < hall.length && !facingRight) return true;
        else return false;
    }

    private void move(){
        if(hall[pos] == 0) {

            if(forwardMoveBlocked()){
                if(facingRight) facingRight = false;
                else facingRight = true;
            } else {
                if(facingRight) pos++;
                else pos--;
            }

        }
        else{
            hall[pos] = hall[pos] - 1;
            
            if(hall[pos] == 0) {

                if(forwardMoveBlocked()){
                    if(facingRight) facingRight = false;
                    else facingRight = true;
                } else {
                    if(facingRight) pos++;
                    else pos--;
                }
    
            }
        }
        
    }

    public int clearHall(){
        int counter = 0;

        while(hallIsClear() == false){
            move();
            counter++;
        }
        
        return counter;
    }

    private boolean hallIsClear(){
        boolean isClear = true;

        for(int i = 0; i < hall.length; i++){
            if(hall[i] != 0) isClear = false;
        }

        return isClear;
        
    }
    
}