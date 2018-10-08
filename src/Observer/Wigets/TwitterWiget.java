package Observer.Wigets;

import Observer.News.ISubject;

public class TwitterWiget implements IObserver {
    private String twitter;
    private ISubject subject;
    public TwitterWiget(ISubject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void Update(String twitter, String lenta, String tv){
        this.twitter = twitter ;
        Display();
    }
    public void Display(){
        System.out.println("Twitter:%s"+ twitter);
    }

    @Override
    public void removeFromSubject() {
        subject.removeObserver(this);
    }
}
