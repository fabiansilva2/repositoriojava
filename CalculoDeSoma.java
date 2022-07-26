package fundamentos;

import java.util.Scanner;

public class CalculoDeSoma {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double a, b, c = 0;

		System.out.println("Calculadora simples de soma");

		System.out.println("Digite um numero: ");
		a = entrada.nextDouble();

		System.out.println("Digite outro numero: ");
		b = entrada.nextDouble();

		c = a + b;
		System.out.println("O resultado da soma é: " + c);

		entrada.close();

	}

}
