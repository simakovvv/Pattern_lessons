package Facade;

import Facade.WachingMachine.*;

public class Main {
    public static void main(String[] args) {
        Object water = new WaterManagingSubsystem();
        Object termo = new Termo();
        Object engine = new Engine();
        Object dryer = new Dryer();

        Object washingMashine = new WachingMachine(dryer, engine,termo,water);
        System.out.println("Cotton");
        ((WachingMachine) washingMashine).WachCotton();
        System.out.println("Whool");
        ((WachingMachine) washingMashine).WashWool();




    }
}
