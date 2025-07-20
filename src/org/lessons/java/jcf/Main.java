package org.lessons.java.jcf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // // Collection - List - ArrayList

        // ArrayList<String> listaDiStringhe = new ArrayList<>(); // creo array di
        // stringhe

        // listaDiStringhe.add("Prima frase"); // aggiungo elementi
        // listaDiStringhe.add("Seconda frase");
        // listaDiStringhe.add("Terza frase");
        // listaDiStringhe.add("Quarta frase");

        // System.out.println(listaDiStringhe);

        // listaDiStringhe.addFirst("Zero frase"); // aggiungo elemento in cima

        // System.out.println(listaDiStringhe);

        // listaDiStringhe.addLast("Ultima frase"); // aggiungo elemento in fondo

        // System.out.println(listaDiStringhe);

        // System.out.println(listaDiStringhe.get(2)); // prendo valore a indice 2

        // for (String element : listaDiStringhe) { // ciclo forEach
        // System.out.println(element);
        // }

        // for (int i = 0; i < listaDiStringhe.size(); i++) { // ciclo for
        // System.out.println(listaDiStringhe.get(i));
        // }

        // listaDiStringhe.remove(3); // rimuovo elemento indice 3

        // System.out.println(listaDiStringhe);

        // Collection - Set - HashSet

        // Set<Integer> insiemeDiNumeri = new HashSet<>();

        // insiemeDiNumeri.add(55);
        // insiemeDiNumeri.add(55); // non posso avere elementi duplicati
        // insiemeDiNumeri.add(-155);
        // insiemeDiNumeri.add(4);
        // insiemeDiNumeri.add(-1);
        // insiemeDiNumeri.add(2);
        // insiemeDiNumeri.add(3);

        // System.out.println(insiemeDiNumeri);

        // for (Integer integer : insiemeDiNumeri) {
        // System.out.println(integer);
        // }

        // // insiemeDiNumeri.clear(); // svuota il Set

        // System.out.println(insiemeDiNumeri);

        // System.out.println(insiemeDiNumeri.contains(2)); // true

        // Map - HashMap

        Map<String, Integer> nomiNumeri = new HashMap<>();

        nomiNumeri.put("Gina", 11);
        nomiNumeri.put("Ginetto", 145);
        nomiNumeri.put("Ginettina", 11);
        nomiNumeri.put("Ginettino", 11);
        nomiNumeri.put("Ada", 15);
        nomiNumeri.put("Francesco", 35);

        System.out.println(nomiNumeri);

        // for (String chiave : nomiNumeri.keySet()) { // ciclo forEach sulle KEY
        // System.out.println(chiave);
        // }

        // for (Integer valore : nomiNumeri.values()) { // ciclo forEach sulle VALUE
        // System.out.println(valore);
        // }

        for (String chiave : nomiNumeri.keySet()) { // ciclo forEach sulle KEY con annessa ricezione di VALUE
            System.out.println(chiave);
            System.out.println(nomiNumeri.get(chiave));
        }
    }
}
