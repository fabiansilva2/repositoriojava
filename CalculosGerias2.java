package fundamentos;

import java.util.Scanner;

public class CalculosGerias2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double n1, n2;
		double somar, subtrair, multiplicar, dividir;
		int op;

		System.out.println("Digite um numero: ");

		n1 = entrada.nextDouble();

		System.out.println("Digite outro numero: ");

		n2 = entrada.nextDouble();

		System.out.println("Informe o operador: ");
		System.out.println("[1] SOMA");
		System.out.println("[2] SUBTRA��O");
		System.out.println("[3] MULTIPLICA��O");
		System.out.println("[4] DIVIS�O");

		op = entrada.nextInt();

		switch (op) {
		case 1:
			somar = n1 + n2;
			System.out.println("O resultado �: " + somar);
			break;

		case 2:
			subtrair = n1 - n2;
			System.out.println("O resultado �: " + subtrair);
			break;

		case 3:
			multiplicar = n1 * n2;
			System.out.println("O resultado �: " + multiplicar);
			break;

		case 4:
			dividir = n1 / n2;
			System.out.println("O resultado �: " + dividir);
			break;

		default:
			System.out.println("Opera��o invalida!");

		}

		entrada.close();

	}
}
