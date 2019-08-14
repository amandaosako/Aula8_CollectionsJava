package br.digitalHouse.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");

        for(String valor: conjunto){
            System.out.println(valor);

        }

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "Legal");
        mapa.put(7, "Chato");
        mapa.put(10, "Cool");
        mapa.put(17, "Boring");
        mapa.put(28, "Done");

        mapa.remove(5);

        for (Integer chave : mapa.keySet() ){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

        List<String> lista = new ArrayList<>();
        lista.add("Alberto");
        lista.add("Clementina");
        lista.add("Irineu");
        lista.add("BB");

        lista.remove (2);

        for (String valor : lista){
            System.out.println(valor);
        }

        String valor = lista.get(1);
        System.out.println(lista.get(1));




    }
}
