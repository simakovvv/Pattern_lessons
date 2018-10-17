package Template.Food;

public class Hamburger extends FastFood {


    public void AddSause(){
        System.out.println("Ketchup");
    }
    public void FryMeatIngredient(){
        System.out.println("Meat");
    }

    @Override
    public String toString() {
        return "Hamburger:";
    }
    @Override
    public boolean CustomerWantsSause(){
        return false;
    }
}
