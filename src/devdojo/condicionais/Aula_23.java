package devdojo.condicionais;

import java.util.Scanner;

public class Aula_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.next();
		System.out.println("Idade:");
		int idade = sc.nextInt();
		System.out.println("Sexo:");
		String sexo = sc.next();
		if (sexo.equalsIgnoreCase("masculino") && idade >= 18) {
			System.out.println("Alistamento obrigatorio");
		} else if (sexo.equalsIgnoreCase("masculino") && idade <= 17) {
			System.out.println("Alistamento não obrigatorio");
		} else if (sexo.equalsIgnoreCase("Feminino") && idade >= 18) {
			System.out.println("Deseja de alistar? " + nome);
			String ela = sc.next();
			if (ela.equalsIgnoreCase("Sim")) {
				System.out.println("Ok");

			} else if (sexo.equalsIgnoreCase("Feminino") && idade <= 17) {
				System.out.println("Alistamento não permitido");
			}

		}

	}

}
