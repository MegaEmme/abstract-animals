package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Aquila extends AbstractAnimale implements IVolante {

    public Aquila() {
    };

    @Override
    public void verso() {
        System.out.println("Che verso fa un aquila?");
    }

    @Override
    public void mangia() {
        System.out.println("Topi");
    }

    @Override
    public void vola() {
        System.out.println("\nAquila dice: Io invece volo molto molto più in alto\n");
    }
}
