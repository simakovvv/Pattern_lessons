package Adapter;

import Adapter.Adapters.WildToHomeCatAdapter;
import Adapter.HomeCats.IHomeCat;
import Adapter.HomeCats.PedigreedCat;
import Adapter.HomeCats.YardCat;
import Adapter.WildCat.IWildCat;
import Adapter.WildCat.Tiger;

public class Main {
    public static void main(String[] args) {
        IHomeCat vaska = new YardCat();
        vaska.setName("Васька");
        CatInfoPrinter.PrintCatInfo(vaska);

        IHomeCat vanger = new PedigreedCat();
        vanger.setName("Вангер");
        CatInfoPrinter.PrintCatInfo(vanger);

        IWildCat tiger = new Tiger();
        WildToHomeCatAdapter adapter = new WildToHomeCatAdapter(tiger);
        CatInfoPrinter.PrintCatInfo(adapter);
    }
}
