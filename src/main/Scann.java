package main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Scann {
    private List<String> operaciones;
    private List<String> palabras;
    private List<String> vatom;
    private List<String> vdefun;
    private List<String> cequal;
    private List<String> vlist;
    private List<String> vsetq;

    public Scann(List<String> instrucciones) {
        operaciones = new ArrayList<>();
        palabras = new ArrayList<>();
        
        Pattern patronEqual = Pattern.compile("^\\(set\\b[^()]*[<>][^()]*\\)");
        Pattern patronList = Pattern.compile("^\\(list\\b.*\\)");
        Pattern patronAtom = Pattern.compile("^\\(atom\\b.*\\)");
        Pattern patronDefun = Pattern.compile("^\\(defun\\b.*\\)");
        Pattern patronSetq = Pattern.compile("^\\(set\\b.*\\)");
        Pattern patronOperacion = Pattern.compile("\\d+\\s*[+\\-*/]\\s*\\d+");

        for (String instruccion : instrucciones) {
            if (patronOperacion.matcher(instruccion).matches()) {
                operaciones.add(instruccion);
            } else {
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
}
