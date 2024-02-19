package com.kike.utilidades;

import java.util.Random;
import java.util.Scanner;

public class UtilidadesArray {
	public  void imprimeArray( int[] array) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Quiere ud. imprimir el array to tocho? (SI/NO)");
		String respuesta = sc.nextLine();
		if (respuesta.equals("SI")) {
			for (int i=0; i<100000; i ++) {
				System.out.print(array[i] + " ");
				if ( (i != 0) && (i % 100 == 0)) {
					System.out.println(" ");
					System.out.println("LLevamos impresos " +i +" números. ¿Quiere continuar imprimiendo?");
					respuesta = sc.nextLine();
					if (respuesta.equals("SI")) continue;
					else break;
				}
				
			}
		}
		sc.close();
	}
	
	public  void calculaFrecuencias(int[] arrayResultados, int[] array) {
		for (int i=0; i<100000; i ++) {
			
			arrayResultados[array[i]]+=1;
		}
		
	}
	public static void rellenaArray(int tamanhoArray, int numero, int[] array) {
		Random r = new Random();
		for (int i = 0; i<tamanhoArray; i++) {
			array [i] = r.nextInt(numero+1);
		}
	}
	
}
