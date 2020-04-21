package solutions;

public class DownloadInfo {

    String title;
    int timesDownloaded = 0;

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