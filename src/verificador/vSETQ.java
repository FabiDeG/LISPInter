package verificador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class vSETQ {
	
	public static void realizarS(String setq) {
	    String resultado = creadorS(setq);
	    System.out.println(" - Setq operado: " + setq);
	    System.out.println("Resultado = " + resultado);

}

	public static String creadorS(String setq) {
        Map<String, ArrayList<String>> arrayLists = new HashMap<>();
        String[] words = setq.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if ("setq".equals(words[i])) {
                // Crear ArrayList si la palabra es "setq" y agregarla al mapa con el nombre siguiente
                String arrayListName = words[i + 1];
                ArrayList<String> arrayList = new ArrayList<>();
                arrayLists.put(arrayListName, arrayList);

                // Agregar el elemento siguiente a la ArrayList
                if (i + 2 < words.length) {
                    String elemento = words[i + 2];
                    arrayList.add(elemento);
                }
            }
        }

        // Mostrar el contenido del mapa y las ArrayLists
        for (Map.Entry<String, ArrayList<String>> entry : arrayLists.entrySet()) {
        	String nombreA = entry.getKey();
        	
            System.out.println("Nombre del ArrayList: " + entry.getKey());
            System.out.println("Contenido del ArrayList: " + entry.getValue());
            return (nombreA);
        }

		return (nombreA, setq);
		
	}
	
}
