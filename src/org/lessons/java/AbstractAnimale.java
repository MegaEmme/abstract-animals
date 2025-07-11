package org.lessons.java;

public abstract class AbstractAnimale {
    // Dormire è uguale per tutti ed è definito qua
    public void dormi() {
        System.out.println("Ronf");
    }

    // verso e cibo sono diversi per ogni aniimale e quindi non li popolo ma lo
    // lascio fare a loro
    public abstract void verso();

    public abstract void mangia();
}
