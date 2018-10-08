package Observer.Wigets;

import Observer.News.ISubject;

public class TvWiget implements IObserver {
    private String tv;
    private ISubject subject;
    public TvWiget(ISubject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void Update(String twitter, String lenta, String tv){
        this.tv = tv;
        Display();
    }
    public void Display(){
        System.out.println("TV:%s"+ tv);
    }

    @Override
    public void removeFromSubject() {
        subject.removeObserver(this);
    }
}
