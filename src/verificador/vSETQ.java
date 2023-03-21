package verificador;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class vSETQ {

    public static void realizarS(String setq) {
        Map<String, ArrayList<String>> resultado = creadorS(setq);
        System.out.println(" - Setq operado: " + setq);
        System.out.println("Nombre y lo que contiene: " + resultado);
    }

    public static Map<String, ArrayList<String>> creadorS(String setq) {
        Map<String, ArrayList<String>> arrayLists = new HashMap<>();
        String[] words = setq.split(" "); // Por medio de espacios, se divide el setq
        ArrayList<String> currentArrayList = null;
        String currentArrayListName = null;

        for (int i = 0; i < words.length; i++) {
            if ("(setq".equals(words[i])) { // Se crea ArrayList si la palabra es "setq" y agregarla al mapa con el nombre siguiente
                currentArrayListName = words[i + 1];
                currentArrayList = new ArrayList<>();
                arrayLists.put(currentArrayListName, currentArrayList);
            } else if (currentArrayList != null && !words[i].equals(currentArrayListName)) { 
                currentArrayList.add(words[i]); // Se agrega elementos a la ArrayList actual
            }
        }
        return arrayLists;
    }
}
