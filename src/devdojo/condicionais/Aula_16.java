package devdojo.condicionais;

import java.util.Scanner;

public class Aula_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		double divisao = numero % 2;
		if (divisao == 0) {
			System.out.println("Par");

		} else {
			System.out.println("Impar");
		}
		sc.close();

	}
}