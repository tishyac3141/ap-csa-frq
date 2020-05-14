package solutions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

    

        /*
         * Test the Horse class with the following code
         * Final result should be: "Trigger", "Silver", "Patches", "Duke", null null, null
        
        
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






        /**
         * Use this to test your LogMessage and SystemLog classes
         * The final output should be:
         * 
         * the list that contains the keyword correctly is: 
         * Webserver:disk offline 
         * SERVER2:read error on disk DSK1 
         * SERVER1:write error on disk DSK2 
         *
         * the list that does not correctly contain the keyword is: 
         * CLIENT3:security alert - repeated login failures 
         * SERVER1:file not found 
         * Webserver:error on /dev/disk 
         

        ArrayList<LogMessage> messages = new ArrayList<LogMessage>();
        messages.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
        messages.add(new LogMessage("Webserver:disk offline"));
        messages.add(new LogMessage("SERVER1:file not found"));
        messages.add(new LogMessage("SERVER2:read error on disk DSK1"));
        messages.add(new LogMessage("SERVER1:write error on disk DSK2"));
        messages.add(new LogMessage("Webserver:error on /dev/disk"));

        SystemLog sl = new SystemLog(messages);
        List<LogMessage> containsKeywords = sl.removeMessages("disk");
        List<LogMessage> doesNotContainKeywords = sl.getList();

        LogMessage lm;
        System.out.println("the list that contains the keyword correctly is: ");
        for(int i = 0; i < containsKeywords.size(); i++){
            lm = containsKeywords.get(i);
            System.out.println(lm.getMachineID() + ":" + lm.getDescription() + " ");
        }

        System.out.println();
        System.out.println("the list that does not correctly contain the keyword is: ");

        for(int i = 0; i < doesNotContainKeywords.size(); i++){
            lm = doesNotContainKeywords.get(i);
            System.out.println(lm.getMachineID() + ":" + lm.getDescription() + " ");
        }
        */






        /**
         * Use this to test your StringFormatter class
         * Make sure to add proper 'System.out.println()' within your 'format()' method
         * so your output looks like this:
         * 
         * total amt of letters = 14
         * number of gaps = 3
         * basic width gap = 2
         * left over = 0
         * AP  Comp  Sci  Rocks  
         * 
         * total amt of letters = 15
         * number of gaps = 3
         * basic width gap = 1
         * left over = 2
         * Green  Eggs  And Ham 
         * 
         * total amt of letters = 9
         * number of gaps = 1
         * basic width gap = 11
         * left over = 0
         * Beach           Ball    
         
        ArrayList<String> list = new ArrayList<String>();
        list.add("AP");
        list.add("Comp");
        list.add("Sci");
        list.add("Rocks");

        System.out.println();
        System.out.println(StringFormatter.format(list, 20));
        

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Green");
        list2.add("Eggs");
        list2.add("And");
        list2.add("Ham");

        System.out.println();
        System.out.println(StringFormatter.format(list2, 20));
        
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Beach");
        list3.add("Ball");
        
        System.out.println();
        System.out.println(StringFormatter.format(list3, 20));

        */
        





        /**
         * Use this to test your ReviewCollector.java class
         

        ArrayList<ProductReview> list = new ArrayList<ProductReview>();
        list.add(new ProductReview("spoon", "best"));
        list.add(new ProductReview("spoon", "Best"));
        list.add(new ProductReview("spoon", "BESR"));
        list.add(new ProductReview("spoon", "abestutensil"));
        list.add(new ProductReview("spoon", "bestthingever"));

        ReviewCollector collector = new ReviewCollector(list);
        collector.addReview(new ProductReview("spoon", "bs"));

        System.out.println(collector.getNumGoodReviews("spoon"));

        */






        /**
         Use this to test your WordScrambler class
         

        String[] array = {"apple", "pear", "this", "cat"};
        WordScrambler scrambler = new WordScrambler(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        String[] array2 = scrambler.mixedWords(array);
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

        */





        /**
         * Use this to test your DailySchedule + Appointment classes
         * your final ouput should be:
         * 
         * 5 3 2 3 4 1 1 3
         * 5 4 2 1 1 
         * true
          

        ArrayList<Appointment> list = new ArrayList<Appointment>();
        list.add(new Appointment(5));
        list.add(new Appointment(3));
        list.add(new Appointment(2));
        list.add(new Appointment(3));
        list.add(new Appointment(4));
        list.add(new Appointment(1));
        list.add(new Appointment(1));
        list.add(new Appointment(3));
        
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).getTime().getInterval() + " ");
        }

        System.out.println();

        DailySchedule schedule = new DailySchedule(list);
        Appointment appt = new Appointment(3);
        ArrayList<Appointment> newList = schedule.clearConflicts(appt);

        for(int i = 0; i < newList.size(); i++){
           System.out.print(newList.get(i).getTime().getInterval() + " ");
        }

        System.out.println();
        System.out.println(schedule.addAppt(appt, true));

        */



        /**
         * Use this to test your Sound class
         

        Sound sound = new Sound();
        for(int i = 0; i < sound.samples.length; i++){
            System.out.print(sound.samples[i] + " ");
        }

        System.out.println();

        sound.limitAmplitude(2000);
        for(int i = 0; i < sound.samples.length; i++){
            System.out.print(sound.samples[i] + " ");
        }

        System.out.println();
        
        sound.trimSilenceFromBeginning();
        for(int i = 0; i < sound.samples.length; i++){
            System.out.print(sound.samples[i] + " ");
        }
        */



        /**
         * Use this to test the 'robot' class
         

         Robot robot = new Robot();

         System.out.println(robot.clearHall());

         for(int i = 0; i < robot.hall.length; i++){
            System.out.print(robot.hall[i]);
         }

         System.out.println();

         System.out.print(robot.pos + "  ");
         */



         

         /**
          * Use this to test the 'trail' class
        

          Trail trail = new Trail();
          System.out.println(trail.isDifficult());
          System.out.println(trail.isLevelTrailSegment(7, 10));
          System.out.println(trail.isLevelTrailSegment(1, 8));
          
          */





          /**
           * Use this to test the Digits class
           

           Digits digit = new Digits(1356);
           for(int i = 0; i < digit.digitList.size(); i++){
                System.out.print(digit.digitList.get(i) + "  ");
           }

           System.out.println(digit.isStrictlyIncreasing());

           System.out.println();

           Digits digit2 = new Digits(133625);
           for(int i = 0; i < digit2.digitList.size(); i++){
                System.out.print(digit2.digitList.get(i) + "  ");
           }

           System.out.println(digit2.isStrictlyIncreasing());

           */
       
    } 

}