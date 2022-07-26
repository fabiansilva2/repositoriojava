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
		System.out.println("[2] SUBTRAÇÃO");
		System.out.println("[3] MULTIPLICAÇÃO");
		System.out.println("[4] DIVISÃO");

		op = entrada.nextInt();

		switch (op) {
		case 1:
			somar = n1 + n2;
			System.out.println("O resultado é: " + somar);
			break;

		case 2:
			subtrair = n1 - n2;
			System.out.println("O resultado é: " + subtrair);
			break;

		case 3:
			multiplicar = n1 * n2;
			System.out.println("O resultado é: " + multiplicar);
			break;

		case 4:
			dividir = n1 / n2;
			System.out.println("O resultado é: " + dividir);
			break;

		default:
			System.out.println("Operação invalida!");

		}

		entrada.close();

	}
}
