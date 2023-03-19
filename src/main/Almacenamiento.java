package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// A continuacion se leera el archivo y se guardara en una lista que sera utilizada mas adelante

public class Almacenamiento {
    private List<String> instrucciones;

    public Almacenamiento(String archivoLisp) {
        instrucciones = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLisp));
            String linea;
            while ((linea = br.readLine()) != null) { // Hasta que se lea una linea en blanco, se dejaran de agregar las lineas a la lista
                instrucciones.add(linea.trim());
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getInstrucciones() {
        return instrucciones;
    }
}