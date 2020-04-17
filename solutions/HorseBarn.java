package solutions;

public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] horses){
        spaces = horses;
    }

    public int findHorseSpace(String name){

        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null && spaces[i].getName() == name){
                return i;
            }
        }

        return -1;
    }

    public void consolidate(){

        int counter = 0;
        for(int i = 0; i < spaces.length; i++){
            counter = i;
            if(spaces[i] == null){
                while(counter < spaces.length - 1 && spaces[counter] == null ){
                    counter++;
                }
                spaces[i] = spaces[counter];
                spaces[counter] = null;
            }
        }
    }

    public Horse[] getHorses(){
        return spaces;
    }

}