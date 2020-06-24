package devdojo.condicionais;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Aula_27 {

	public static void main(String[] args) {

		String conta = "CONTA POUPANCA";
		switch (conta) {
		case "CONTA POUPANCA":
			System.out.println("0.05%");
			break;
			
		case "CONTA CORRENTE":
			System.out.println("0.02%");
			break;
		case "CONTA INVESTIMENTO":
			System.out.println("0.1%");
			break;
		default:
			System.out.println("CONTA INEXISTENTE");
			break;
		}
	}

}
