package main;

import java.util.Scanner;

import Main.DtoH;
import Main.HtoD;

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
