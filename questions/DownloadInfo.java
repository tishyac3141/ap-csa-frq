package questions;

/**
 * SUPPLEMENTARY TO MUSICDOWNLOADS CLASS
 * GO TO MUSICDOWNLOADS CLASS FOR FULL QUESTION
 */

public class DownloadInfo {

    String title;
    //always start at 1 (yes this is important)
    int timesDownloaded = 1;

    public DownloadInfo(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }


    public void incrementTimesDownloaded(){
        timesDownloaded++;
    }
}