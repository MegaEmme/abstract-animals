package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Passerotto extends AbstractAnimale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("Semi");

    }

    @Override
    public void vola() {
        System.out.println("\nPasserotto dice: Sto volando a media altezza\n");
    }
}
