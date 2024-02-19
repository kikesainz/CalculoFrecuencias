package com.kike.main;

import java.util.Random;
import java.util.Scanner;

import com.kike.utilidades.UtilidadesArray;

public class Principal {
	
	public static void main (String args[]) {
		
		int tamanhoArray = 100000;
		Scanner sc = new Scanner(System.in);
		UtilidadesArray utils = new UtilidadesArray();
		
		System.out.println("Por favor, introduzca un número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		int[] arrayResultados = new int[numero+1];
		int[] array = new int[tamanhoArray];
		
		utils.rellenaArray(tamanhoArray, numero, array);
		
		//Recorremos el array buscando números
		
		utils.calculaFrecuencias(arrayResultados, array);
		
		for (int i=0; i<arrayResultados.length; i++) {
			System.out.println("El número "+i+ " ha salido " + arrayResultados[i] + " veces");
		}
		
		utils.imprimeArray(array);
		
	}




	
	

}
