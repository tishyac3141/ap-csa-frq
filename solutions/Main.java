package solutions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //System.out.println(SelfDivisor.isSelfDivisor(684));

        /*
         * Test the Horse class with the following code
         * Final result should be: "Trigger", "Silver", "Patches", "Duke", null null, null
        */
        /*
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
        */

        /*
         * Use this class to test your Customer code
         * Your final result should be:
         * 
         * Aaron, Arthur, Baker, Burton, Burton, Dillard

         
        Customer[] list1 = new Customer[8];
        Customer[] list2 = new Customer[7];
        Customer[] result = new Customer[6];
       
        for(int i = 0; i < result.length; i++){
            result[i] = null;
        }
        
        list1[0] = new Customer("Arthur", 4920);
        list1[1] = new Customer("Burton", 3911);
        list1[2] = new Customer("Burton", 4944);
        list1[3] = new Customer("Franz", 1692);
        list1[4] = new Customer("Horton", 9221);
        list1[5] = new Customer("Jones", 5554);
        list1[6] = new Customer("Miller", 9360);
        list1[7] = new Customer("Nguyen", 4339);

        list2[0] = new Customer("Aaron", 1729);
        list2[1] = new Customer("Baker", 2921);
        list2[2] = new Customer("Burton", 3911);
        list2[3] = new Customer("Dillard", 6552);
        list2[4] = new Customer("Jones", 5554);
        list2[5] = new Customer("Miller", 9360);
        list2[6] = new Customer("Noble", 3335);

        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i].getName() + " ");
        }

        System.out.println();

        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i].getName() + " ");
        }

        System.out.println();
        result = Customer.prefixMerge(list1, list2, result);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i].getName() + " ");
        }
        */

        /**
         * Test the MusicDownloads class with the following
         * Final result should be:
         * 
         * Hey Jude 5
         * Soul Sister 5
         * Aqualung 11
         * Lights 2
         * Go Now 1
         
        ArrayList<DownloadInfo> list = new ArrayList<DownloadInfo>(3);

        DownloadInfo song1 = new DownloadInfo("Hey Jude");
        for(int i = 0; i < 5; i++){
            song1.incrementTimesDownloaded();
        }
        list.add(0, song1);

        DownloadInfo song2 = new DownloadInfo("Soul Sister");
        for(int i = 0; i < 3; i++){
            song2.incrementTimesDownloaded();
        }
        list.add(1, song2);

        DownloadInfo song3 = new DownloadInfo("Aqualung");
        for(int i = 0; i < 10; i++){
            song3.incrementTimesDownloaded();
        }
        list.add(2, song3);

        ArrayList<String> titles = new ArrayList<String>();
        titles.add("Lights");
        titles.add("Aqualung");
        titles.add("Soul Sister");
        titles.add("Go Now");
        titles.add("Lights");
        titles.add("Soul Sister");

        MusicDownloads playlist = new MusicDownloads(list);
        playlist.updateDownloads(titles);
        List<DownloadInfo> newList = playlist.getList();

        for(int i = 0; i < newList.size(); i++){
            System.out.print(newList.get(i).getTitle() + " ");
            System.out.print(newList.get(i).getTimesDownloaded());
            System.out.println();
        }

        */

        /**
         * Test the scramble class using the following segment of code
         * 
         * The final printed result should be:
         * TNA, BARCADABARA, PAPLE 
         

        ArrayList<String> list = new ArrayList<String>(5);
        list.add(0, "TAN");
        list.add(1, "ABRACADABRA");
        list.add(2, "WHOA");
        list.add(3, "APPLE");
        list.add(4, "EGGS");

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        ArrayList<String> scrambled = Scramble.scrambleOrRemove(list);

        for(int i = 0; i < scrambled.size(); i++){
            System.out.print(scrambled.get(i) + ", ");
        }

        System.out.println();
        System.out.println(Scramble.scrambleWord("APPLE"));

        */

        
    } 

}