package verificador;

public class vEQUAL {
	
	public static void realizarE(String equal) {
        boolean resultado = diferenciador(equal);
        System.out.println(" - Equal operado: " + equal);
        System.out.println("La respuesta : " + resultado);
    }

	public static boolean diferenciador(String equal) {
		if (equal.startsWith("(equal")) {
            String[] parts = equal.split("\\s+");
            int num1 = Integer.parseInt(parts[1]);
            int num2 = Integer.parseInt(parts[2].replace(")", ""));
            if (parts[2].startsWith("(")) {
                num2 = diferenciador(parts[2]) ? 1 : 0;
            } else {
                num2 = Integer.parseInt(parts[2].replace(")", ""));
            }
            return num1 == num2;
        } if (equal.startsWith("(<")) {
            String[] parts = equal.split("\\s+");
            int num1 = Integer.parseInt(parts[1]);
            int num2 = 0;
            if (parts[2].startsWith("(")) {
                num2 = diferenciador(parts[2]) ? 1 : 0;
            } else {
                num2 = Integer.parseInt(parts[2].replace(")", ""));
            }
            return num1 < num2;
        } if (equal.startsWith("(>")) {
            String[] parts = equal.split("\\s+");
            int num1 = Integer.parseInt(parts[1]);
            int num2 = 0;
            if (parts[2].startsWith("(")) {
                num2 = diferenciador(parts[2]) ? 1 : 0;
            } else {
                num2 = Integer.parseInt(parts[2].replace(")", ""));
            }
            return num1 > num2;
            
        } else {
            // Invalid expression
            return false;
        }    }
	
}
