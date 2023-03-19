package main;
import java.util.ArrayList;
import java.util.List;

public class Pruebas {

	    private String nombre;
	    private List<Integer> elementos;

	    public Pruebas(String nombre, List<Integer> elementos) {
	        this.nombre = nombre;
	        this.elementos = elementos;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public List<Integer> getElementos() {
	        return elementos;
	    }

	    public static void main(String[] args) {
	        // Crear una lista principal que contendrá las listas con nombre
	        List<Pruebas> listas = new ArrayList<>();

	        // Crear una lista de elementos
	        List<Integer> elementos1 = new ArrayList<>();
	        elementos1.add(1);
	        elementos1.add(2);
	        elementos1.add(3);

	        // Crear una lista con nombre y agregarla a la lista principal
	        Pruebas lista1 = new Pruebas("lista1", elementos1);
	        listas.add(lista1);

	        // Crear otra lista de elementos
	        List<Integer> elementos2 = new ArrayList<>();
	        elementos2.add(4);
	        elementos2.add(5);
	        elementos2.add(6);

	        // Crear otra lista con nombre y agregarla a la lista principal
	        Pruebas lista2 = new Pruebas("lista2", elementos2);
	        listas.add(lista2);

	        // Recorrer la lista principal y mostrar los nombres y los elementos de cada lista
	        for (Pruebas lista : listas) {
	            System.out.println("Nombre de la lista: " + lista.getNombre());
	            System.out.println("Elementos de la lista: " + lista.getElementos());
	        }
	    }
	}