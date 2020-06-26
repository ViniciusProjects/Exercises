package devdojo.lacosrepeticao;

import java.util.Scanner;

public class Aula_03 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (menu != 3) {
			System.out.println("1 - Calcular Imposto");
			System.out.println("2 - Depositar Salario");
			System.out.println("3 - Sair");
			System.out.println("Escolha uma das opções acima: ");
			menu = sc.nextInt();

		}

	}
}
