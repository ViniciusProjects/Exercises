package devdojo.lacosrepeticao;

import java.util.Scanner;

public class Aula_32_2 {

	public static void main(String[] args) { // exercicio 2 da aula 34
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nomeUsuario = sc.next();
		System.out.println("Digite um número, " + nomeUsuario +"!");
		int numeroDigitado = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numeroDigitado * i);
		

		}
	}

}
