package Template.Food;

public class HotDog extends FastFood {

    public void FryMeatIngredient(){
        System.out.println("Sausage");

    }
    public void AddSause(){
        System.out.println("Ketchup");
        System.out.println("Mustard");
    }

    @Override
    public String toString() {
        return "HotDog:";
    }
}
