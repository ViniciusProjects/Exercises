package devdojo.lacosrepeticao;

import java.util.Scanner;

public class Aula_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		int i = 0;
		while (i <= numero) {
			if (i % 2 != 0) {
				System.out.println("i + " + i);

			}
			i++;
		}

		sc.close();

	}

}
