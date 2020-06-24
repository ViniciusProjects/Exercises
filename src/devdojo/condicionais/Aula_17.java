package devdojo.condicionais;

import java.util.Scanner;

public class Aula_17 {

	public static void main(String[] args) {
		double impostoRenda = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salario");
		double salario = sc.nextDouble();
		if (salario < 1900.98) {
			System.out.println("Isento");

		} else if (salario >= 1903.99 && salario <= 2826.65) {
			impostoRenda = salario * 0.075 / 100;

		} else if (salario >= 2826.66 && salario <= 3751.05) {
			impostoRenda = salario * 0.15 / 100;

		} else if (salario >= 3751.06 && salario <= 4684.68) {
			impostoRenda = salario * 0.225 / 100;

		} else {
			impostoRenda = salario * 0.275 / 100;
		}
		System.out.println("Seu salario é: " + salario + "seu imposto é: " + impostoRenda);
		
		sc.close();
		
	}

}
