package questions;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {

    private List<DownloadInfo> downloadList;

    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }

    /**
     * Write the MusicDownloads method getDownloadInfo, which returns a reference to a DownloadInfo 
     * object if an object with a title that matches the parameter title exists in the downloadList. 
     * If no song in downloadList has a title that matches the parameter title, the method returns null.
     */
    public DownloadInfo getDownloadInfo(String title){
        //your code here
        return null;
    }

    /**
     * Write the MusicDownloads method updateDownloads, which takes a list of song titles as a parameter. 
     * For each title in the list, the method updates downloadList, either by incrementing the download 
     * count if a DownloadInfo object with the same title exists, or by adding a new DownloadInfo object 
     * with that title and a download count of 1 to the end of the list. When a new DownloadInfo object is 
     * added to the end of the list, the order of the already existing entries in downloadList remains unchanged.
     * 
     * For example, let's say prior to calling 'updateDownloads()', downloadList contained the following:
     * (DC stands for download count)
     * 
     * "Hey Jude" (DC = 5), "Soul Sister" (DC = 3), "Aqualung" (DC = 10)
     * 
     * After calling updateDownloads with the following String list being passed:
     * 
     * {"Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"}
     * 
     * downloadList will look like the following:
     * 
     * "Hey Jude" (DC = 5), "Soul Sister" (DC = 5), "Aqualung" (DC = 11), "Lights" (DC = 2), "Go Now" (DC = 1)
     */
    public void updateDownloads(List<String> titles){
        //your code here
    }

}