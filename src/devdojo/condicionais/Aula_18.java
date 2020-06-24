package devdojo.condicionais;

import java.util.Scanner;

public class Aula_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do participante:");
		String nome = sc.next();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		if (idade <= 10) {
			System.out.println("infantil");

		} else if (idade >= 11 && idade <= 15) {
			System.out.println("Juvenil");

		} else if (idade >= 16 && idade <= 19) {
			System.out.println("Pré adulto");

		} else if (idade >= 20) {
			System.out.println("Adulto");

		}

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

		sc.close();

	}
}
