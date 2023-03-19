package main;

import java.util.List;
import java.util.Scanner;
import verificador.AriOperations;

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
					+ "2. Escribirlo tu mismo \r\n");
			
			opc = Integer.parseInt(scanner.nextLine());
			
			switch (opc) {
			case  1: {
				
					System.out.println("");
					System.out.println("");
					System.out.println("El nombre de tu archivo es: CodeLisp");
					System.out.println("Cargado archivo...");
					
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
			            System.out.println(setq);
			        }
			        
			        System.out.println("\nDefun:");
			        for (String defun : defuns) {
			            System.out.println(defun);
			        }
			        
			        System.out.println("\nCond:");
			        for (String cond : conds) {
			            System.out.println(cond);
			        }
			        
			        System.out.println("\nAtom:");
			        for (String atom : atoms) {
			            System.out.println(atom);
			        }
			        
			        System.out.println("\nEqual:");
			        for (String equal : equals) {
			            System.out.println(equal);
			        }
			        
			        System.out.println("\nList:");
			        for (String list : lists) {
			            System.out.println(list);
			        }
					
					System.out.println("");
					System.out.println("Archivo subido");
					System.out.println("");
					System.out.println("");
					
				
			}break;
			
			case 2: {
				System.out.println("Perateee");
			}break;
			}
			
		}while(opc != 2);
			
		

	}

}
