package solutions;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {

    private List<DownloadInfo> downloadList;

    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }

    public DownloadInfo getDownloadInfo(String title){
        if(downloadList.size() == 0) return null;

        DownloadInfo other;
        for(int i = 0; i < downloadList.size(); i++){
            other = downloadList.get(i);
            if(other.getTitle().equals(title) ){
                return other;
            }
        }
        return null;
    }

}