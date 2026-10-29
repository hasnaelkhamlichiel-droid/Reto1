package Reto1;

import java.util.Scanner;

public class Reto1 {
	public static Scanner teclado = new Scanner (System.in); 
	public static final int N=10;
	public static void main(String[] args) {
		// Declaro mi array 
		int [] matriz = new int [N];
		
		//Creo mi menu 
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		System.out.println("<              MENÚ              >");
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		System.out.println("<  1.Introduce un valor          >");
		System.out.println("<  2.Encuentra el valor          >");
		System.out.println("<  3.Elimina el valor            >");
		System.out.println("<  4.Encuentra el valor          >");
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		
		

		
		
		
		ingresarValor(matriz);
		
		
		
		teclado.close();
	}
	private static void ingresarValor(int[] matriz) {
		// Voy a pedir un número por teclado y lo guardo en l amatriz, mi array
		
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		
		
		
	}

}
