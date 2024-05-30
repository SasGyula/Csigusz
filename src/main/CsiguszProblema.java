package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Csigusz;

public class CsiguszProblema {

    public static void main(String[] args) {
        try {
            Csigusz cs1 = new Csigusz("cs-1");
            feladat(cs1);
            Csigusz cs2 = new Csigusz("cs-2", Csigusz.Szinek.PIROS);
            feladat(cs2);
            Csigusz cs4 = new Csigusz("Xy-4", Csigusz.Szinek.KEK);
            feladat(cs4);
            Csigusz cs5 = new Csigusz("Xy-5", Csigusz.Szinek.ZOLD);
            feladat(cs5);
        } catch (Exception ex) {
            //Logger.getLogger(CsiguszProblema.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("--Egy csiga nem jött létre--");
            System.out.println("A hiba oka " + ex.getMessage());
        }
    }

    private static void feladat(Csigusz cs1) {
        System.out.println(cs1.toString());
    }

}
