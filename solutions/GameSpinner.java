package solutions;

/**
 * STAND ALONE QUESTION
 */

public class GameSpinner {

    private int sectors;
    private int amtOfRuns = 0;
    private int previousNum = 0;

    public GameSpinner(int sectors){
        this.sectors = sectors;
    }
    
    public int currentRun(){
        return amtOfRuns;
    }

    public int spin(){

        int num = (int)((Math.random() * 4) + 1);

        if(previousNum == 0){
            amtOfRuns = 1;
            previousNum = num;
            return num;
        } 
        else if(num == previousNum){
            amtOfRuns++;
            previousNum = num;
            return num;
        } 
        else {
            previousNum = num;
            amtOfRuns = 1;
            return num;
        }
    }

    public static void main(String[] args){
        GameSpinner spinner = new GameSpinner(4);
        System.out.println(spinner.spin());
    }
    
}