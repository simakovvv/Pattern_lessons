package Strategy;

import Strategy.Movement.IMovement;
import Strategy.Purpose.IPurpose;

import java.util.List;

public abstract class ShipBase {

    protected IMovement mvm;
    protected IPurpose prp;

    public abstract void display();

    public void beep(){
        System.out.println("Beep! Beep!");
    };



    public void move(){
        mvm.move();
    }
    public void doSomething(){
        prp.doSomething();
    }

    public void setMoveBehavior(IMovement mvm){
        this.mvm = mvm;
    }
    public void setPurposeBehavior(IPurpose prp){
        this.prp = prp;
    }
}
