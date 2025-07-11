package org.lessons.java;

import org.lessons.java.interfaces.INuotante;

public class Delfino extends AbstractAnimale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Che verso fa un delfino?");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce palla");

    }

    @Override
    public void nuota() {
        System.out.println("\nDelfino dice: Nuoto a pelo d'acqua, ma anche un po più giu!\n");
    }
}
