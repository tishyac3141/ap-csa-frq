package solutions;

public class Robot {

    public int[] hall;
    public int pos;
    public boolean facingRight;

    public Robot(){
        hall = new int[] {1, 1, 2, 2};
        pos = 1;
        facingRight = true;
    }

    private boolean forwardMoveBlocked(){
        if(pos + 1 > hall.length && facingRight) return true;
        else if(pos - 1 < hall.length && !facingRight) return true;
        else return false;
    }

    private void move(){
        
            if(hall[pos] > 0){ 
                hall[pos] = hall[pos] - 1;
            }
            
            if(hall[pos] == 0) {

                if(forwardMoveBlocked()){
                    if(facingRight) facingRight = false;
                    else facingRight = true;
                } else {
                    if(facingRight){
                        if(pos == hall.length - 1) pos = 0;
                        else pos++;
                    } 
                    else {
                        if(pos == 0) pos = hall.length - 1;
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