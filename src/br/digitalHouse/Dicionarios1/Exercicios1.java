package br.digitalHouse.Dicionarios1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicios1 {

    public static void main(String[] args) {

    Map<Integer, String> loteriaDosSonhos = new HashMap<>();

    loteriaDosSonhos.put(0, "Ovos");
    loteriaDosSonhos.put(1, "Água");
    loteriaDosSonhos.put(2, "Escopeta");
    loteriaDosSonhos.put(3, "Cavalo");
    loteriaDosSonhos.put(4, "Dentista");
    loteriaDosSonhos.put(5, "Fogo");

        for (Integer chave : loteriaDosSonhos.keySet() ){
            String valor = loteriaDosSonhos.get(chave);
            System.out.println(valor);
        }

        List<String> João = new ArrayList<>();
        João.add("Juan");
        João.add("Fissura");
        João.add("Maromba");

        List<String> Miguel = new ArrayList<>();
        Miguel.add("Night Watch");
        Miguel.add("Bruce Wayne");
        Miguel.add("Tampinha");

        List<String> Maria = new ArrayList<>();
        Maria.add("Wonder Woman");
        Maria.add("Mary");
        Maria.add("Marilene");

        List<String> Lucas = new ArrayList<>();
        Lucas.add("Lukinha");
        Lucas.add("Jorge");
        Lucas.add("George");

        Map<String, ArrayList> listaApelidos = new HashMap();
        listaApelidos.put("João",(ArrayList) João);
        listaApelidos.put("Miguel", (ArrayList) Miguel);
        listaApelidos.put("Maria", (ArrayList) Maria);
        listaApelidos.put("Lucas", (ArrayList) Lucas);


        for (String chave : listaApelidos.keySet()){
            ArrayList string = listaApelidos.get(chave);
            System.out.println(string);
        }










    }
}
