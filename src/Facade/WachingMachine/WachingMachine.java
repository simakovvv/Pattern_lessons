package Facade.WachingMachine;

public class WachingMachine {
    private Dryer dryer;
    private Engine engine;
    private Termo termo;
    private WaterManagingSubsystem water;

    public WachingMachine(Object dryer, Object engine, Object termo, Object water){
        this.dryer = (Dryer) dryer;
        this.engine = (Engine) engine;
        this.termo = (Termo) termo;
        this.water = (WaterManagingSubsystem) water;
    }
    public void WachCotton(){

        //Cotton
        ((WaterManagingSubsystem) water).FillWater(10);
        ((Termo) termo).WarmUp(70);
        ((Engine) engine).rotate();
        ((Engine) engine).rotate();
        ((Engine) engine).rotate();
        ((Engine) engine).stop();
        ((WaterManagingSubsystem) water).EmptyWater();
        ((Dryer) dryer).dry(30,1000);
        System.out.println();
        ((WaterManagingSubsystem) water).FillWater(15);
        ((Termo) termo).WarmUp(50);
        ((Engine) engine).rotate();
        ((Engine) engine).rotate();
        ((Engine) engine).rotate();
        ((Engine) engine).stop();
        ((WaterManagingSubsystem) water).EmptyWater();
        System.out.println();
        ((Dryer) dryer).dry(60,1500);
    }
    public void WashWool(){
        //Wool
        ((WaterManagingSubsystem) water).FillWater(7);
        ((Termo) termo).WarmUp(30);

        ((Engine) engine).rotate();
        ((Engine) engine).stop();
        ((WaterManagingSubsystem) water).EmptyWater();
        ((Dryer) dryer).dry(20,500);
        System.out.println();
        ((WaterManagingSubsystem) water).FillWater(10);
        ((Termo) termo).WarmUp(30);

        ((Engine) engine).rotate();
        ((Engine) engine).stop();
        ((WaterManagingSubsystem) water).EmptyWater();
        System.out.println();
        ((Dryer) dryer).dry(60,700);
    }
}
