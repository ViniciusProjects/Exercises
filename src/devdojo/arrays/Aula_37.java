package devdojo.arrays;

import java.util.Scanner;

public class Aula_37 {

	public static void main(String[] args) {
		double [] notas = new double [4]; 
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("digite um número " + (i + 1));
			notas [i] = sc.nextDouble(); 	
		} 
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media = media + notas [i];
			System.out.println("Nota "  + (i + 1) + ": "  + notas[i]);
			System.out.println("----------------------------------------------------------------");
			
		}
		media = media /notas.length;
		System.out.println("Média das notas foram: " + media);
	
	}

}