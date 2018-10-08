package Observer.Wigets;

import Observer.News.ISubject;

public class LentaWiget implements IObserver {
    private String lenta;
    private ISubject subject;
    public LentaWiget(ISubject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void Update(String twitter, String lenta, String tv){
        this.lenta = lenta ;
        Display();
    }
    public void Display(){
        System.out.println("Lenta:%s"+ lenta);
    }

    @Override
    public void removeFromSubject() {
        subject.removeObserver(this);
    }
}
