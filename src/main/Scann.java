package main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Scann {
    private List<String> operaciones;
    private List<String> palabras;

    public Scann(List<String> instrucciones) {
        operaciones = new ArrayList<>();
        palabras = new ArrayList<>();

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
