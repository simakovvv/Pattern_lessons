package Adapter;

import Adapter.HomeCats.IHomeCat;

import java.util.Formatter;

public class CatInfoPrinter {
    public static void PrintCatInfo(IHomeCat cat){
        System.out.println("Кошачье досье:");
        System.out.println(new Formatter().format("Имя кота : %s",cat.getName()));
        System.out.print("Вид мяуканья: ");
        cat.Meow();
        System.out.print("Вид царапанья: ");
        cat.Skratch();
        System.out.println();


    }
}
