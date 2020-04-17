package solutions;

public class Main {

    public static void main(String[] args){

        //System.out.println(SelfDivisor.isSelfDivisor(684));

        Horse[] horses = new Horse[7];
        horses[0] = new HorseClass(1340, "Trigger");
        horses[1] = null;
        horses[2] = new HorseClass(1210, "Silver");
        horses[3] = null;
        horses[4] = null;
        horses[5] = new HorseClass(1350, "Patches");
        horses[6] = new HorseClass(1410, "Duke");

        for(int i = 0; i < horses.length; i++){
            if(horses[i] == null) System.out.print("null ");
            else System.out.print(horses[i].getName() + " ");
        }

        HorseBarn barn = new HorseBarn(horses);
        barn.consolidate();
        System.out.println();

        Horse[] newHorses = barn.getHorses();
        for(int i = 0; i < newHorses.length; i++){
            if(newHorses[i] == null) System.out.print("null ");
            else System.out.print(newHorses[i].getName() + " ");
        }

    }

}