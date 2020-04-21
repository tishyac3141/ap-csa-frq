package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * HAS DOWNLOADINFO.JAVA AS A SUPPLEMENTARY CLASS
 */

public class MusicDownloads {

    private List<DownloadInfo> downloadList;

    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();
    }

    //for test purposes only, not included in original question
    public MusicDownloads(ArrayList<DownloadInfo> list){
        downloadList = list;
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

    public void updateDownloads(List<String> titles){

        String currentTitle;
        DownloadInfo current;

        for(int i = 0; i < titles.size(); i++){
            currentTitle = titles.get(i);

            current = getDownloadInfo(currentTitle);

            if(current == null){
                DownloadInfo toAdd = new DownloadInfo(currentTitle);
                downloadList.add(toAdd);
            }
            else{
                current.incrementTimesDownloaded();
            }
        }
    }
    
    //for test purposes only, not included in original question
    public List<DownloadInfo> getList(){
        return downloadList;
    }
}