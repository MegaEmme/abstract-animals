package org.lessons.java;

import org.lessons.java.interfaces.INuotante;

public class Cane extends AbstractAnimale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Croccantini");

    }

    @Override
    public void nuota() {
        System.out.println("\nCane dice: Io al massimo posso entrare in piscina o a riva\n");
    }
}
