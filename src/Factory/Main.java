package Factory;


import Factory.Fasillities.DeuchVolswagenFasility;
import Factory.Fasillities.RussianVolswagenFasility;
import Factory.Fasillities.VoltswagerFasilities;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        VoltswagerFasilities v = new DeuchVolswagenFasility();
        v.getCar("Golf");
        System.out.println();
        v.getCar("Passat");
        System.out.println();
        v.getCar("Tiguan");
        System.out.println();
        v.getCar("Tuareg");
        System.out.println();
    }
}
