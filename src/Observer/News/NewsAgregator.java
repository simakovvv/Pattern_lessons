package Observer.News;

import Observer.Wigets.IObserver;
import Observer.Wigets.LentaWiget;
import Observer.Wigets.TvWiget;
import Observer.Wigets.TwitterWiget;

import java.util.*;

public class NewsAgregator implements ISubject {
    private static TwitterWiget twitterWiget;
    private static LentaWiget lentaWiget;
    private static TvWiget tvWiget;
    private static Random random;
    private List<IObserver> observers;

    public NewsAgregator(){
        twitterWiget = new TwitterWiget(getTwitterWiget());
        lentaWiget = new LentaWiget();
        tvWiget = new TvWiget();
        random = new Random();
        observers = new LinkedList<>();
    }
    public static String getTwitterWiget() {
        ArrayList <String> news = new ArrayList<>();
        news.add(   "News from twitter 1");
        news.add(   "News from twitter 2");
        news.add(   "News from twitter 3");

        return news.get(random.nextInt(3));
    }
    public static String getLentaWiget() {
        ArrayList <String> news = new ArrayList<>();
        news.add(   "News from lenta 1");
        news.add(   "News from lenta 2");
        news.add(   "News from lenta 3");

        return news.get(random.nextInt(3));

    }
    public static String getTvWiget() {
        ArrayList <String> news = new ArrayList<>();
        news.add(   "News from tv 1");
        news.add(   "News from tv 2");
        news.add(   "News from tv 3");

        return news.get(random.nextInt(3));
    }

    public void NewNewsAvailable(){

        notifyObserver();
    }


    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer:observers) {
            observer.Update(getTwitterWiget(),getLentaWiget(),getTvWiget());
        }
    }
}
