package Observer;

import Observer.News.NewsAgregator;
import Observer.Wigets.IObserver;
import Observer.Wigets.LentaWiget;
import Observer.Wigets.TvWiget;
import Observer.Wigets.TwitterWiget;

import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        NewsAgregator newsAgregator = new NewsAgregator();
        TwitterWiget twitterWiget = new TwitterWiget(newsAgregator);
        TvWiget tvWiget = new TvWiget(newsAgregator);
        LentaWiget lentaWiget = new LentaWiget(newsAgregator);

       newsAgregator.NewNewsAvailable();
       System.out.println();

       twitterWiget.removeFromSubject();
       newsAgregator.NewNewsAvailable();
       System.out.println();

    }
}
