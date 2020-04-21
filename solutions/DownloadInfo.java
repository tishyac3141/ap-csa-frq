package solutions;

public class DownloadInfo {

    String title;
    //always automatically starts at 1 (yes this is important)
    int timesDownloaded = 1;

    public DownloadInfo(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public int getTimesDownloaded(){
        return timesDownloaded;
    }

    public void incrementTimesDownloaded(){
        timesDownloaded++;
    }

}