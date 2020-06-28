package devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula_41 {

	public static void main(String[] args) {
		int[][] arrayMulti1 = new int[2][3];
//		arrayMulti1[0][0] = 22;
//		arrayMulti1[0][1] = 11;
//		arrayMulti1[0][2] = 51;
//		arrayMulti1[1][0] = 41;
//		arrayMulti1[1][1] = 56;
//		arrayMulti1[1][2] = 76;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayMulti1.length; i++) {

			for (int j = 0; j < arrayMulti1[i].length; j++) {
				System.out.println("Digite o valor da posição [" + i + "[" + j + "]");
				arrayMulti1[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < arrayMulti1.length; i++) {
			for (int j = 0; j < arrayMulti1.length; j++) {
				System.out.println("[" + i + "] [" + j + "]=" + arrayMulti1[i][j]);
			}
		}
		sc.close();
	}

}
