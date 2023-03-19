package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Almacenamiento {
    private List<String> instrucciones;

    public Almacenamiento(String archivoLisp) {
        instrucciones = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLisp));
            String linea;
            while ((linea = br.readLine()) != null) {
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