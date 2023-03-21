package verificador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class vLIST {
	
	public static void realizarL(String list) {
        Map<String, ArrayList<String>> resultado = creadorL(list);
        System.out.println(" - Lista operada: " + list);
        System.out.println("Lo que contiene la lista: " + resultado);
    }

    public static Map<String, ArrayList<String>> creadorL(String list) {
        Map<String, ArrayList<String>> arrayLists = new HashMap<>();
        String[] words = list.split(" "); // Por medio de espacios, se divide el setq
        ArrayList<String> currentArrayList = null;
        String currentArrayListName = null;

        for (int i = 0; i < words.length; i++) {
            if ("(list".equals(words[i])) { // Se crea ArrayList si la palabra es "list" y agregarla al mapa con el nombre siguiente
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