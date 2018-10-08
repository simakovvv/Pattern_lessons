package Observer.News;

import Observer.Wigets.IObserver;

public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}
