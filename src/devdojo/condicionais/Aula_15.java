package devdojo.condicionais;

public class Aula_15 {

	public static void main(String[] args) {

		float salario = 4100.50F;
		float resultado = 0F;

		if (salario > 4500) {
			resultado = salario * 0.3F;
			System.out.println("30% do valor: " + resultado);

		} else {

			resultado = salario * 0.15F;
			System.out.println("15% do valor: " + resultado);
		}

	}

}
