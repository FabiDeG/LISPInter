package verificador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vDEFUN {

	public static Map<String, ArrayList<String>> recepcion(List<String> defuns) {
		
        Map<String, ArrayList<String>> arrayLists = new HashMap<>();
		
		ArrayList<String> currentArrayList = null;
        String currentArrayListName = null;
        
		 for (String defun : defuns) {
			 String[] words = defun.split(" ");
			 for (int i = 0; i < words.length; i++) {
		            if ("(defun".equals(words[i])) {
		            	 currentArrayListName = words[i + 1];
		                 currentArrayList = new ArrayList<>();
		                 arrayLists.put(currentArrayListName, currentArrayList);
		             } else if (currentArrayList != null && !words[i].equals(currentArrayListName)) { 
		                 currentArrayList.add(words[i]); // Se agrega elementos a la ArrayList actual
		             }
		         }
		         return arrayLists;
		            }
		return arrayLists;
		 }

}

