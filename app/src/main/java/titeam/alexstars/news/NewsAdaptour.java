package titeam.alexstars.news;

/**
 * Created by bassemabbas on 12/18/16.
 */

public class NewsAdaptour {
    private int newsimage;
    private String title;
    private String descrption;

    public NewsAdaptour(int newsimage, String title, String descrption) {
        this.newsimage = newsimage;
        this.title = title;
        this.descrption = descrption;
    }

    public NewsAdaptour() {
    }

    public int getNewsimage() {
        return newsimage;
    }

    public void setNewsimage(int newsimage) {
        this.newsimage = newsimage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
