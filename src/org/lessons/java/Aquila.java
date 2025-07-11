package org.lessons.java;

public class Aquila extends AbstractAnimale {

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
}
