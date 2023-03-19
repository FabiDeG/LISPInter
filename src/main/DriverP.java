package main;

import java.util.List;
import java.util.Scanner;

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
			        List<String> operaciones = scannerP.getOperaciones();
			        List<String> palabras = scannerP.getPalabras();

			        System.out.println("Operaciones:");
			        for (String operacion : operaciones) {
			            System.out.println(operacion);
			        }

			        System.out.println("\nPalabras:");
			        for (String palabra : palabras) {
			            System.out.println(palabra);
			        }
					
					System.out.println("");
					System.out.println("Archivo subido");
					System.out.println("");
					System.out.println("");
					
				
			}break;
			
			case 2: {
				System.out.println("Ingresa el numero en hexadecimal: ");
			}break;
			}
			
		}while(opc != 2);
			
		

	}

}
