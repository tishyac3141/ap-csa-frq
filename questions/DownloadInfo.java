package questions;

/**
 * SUPPLEMENTARY TO MUSICDOWNLOADS CLASS
 * GO TO MUSICDOWNLOADS CLASS FOR FULL QUESTION
 */

public class DownloadInfo {

    String title;
    int timesDownloaded = 0;

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