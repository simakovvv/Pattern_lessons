package Template.Food;

public abstract class FastFood {
    public void Prepare(){
        RoastBread();
        FryMeatIngredient();
        PutVegetables();
        if(CustomerWantsSause())
           AddSause();
    }
    public abstract void FryMeatIngredient();
    public abstract void AddSause();
    public boolean CustomerWantsSause(){
        return true;
    }

    public void PutVegetables(){
        System.out.println("Vegetables");
    }
    public void RoastBread(){
        System.out.println("Bread");
    }
}
