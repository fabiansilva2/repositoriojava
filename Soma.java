package fundamentos;

import java.util.Scanner;

public class Soma {
	
	public static void main(String[] args) {
		
		double a, b, c=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculo simples de soma");
		System.out.println("Insira os numeros: ");
		
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c= a+b;
		
		System.out.println("O Resultdo da Soma é: "+c);
		
		entrada.close();
		
			
	}

}
