package devdojo.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aula_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário");
		double salario = sc.nextDouble();
		double porcentagem30 = 30;
		double calculoPorcentagem = salario * (porcentagem30 /100);
		System.out.println(calculoPorcentagem);

		sc.close();

	}

}
