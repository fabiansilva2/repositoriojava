package fundamentos;

import java.util.Scanner;

public class InstanciandoOperadores {
	
	public static void main(String[] args) {
		
		Scanner operador = new Scanner(System.in);
		
		String soma, subtra��o, multiplica��o, divis�o;
						
		System.out.println("Informe o operador: ");
		soma = operador.next("+");
		subtra��o = operador.next("-");
		multiplica��o = operador.next("*");
		divis�o = operador.next("/");
		
		System.exit(0);
		
		operador.close();
				
		
		
	}

}
