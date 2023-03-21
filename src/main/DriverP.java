package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import verificador.AriOperations;
import verificador.vATOM;
import verificador.vDEFUN;
import verificador.vEQUAL;
import verificador.vLIST;
import verificador.vSETQ;

public class DriverP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		
		
		
		do {
			System.out.println("");
			System.out.println("    ▒▒▒▒▒_____▒▒▒▒▒                                                           ▒▒▒▒▒_____▒▒▒▒▒\r\n"
					+ "   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                                         ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
					+ "   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                                         ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
					+ "    ▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒                                                           ▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒\r\n"
					+ " ▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒   Hola, bienvenido a tu Interprete LISP favorito :) ▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒\r\n"
					+ " ▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒                                                     ▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒\r\n"
					+ "    ▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒                                                           ▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒\r\n"
					+ "   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                                         ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
					+ "     ▒▒▒▒▒    ▒▒▒▒▒                                                            ▒▒▒▒▒    ▒▒▒▒▒\r\n"
					+ "      ▒▒▒      ▒▒▒                                                              ▒▒▒      ▒▒▒\r\n"
					+ "");
			System.out.println("");
			System.out.println("");
			System.out.println("Deseas: \r\n"
					+ "1. Subir tu propio archivo \r\n"
					+ "2. Salir");
			
			String funcion = "";
			
			opc = Integer.parseInt(scanner.nextLine());
			
			switch (opc) {
			case  1: {
				
					System.out.println("");
					System.out.println("");
					System.out.println("El nombre de tu archivo es: Prueba.lisp");
					System.out.println(" ");
					System.out.println("Cargado archivo...");
					System.out.println(" ");
					System.out.println("Archivo subido :)");
					System.out.println(" ");

					String archivoLisp = "Prueba.lisp";
			        Almacenamiento driverP = new Almacenamiento(archivoLisp);
			        List<String> instrucciones = driverP.getInstrucciones();

			        Scann scannerP = new Scann(instrucciones);
			        List<String> operaciones = Scann.getOperaciones();
			        List<String> palabras = scannerP.getPalabras();
			        List<String> setqs = scannerP.getSetq();
			        List<String> defuns = scannerP.getDefun();
			        List<String> atoms = scannerP.getAtom();
			        List<String> conds = scannerP.getCond();
			        List<String> equals = scannerP.getEqual();
			        List<String> lists = scannerP.getList();

			        System.out.println("Operaciones:");
			        for (String operacion : operaciones) {
			        	AriOperations.operar(operacion);
			        }
			        
			        System.out.println("\nPalabras:");
			        for (String palabra : palabras) {
			            System.out.println(palabra);
			        }

			        System.out.println("\nSetq:");
			        for (String setq : setqs) {
			        	vSETQ.realizarS(setq);
			        }
			        
			        System.out.println("\nDefun:");
			        funcion = vDEFUN.recepcion(defuns).values().toString();
			        realizarS(funcion);
			        for (String defun : defuns) {
			            System.out.println(defun);
			        }
			        
			        System.out.println("\nCond:");
			        for (String cond : conds) {
			            System.out.println(cond);
			        }
			        
			        System.out.println("\nAtom:");
			        for (String atom : atoms) {
			        	vATOM.realizarA(atom);
			        }
			        
			        System.out.println("\nEqual:");
			        for (String equal : equals) {
			        	vEQUAL.realizarE(equal);
			        }
			        
			        System.out.println("\nList:");
			        for (String list : lists) {
			        	vLIST.realizarL(list);
			        }
					
					
					System.out.println("");
					System.out.println("");
					
				
			}break;
			
			case 2: {
				System.out.println("Adios, feliz dia");
			}break;
			
			}
			
		}while(opc != 2);
			
		

	}
	
	public static void realizarS(String funcion) {
		List<String> lista = new ArrayList<>();

        for (char c : funcion.toCharArray()) {
            lista.add(String.valueOf(c));
        }
		        List<String> instrucciones = lista;

		        Scann scannerP = new Scann(instrucciones);
		        List<String> operaciones = Scann.getOperaciones();
		        List<String> palabras = scannerP.getPalabras();
		        List<String> setqs = scannerP.getSetq();
		        List<String> defuns = scannerP.getDefun();
		        List<String> atoms = scannerP.getAtom();
		        List<String> conds = scannerP.getCond();
		        List<String> equals = scannerP.getEqual();
		        List<String> lists = scannerP.getList();

		        System.out.println("- Defun Operaciones:");
		        for (String operacion : operaciones) {
		        	AriOperations.operar(operacion);
		        }

		        System.out.println("\n- Defun Setq:");
		        for (String setq : setqs) {
		        	vSETQ.realizarS(setq);
		        }
		        
		        System.out.println("\n- Defun Defun:");
		        funcion = defuns.toString();
		        for (String defun : defuns) {
		            System.out.println(defun);
		        }
		        
		        System.out.println("\n- Defun Cond:");
		        for (String cond : conds) {
		            System.out.println(cond);
		        }
		        
		        System.out.println("\n- Defun Atom:");
		        for (String atom : atoms) {
		        	vATOM.realizarA(atom);
		        }
		        
		        System.out.println("\n- Defun Equal:");
		        for (String equal : equals) {
		        	vEQUAL.realizarE(equal);
		        }
		        
		        System.out.println("\n- Defun List:");
		        for (String list : lists) {
		        	vLIST.realizarL(list);
		        }
    }

}
