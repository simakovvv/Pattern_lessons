package Observer.Wigets;

public interface IObserver {
    void Update(String twitter, String lenta, String tv);
    void Display();
    void removeFromSubject();
}
