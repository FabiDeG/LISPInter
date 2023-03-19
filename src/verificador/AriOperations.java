package verificador;

import java.util.Stack;
import java.util.StringTokenizer;

public class AriOperations {
	
	public static void operar(String operacion) {
		
		    String postfix = infixToPostfix(operacion);
		    int resultado = evaluarPostfix(postfix);
		    System.out.println(" - Operado: " + operacion);
		    System.out.println("Resultado = " + resultado);

	}
	
	public static int precedencia(char op) {
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
	    Stack<Character> stack = new Stack<>();
	    StringBuilder postfix = new StringBuilder();
	    for (int i = 0; i < infix.length(); i++) {
	        char c = infix.charAt(i);
	        if (Character.isLetterOrDigit(c)) {
	            postfix.append(c);
	        } else if (c == '(') {
	            stack.push(c);
	        } else if (c == ')') {
	            while (!stack.isEmpty() && stack.peek() != '(') {
	                postfix.append(stack.pop());
	            }
	            stack.pop();
	        } else {
	            while (!stack.isEmpty() && precedencia(c) <= precedencia(stack.peek())) {
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
