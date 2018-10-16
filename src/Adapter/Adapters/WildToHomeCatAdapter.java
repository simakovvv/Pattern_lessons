package Adapter.Adapters;

import Adapter.HomeCats.IHomeCat;
import Adapter.WildCat.IWildCat;
import Strategy.Sheeps.HoverCraft;

public class WildToHomeCatAdapter implements IHomeCat {
    private IWildCat wildCat;
    public WildToHomeCatAdapter(IWildCat wildCat){
        this.wildCat = wildCat;
    }
    @Override
    public String getName() {
        return wildCat.getBreed();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void Meow() {
        wildCat.Growl();
    }

    @Override
    public void Skratch() {
        wildCat.Scratch();
    }
}
