package fundamentos;

import java.util.Scanner;

public class InstanciandoOperadores {
	
	public static void main(String[] args) {
		
		Scanner operador = new Scanner(System.in);
		
		String soma, subtração, multiplicação, divisão;
						
		System.out.println("Informe o operador: ");
		soma = operador.next("+");
		subtração = operador.next("-");
		multiplicação = operador.next("*");
		divisão = operador.next("/");
		
		System.exit(0);
		
		operador.close();
				
		
		
	}

}
