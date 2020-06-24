package devdojo.condicionais;

import java.util.Scanner;

public class Aula_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sue idade: ");
		int idade = sc.nextInt();
		if (idade > 18) {
			System.out.println("Adulto");

		} else {
			System.out.println("Ainda não é adulto");
		}
		sc.close();
	}

}
