package devdojo.condicionais;

import java.util.Scanner;

public class Aula_26{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("number");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2: 
			System.out.println("Terça-Feira");
			break;
		case 3:
		System.out.println("Quarta-feira");
		break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia invalido");
			break;
			
		}
		
		}

}
