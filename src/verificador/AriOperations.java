package verificador;

import java.util.Stack;
import java.util.StringTokenizer;

public class AriOperations {
	
	// Were we take all the operations, we eliminate all the blank spaces and turn infix to postfix, then we evaluate 
	public static void operar(String operacion) {
        	String operaciones = operacion.replaceAll("\\s", "");
		    String postfix = infixToPostfix(operaciones);
		    int resultado = evaluarPostfix(postfix);
		    System.out.println(" - Operado: " + operacion);
		    System.out.println("Resultado = " + resultado);

	}
	
	public static int importancia(char op) {
	    switch (op) {
	        case '+':
	        case '-':
	            return 1;
	        case '*':
	        case '/':
	            return 2;
	        case '^':
	            return 3;
	        default:
	            return -1;
	    }
	}
	
	public static String infixToPostfix(String infix) {
	    Stack<Character> stack = new Stack<>(); //Se crea una pila (Stack<Character> stack) para almacenar operadores y parentesis
	    StringBuilder postfix = new StringBuilder();  //Se crea un StringBuilder postfix para almacenar la expresion posfix resultante
	    for (int i = 0; i < infix.length(); i++) {
	        char c = infix.charAt(i);
	        if (Character.isLetterOrDigit(c)) { //Si c es un caracter alfabetico o un digito, se añade directamente a la expresion posfix (postfix.append(c))
	            postfix.append(c);
	        } else if (c == '(') { // Si c es un parentesis abierto '(', se empuja en la pila (stack.push(c))
	            stack.push(c);
	        } else if (c == ')') { // Si c es un parentesis cerrado ')', se desapila y añade a la expresion posfija todos los operadores hasta encontrar un parentesis abierto '('. Luego, se desapila el parentesis abierto (stack.pop()
	            while (!stack.isEmpty() && stack.peek() != '(') {
	                postfix.append(stack.pop());
	            }
	            stack.pop();
	        } else {
	            while (!stack.isEmpty() && importancia(c) <= importancia(stack.peek())) {
	                postfix.append(stack.pop());
	            }
	            stack.push(c);
	        }
	    }
	    while (!stack.isEmpty()) {
	        postfix.append(stack.pop());
	    }
	    return postfix.toString();
	}
	
	public static int evaluarPostfix(String postfix) {
	    Stack<Integer> stack = new Stack<>();
	    for (int i = 0; i < postfix.length(); i++) {
	        char c = postfix.charAt(i);
	        if (Character.isLetterOrDigit(c)) {
	            stack.push(Character.getNumericValue(c));
	        } else {
	            int val1 = stack.pop();
	            int val2 = stack.pop();
	            switch (c) {
	                case '+':
	                    stack.push(val2 + val1);
	                    break;
	                case '-':
	                    stack.push(val2 - val1);
	                    break;
	                case '*':
	                    stack.push(val2 * val1);
	                    break;
	                case '/':
	                    stack.push(val2 / val1);
	                    break;
	            }
	        }
	    }
	    return stack.pop();
	}

    
    

}
