package titeam.alexstars.tabviewfragment;

/**
 * Created by ITI on 12/20/2016.
 */
public class News {
    String newsTitle;
    String news;

    public News(String newsTitle, String news) {
        this.newsTitle = newsTitle;
        this.news = news;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
