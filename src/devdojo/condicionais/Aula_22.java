package devdojo.condicionais;

import java.util.Scanner;

public class Aula_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String name = sc.next();
		System.out.println("login:");
		String login = sc.next();
		if (login == "" || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
			System.out.println("Usuario invalido");
		} else
			System.out.println(name  + " " + "Usuario cadastrado com sucesso");

		sc.close();

	}

}
