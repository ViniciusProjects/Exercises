package devdojo.lacosrepeticao;

import java.util.Scanner;

public class Aula_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String login = "vinicius";
		final String password = "123";
		boolean exibirTelaLogin = true;
		while (exibirTelaLogin) {
			System.out.println("Login:");
			String loginDigitado = sc.nextLine();
			System.out.println("Senha:");
			String passwordDigitado = sc.nextLine();
			if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
				System.out.println("ACESSO CONCEDIDO");
				exibirTelaLogin = false;
				break;

			}
			System.out.println("ACESSO NEGADO");

		}
		System.out.println("PROGRAMA TERMINADO");
	}
}
