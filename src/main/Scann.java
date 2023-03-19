package main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Scann {
    private List<String> operaciones;
    private List<String> palabras;
    private List<String> vatom;
    private List<String> vdefun;
    private List<String> vequal;
    private List<String> vlist;
    private List<String> vsetq;
    private List<String> vcond;

    // We will take every instruction that is in the list and it depends if it matches with a pattert the instruction will go to an arraylist
    public Scann(List<String> instrucciones) {
        operaciones = new ArrayList<>();
        palabras = new ArrayList<>();
        vsetq = new ArrayList<>();
        vatom = new ArrayList<>();
        vdefun = new ArrayList<>();
        vequal = new ArrayList<>();
        vlist = new ArrayList<>();
        vcond = new ArrayList<>();
        
        //Pattern patronEqual = Pattern.compile("^\\(equal\\b[^()]*\\((<|>)\\)[^()]*\\)");
        Pattern patronEqual1 = Pattern.compile("^\\(equal\\b.*\\)");
        Pattern patronEqual2 = Pattern.compile("^[(][ ]*[>][ ]+([a-z]+|[0-9]+)+[ ]+([a-z]+|[0-9]+)+[ ]*[)]$");
        Pattern patronEqual3 = Pattern.compile("^[(][ ]*[<][ ]+([a-z]+|[0-9]+)+[ ]+([a-z]+|[0-9]+)+[ ]*[)]$");
        Pattern patronList = Pattern.compile("^\\(list\\b.*\\)");
        Pattern patronAtom = Pattern.compile("^\\(atom\\b.*\\)");
        Pattern patronCond = Pattern.compile("^\\(cond\\b.*\\)");
        boolean inCond = false;
        Pattern patronDefun = Pattern.compile("^\\(defun\\b.*\\)");
        boolean inDefun = false;
        int contadorA = 0;
        int contadorB = 0;
        Pattern patronSetq = Pattern.compile("^\\(setq\\b.*\\)");
        Pattern patronOperacion = Pattern.compile("^(\\(\\+|\\(\\-|\\(\\*|\\(/).*");

        for (String instruccion : instrucciones) {
            if (patronOperacion.matcher(instruccion).matches()) { // if the instruction contains an operation it will go to the Array operaciones
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		operaciones.add(instruccion);
            	} else { 
            	}	
            }
            if (patronSetq.matcher(instruccion).matches()){
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vsetq.add(instruccion);
            	} else { 
            	}
            }
            if (patronDefun.matcher(instruccion).matches()) { // if the instruction contains a defun
            	inDefun = true; // it will make inDefun true and save the instruction in vdefun
            }
            if (inDefun == true) { // then, if we pass to the other instruction and inDefun stills true
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contadorA++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contadorB++;
                        }
            	}
            	if (contadorA > contadorB) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vdefun.add(instruccion); // it will take the instruction and put it in insdefun so then it can be made it with the instructions in inDefun
            		inDefun = true;
            	} else { // when finally the counters are the same, that means that all the pairs of () are complete, we will take that instruction
            		vdefun.add(instruccion); // we will save it
            		inDefun = false; // and change inDefun so this process can take other place
            	}
            }
            
            if (patronList.matcher(instruccion).matches()) { 
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vlist.add(instruccion);
            	} else { 
            	}	
            }

            if (patronEqual1.matcher(instruccion).matches()) { 
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vequal.add(instruccion);
            	} else { 
            	}	
            }
            if (patronEqual2.matcher(instruccion).matches()) { 
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vequal.add(instruccion);
            	} else { 
            	}	
            }
            
            if (patronEqual3.matcher(instruccion).matches()) { 
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vequal.add(instruccion);
            	} else { 
            	}	
            }
            
            if (patronAtom.matcher(instruccion).matches()) { 
            	int contador = 0;
                int contado = 0;
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contador++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contado++;
                        }
            	}
            	if (contador == contado) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vatom.add(instruccion);
            	} else { 
            	}	
            }
            
            if (patronCond.matcher(instruccion).matches()) { // if the instruction contains a cond
            	inCond = true; // it will make inDefun true and save the instruction in vcond
            }
            if (inCond == true) { // then, if we pass to the other instruction and inDefun stills true
            	for (int i = 0; i < instruccion.length(); i++) {
                    if (instruccion.charAt(i) == '(') { // we will count the ( that the instruction have and make a counterA
                        contadorA++;
                    }}
            	for (int i = 0; i < instruccion.length(); i++) {
            		if (instruccion.charAt(i) == ')') { // then we will count the ) that the instruction have
            			contadorB++;
                        }
            	}
            	if (contadorA > contadorB) { // then we will compare the counters and if the counterA is bigger than the counterB
            		vcond.add(instruccion); // it will take the instruction and put it in incond so then it can be made it with the instructions in inCond
            		inCond = true;
            	} else { // when finally the counters are the same, that means that all the pairs of () are complete, we will take that instruction
            		vcond.add(instruccion); // we will save it
            		inCond = false; // and change inDefun so this process can take other place
            	}
            }

            
            else {
                palabras.add(instruccion);
            }
        }
    }

    public List<String> getOperaciones() {
        return operaciones;
    }

    public List<String> getPalabras() {
        return palabras;
    }
    
    public List<String> getSetq() {
        return vsetq;
    }
    
    public List<String> getDefun() {
        return vdefun;
    }
    
    public List<String> getAtom() {
        return vatom;
    }
    
    public List<String> getEqual() {
        return vequal;
    }
    
    public List<String> getList() {
        return vlist;
    }
    
    public List<String> getCond() {
        return vcond;
    }
}
