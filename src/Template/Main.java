package Template;

import Template.Food.Hamburger;
import Template.Food.HotDog;

public class Main {
    public static void main(String[] args) {

        Object hamburger = new Hamburger();
        Object hotdog = new HotDog();

        System.out.println(hamburger.toString());
        ((Hamburger) hamburger).Prepare();
        System.out.println();
        System.out.println(hotdog.toString());
        ((HotDog) hotdog).Prepare();
    }
}
