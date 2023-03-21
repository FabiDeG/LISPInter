package verificador;

import java.util.regex.Pattern;

public class vATOM {
	
	public static void realizarA(String atom) {
        String resultado = diferenciador(atom);
        System.out.println(" - Atom operado: " + atom);
        if (resultado == "false") {
        	System.out.println("La respuesta es NIL");
        } else {
        	System.out.println("La respuesta es T");
        }
    }
	
	public static String diferenciador(String atom) {
		String res = "";
		if (atom.startsWith("(atom")) {
			String[] parts = atom.split("\\s+");
			Pattern patronLetras = Pattern.compile("^[a-zA-Z]+$");
			Pattern patronNumeros = Pattern.compile("^\\d+$");
			for (String part : parts) {
				if (patronLetras.matcher(part).matches()) {
					res = "false";
				}
				if (patronNumeros.matcher(part).matches()) {
					res = "true";
			}
				else {
					res = "false";
				}
		}		
	}
		return res;

}
}
